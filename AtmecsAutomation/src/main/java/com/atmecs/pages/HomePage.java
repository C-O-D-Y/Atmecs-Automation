package com.atmecs.pages;

import org.testng.Assert;

import com.atmecs.constants.Locators;
import com.atmecs.constants.ValidatingData;
import com.atmecs.helpers.WebUtility;

//in this class, validation of different functionality is validated of the homepage of yatra.com flight bookings

public class HomePage {

	static Locators loc = new Locators();
	ValidatingData data = new ValidatingData();

	/**
	 * In this method i'm validating the functionality of redirecting the page is
	 * correct.
	 * 
	 * @param driver
	 */
	public void isRedirectionCorrect() {

		String title = WebUtility.getTitle();
		Assert.assertEquals(title, ValidatingData.getValidatingData("homepage_Title"));
		System.out.println("Redirection is on the correct page");
	}

	/**
	 * In this method i'm validating the functionality of return date button is
	 * displayed or not after you hit the round trip button
	 * 
	 * @param driver
	 */

	public void isFooterItemsPresent(String footer) {
		if (footer != null) {
			String text = WebUtility.getElement(Locators.getLocators("loc.btns.footerTags").replace("[xxxx]", footer));
			System.out.println(text);
			Assert.assertEquals(text, footer, "footer is not present");
		}
	}
	
	
	public void ValidateAnchors(String anchor) {
		String text = WebUtility.getElement(Locators.getLocators("loc.btns.footerTags").replace("[xxxx]", anchor));
		System.out.println(text);
		Assert.assertEquals(text, anchor, "footer is not present");
	}
}