package com.atmecs.testScripts;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.atmecs.constants.Locators;
import com.atmecs.constants.ValidatingData;
import com.atmecs.helpers.WebUtility;
import com.atmecs.logReports.LogReport;
import com.atmecs.pages.HomePage;
import com.atmecs.pages.InsightPage;
import com.atmecs.testBase.TestBase;
import com.atmecs.testflow.BlogPageFlow;

public class InsightsValidation extends TestBase {
	Locators locators = new Locators();
	static HomePage home = new HomePage();
	ValidatingData data = new ValidatingData();

	Logger log;

	@Test(priority = 20)
	public void anchorRedirection() {
		log = Logger.getLogger(InsightsValidation.class);
		logger = extent.startTest("Anchor validation");
		LogReport.getlogger();
		BlogPageFlow.clickHeader();
		InsightPage.validateContent();
	}

	@Test(priority = 21)
	public void validateDate() {
		log = Logger.getLogger(InsightsValidation.class);
		logger = extent.startTest("Date validation");
		LogReport.getlogger();

		InsightPage.validateDateDifference();
	}

	@Test(priority = 22)
	public void validateTitle() {
		log = Logger.getLogger(InsightsValidation.class);
		logger = extent.startTest("Blog Title validation");
		LogReport.getlogger();

		InsightPage.validateBlogTitle();
	}

	@Test(priority = 23)
	public void validateBreadCrumb() {
		log = Logger.getLogger(InsightsValidation.class);
		logger = extent.startTest("breadcrumb validation");
		LogReport.getlogger();

		InsightPage.validateBreadcrumb();
	}

	@Test(priority = 24)
	public void ValidateErrorMsg() {

		WebUtility.scrollDownPage(0, 2900);
		BlogPageFlow.clickSubmit();
		String required = WebUtility.getAttribute("//textarea[@id='comment']");
		Assert.assertEquals(required, ValidatingData.getValidatingData("commentAlert"),
				"Error msg functionality not correct");
	}
}
