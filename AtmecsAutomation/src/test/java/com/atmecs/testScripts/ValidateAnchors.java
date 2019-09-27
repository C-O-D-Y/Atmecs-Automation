package com.atmecs.testScripts;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.atmecs.constants.Locators;
import com.atmecs.constants.ValidatingData;
import com.atmecs.dataProvider.TestDataProvider;
import com.atmecs.helpers.WebUtility;
import com.atmecs.logReports.LogReport;
import com.atmecs.pages.HomePage;
import com.atmecs.testBase.TestBase;
import com.atmecs.testflow.HomePageFlow;

public class ValidateAnchors extends TestBase {
	Logger log;
	Locators locators = new Locators();
	static HomePage home = new HomePage();
	ValidatingData data = new ValidatingData();

	@Test(priority = 16)
	public void moveToDigitalLife() {
		log = Logger.getLogger(HomePagetestscripts.class);
		LogReport.getlogger();
		logger = extent.startTest("Validating anchors of the Digital life page");
		log.info("Starting Anchors tag validation");
		HomePageFlow.clickServices();

	}

	@Test(priority = 17, dataProvider = "header1", dataProviderClass = TestDataProvider.class)
	public void isDigitalLifeAnchorPresent(String anchor) {
		home.ValidateAnchors(anchor);
	}

	@Test(priority = 19, dataProvider = "header2", dataProviderClass = TestDataProvider.class)
	public void isInfrastructureAnchorPresent(String anchor) {

		home.ValidateAnchors(anchor);
	}

	@Test(priority = 18)
	public void moveToInfrastructure() {
		log = Logger.getLogger(HomePagetestscripts.class);
		LogReport.getlogger();

		log.info("Starting Redirection validation");
		HomePageFlow.clickInfra();
	}
}
