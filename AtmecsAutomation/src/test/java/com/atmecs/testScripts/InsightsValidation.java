package com.atmecs.testScripts;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.atmecs.constants.Locators;
import com.atmecs.constants.ValidatingData;
import com.atmecs.helpers.WebUtility;
import com.atmecs.logReports.LogReport;
import com.atmecs.pages.HomePage;
import com.atmecs.pages.InsightPage;
import com.atmecs.testBase.TestBase;
import com.atmecs.testflow.BlogPageFlow;

/**
 * Class validates the validation of the insight page anchors
 */
public class InsightsValidation extends TestBase {
	Locators locators = new Locators();
	static HomePage home = new HomePage();
	ValidatingData data = new ValidatingData();

	Logger log;

	// Validates the anchor validation redirection and content validation
	@Test(priority = 20)
	public void anchorRedirection() {
		log = Logger.getLogger(InsightsValidation.class);
		logger = extent.startTest("Anchor validation");
		LogReport.getlogger();
		BlogPageFlow.clickHeader();
		InsightPage.validateContent();
	}

	// Validates the anchor validation date difference
	@Test(priority = 21)
	public void validateDate() {
		log = Logger.getLogger(InsightsValidation.class);
		logger = extent.startTest("Date validation");
		LogReport.getlogger();

		InsightPage.validateDateDifference();
	}

	// validating the title of the blog page
	@Test(priority = 22)
	public void validateTitle() {
		log = Logger.getLogger(InsightsValidation.class);
		logger = extent.startTest("Blog Title validation");
		LogReport.getlogger();

		InsightPage.validateBlogTitle();
	}

	// validatng the breadcrumb of the blog page
	@Test(priority = 23)
	public void validateBreadCrumb() {
		log = Logger.getLogger(InsightsValidation.class);
		logger = extent.startTest("breadcrumb validation");
		LogReport.getlogger();

		InsightPage.validateBreadcrumb();
	}

	// Validating the error msg functionality of the comment bar
	@Test(priority = 24)
	public void validateErrorMsg() {

		WebUtility.scrollDownPage(0, 4500);
		BlogPageFlow.clickSubmit();
		InsightPage.ValidateErrorMsg();

	}
}
