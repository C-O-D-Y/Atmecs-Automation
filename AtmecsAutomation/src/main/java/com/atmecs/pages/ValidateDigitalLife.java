package com.atmecs.pages;

import org.apache.log4j.Logger;
import org.testng.Assert;

import com.atmecs.constants.Locators;
import com.atmecs.constants.ValidatingData;
import com.atmecs.helpers.WebUtility;

public class ValidateDigitalLife {
	Logger log;
	Locators locators = new Locators();
	static HomePage home = new HomePage();
	ValidatingData data = new ValidatingData();

	/**
	 * Methods used to validate the anchors present in the headers
	 * 
	 * @param anchor
	 */
	public void ValidateAnchors(String anchor) {
		String text = WebUtility.getElement(Locators.getLocators("loc.btns.footerTags").replace("[xxxx]", anchor));
		System.out.println(text);
		Assert.assertEquals(text, anchor, "anchor is not present");
	}
}
