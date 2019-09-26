package com.atmecs.testScripts;

import org.testng.annotations.Test;

import com.atmecs.constants.Locators;
import com.atmecs.constants.ValidatingData;
import com.atmecs.logReports.LogReport;
import com.atmecs.pages.HomePage;
import com.atmecs.pages.InsightFlowPage;
import com.atmecs.testflow.BlogPageFlow;

public class InsightsValidation {
	Locators locators = new Locators();
	static HomePage home = new HomePage();
	ValidatingData data = new ValidatingData();

	@Test(priority = 6)
	public void anchorRedirection() {

		LogReport.getlogger();
		BlogPageFlow.clickHeader();
		InsightFlowPage.validateContent();
	}

	@Test(priority = 7)
	public void ValidateErrorMsg() {

		BlogPageFlow.clickSubmit();
	}
}
