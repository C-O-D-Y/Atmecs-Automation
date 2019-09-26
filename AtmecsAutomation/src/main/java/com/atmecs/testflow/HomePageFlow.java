package com.atmecs.testflow;

import org.apache.log4j.BasicConfigurator;

import com.atmecs.constants.Locators;
import com.atmecs.helpers.WebUtility;

/**
 * class used to maintain the flow of the homepage of the Atmecs.com
 */
public class HomePageFlow {

	/**
	 * Method used to give input to the city for departure and round trip
	 */
	static Locators locaters = new Locators();

	public static void clickHeader(String header) throws InterruptedException {
		BasicConfigurator.configure();
		System.out.println(Locators.getLocators("loc.btns.Header").replace("[xxxx]", header));
		WebUtility.clickElement(Locators.getLocators("loc.btns.Header").replace("[xxxx]", header));
		WebUtility.explicitWait("loc.btn.Sitemap");
	}

	public static void clickServices() {
		WebUtility.action(Locators.getLocators("loc.btn.services"));
		WebUtility.action(Locators.getLocators("loc.btn.digitalLife"));
	}

	public static void clickInfra() {
		WebUtility.action(Locators.getLocators("loc.btn.services"));
		WebUtility.action(Locators.getLocators("loc.btns.infrastructureServics"));
	}
}
