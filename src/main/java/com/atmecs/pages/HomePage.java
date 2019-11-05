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
	 * In this method i'm validating the footer is displayed or not after you hit
	 * the any header button
	 * 
	 * @param footer
	 */

	public void isFooterItemsPresent(String footer) {
		if (footer != null) {
			String text = WebUtility.getElement(Locators.getLocators("loc.btns.footerTags").replace("[xxxx]", footer));
			System.out.println(text);
			Assert.assertEquals(text, footer, "footer is not present");
		}
	}

	/**
	 * In this method i'm validating the anchors is present or not in the specific
	 * header.
	 * 
	 * @param anchor
	 */
	public void ValidateAnchors(String anchor) {
		if (anchor != null) {
			String text = WebUtility.getElement(Locators.getLocators("loc.btns.footerTags").replace("[xxxx]", anchor));
			System.out.println(text);
			Assert.assertEquals(text, anchor, "footer is not present");
		}
	}
}
