package com.atmecs.pages;

import org.testng.Assert;

import com.atmecs.constants.Locators;
import com.atmecs.constants.ValidatingData;
import com.atmecs.helpers.WebUtility;
import com.atmecs.testflow.BlogPageFlow;

public class InsightPage {
	static Locators loc = new Locators();
	ValidatingData data = new ValidatingData();

	public static void validateContent() {

		String text = WebUtility.getElement(Locators.getLocators("loc.content.txt"));
		Assert.assertEquals(text, (ValidatingData.getValidatingData("content")), "Content is not present");
	}

	public static void validateDateDifference() {
		int dateDifference = BlogPageFlow.getDate();
		Assert.assertFalse(dateDifference < 3);

	}

	public static void validateBlogTitle() {

		String title = WebUtility.getElement(Locators.getLocators("loc.title.blog"));

		Assert.assertEquals(title, ValidatingData.getValidatingData("Blog_Title"), "Not landed on a right page");
	}

	public static void validateBreadcrumb() {
		String breadCrumb1 = WebUtility.getElement(Locators.getLocators("loc.btn.breadcrumb1"));
		Assert.assertEquals(breadCrumb1, ValidatingData.getValidatingData("breadcrumb1"),
				"Incorrect order of the breadcrumb");
		String breadCrumb2 = WebUtility.getElement(Locators.getLocators("loc.btn.breadcrumb2"));
		Assert.assertEquals(breadCrumb2, ValidatingData.getValidatingData("breadcrumb2"),
				"Incorrect order of the breadcrumb");

	}

	public static void main(String[] args) {

	}
}
