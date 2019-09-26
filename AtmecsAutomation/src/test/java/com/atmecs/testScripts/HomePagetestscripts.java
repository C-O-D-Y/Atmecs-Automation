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

/*
*Class validates the functionality of homepage input boxes and buttons functionality
*/
public class HomePagetestscripts extends TestBase {
	Logger log;
	Locators locators = new Locators();
	static HomePage home = new HomePage();
	ValidatingData data = new ValidatingData();

	@Test(priority = 1)
	public void homePageRedirection() {

		LogReport.getlogger();

		home.isRedirectionCorrect();
	}

	// method validate the footer of the pages are present or not
	@Test(priority = 4, dataProvider = "footer2", dataProviderClass = TestDataProvider.class)
	public void validatefooterForServices(String footer) {

		WebUtility.explicitWait(Locators.getLocators("loc.btn.Services"));
		home.isFooterItemsPresent(footer);

	}

	@Test(priority = 2, dataProvider = "footer2", dataProviderClass = TestDataProvider.class)
	public void validatefooterForHome(String footer) {

		WebUtility.explicitWait(Locators.getLocators("loc.btn.Services"));
		home.isFooterItemsPresent(footer);

	}

	@Test(priority = 3)
	public void clickHeaderServices() {
		try {

			HomePageFlow.clickHeader("Services");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
