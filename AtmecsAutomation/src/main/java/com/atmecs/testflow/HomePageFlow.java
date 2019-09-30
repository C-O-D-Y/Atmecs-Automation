package com.atmecs.testflow;

import org.apache.log4j.BasicConfigurator;

import com.atmecs.constants.Locators;
import com.atmecs.helpers.WebUtility;

/**
 * class used to maintain the flow of the homepage of the Atmecs.com
 */
public class HomePageFlow {

	static Locators locaters = new Locators();

	/**
	 * Method used to click to the header and to the anchors to maintain the flow
	 */
	public static void clickHeader(String header) throws InterruptedException {
		BasicConfigurator.configure();
		System.out.println(Locators.getLocators("loc.btns.Header").replace("[xxxx]", header));
		WebUtility.clickElement(Locators.getLocators("loc.btns.Header").replace("[xxxx]", header));
	}

	/**
	 * Method used to click to the Services header and to the digital life anchor to
	 * maintain the flow
	 */
	public static void clickServices() {
		WebUtility.action(Locators.getLocators("loc.btn.services"));
		WebUtility.action(Locators.getLocators("loc.btn.digitalLife"));
	}

	/**
	 * Method used to click to the Services header and to infrastructure anchor to
	 * maintain the flow
	 */
	public static void clickInfra() {
		WebUtility.action(Locators.getLocators("loc.btn.services"));
		WebUtility.action(Locators.getLocators("loc.btns.infrastructureServics"));
	}
}
