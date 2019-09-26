package com.atmecs.testScripts;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.atmecs.constants.Locators;
import com.atmecs.constants.ValidatingData;
import com.atmecs.dataProvider.TestDataProvider;
import com.atmecs.logReports.LogReport;
import com.atmecs.pages.HomePage;
import com.atmecs.testBase.TestBase;
import com.atmecs.testflow.HomePageFlow;

public class ValidateAnchors extends TestBase {
	Logger log;
	Locators locators = new Locators();
	static HomePage home = new HomePage();
	ValidatingData data = new ValidatingData();

	@Test(priority = 4, dataProvider = "header1", dataProviderClass = TestDataProvider.class)
	public void isAnchorsPresent(String anchor) {
		log = Logger.getLogger(HomePagetestscripts.class);
		LogReport.getlogger();

		log.info("Starting Redirection validation");
		HomePageFlow.clickServices();
		home.ValidateAnchors(anchor);
	}

	@Test(priority = 5, dataProvider = "header2", dataProviderClass = TestDataProvider.class)
	public void isAnchorPresent(String anchor) {
		log = Logger.getLogger(HomePagetestscripts.class);
		LogReport.getlogger();

		log.info("Starting Redirection validation");
		HomePageFlow.clickInfra();
		home.ValidateAnchors(anchor);
	}
}
