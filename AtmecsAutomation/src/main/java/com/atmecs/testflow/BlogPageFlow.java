package com.atmecs.testflow;

import com.atmecs.constants.Locators;
import com.atmecs.helpers.WebUtility;

public class BlogPageFlow {
	public static void clickHeader() {

		WebUtility.action(Locators.getLocators("loc.btn.insights"));
		WebUtility.clickElement(Locators.getLocators("loc.btn.blogs"));
		WebUtility.clickElement(Locators.getLocators("loc.img.blog"));
	}

	public static void clickSubmit() {

		WebUtility.clickElement(Locators.getLocators("loc.btn.postComment"));
	}
}
