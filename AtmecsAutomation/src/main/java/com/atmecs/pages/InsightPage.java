package com.atmecs.pages;

import org.testng.Assert;

import com.atmecs.constants.Locators;
import com.atmecs.constants.ValidatingData;
import com.atmecs.helpers.WebUtility;
import com.atmecs.testflow.BlogPageFlow;

/**
 * Class validates the insights-Blogs page with different functionality of the
 * buttons and anchors
 */
public class InsightPage {
	static Locators loc = new Locators();
	ValidatingData data = new ValidatingData();

	/**
	 * Method validates the content is present inside the blog or not
	 */
	public static void validateContent() {

		String text = WebUtility.getElement(Locators.getLocators("loc.content.txt"));
		Assert.assertEquals(text, (ValidatingData.getValidatingData("content")), "Content is not present");
	}

	/**
	 * Method validates the date difference between blog posting date and system
	 * date is 3 months old or not.
	 */
	public static void validateDateDifference() {
		int dateDifference = BlogPageFlow.getDate();
		Assert.assertFalse(dateDifference < 3);

	}

	/**
	 * Method validates the title of the blog.
	 */
	public static void validateBlogTitle() {

		String title = WebUtility.getElement(Locators.getLocators("loc.title.blog"));

		Assert.assertEquals(title, ValidatingData.getValidatingData("Blog_Title"), "Not landed on a right page");
	}

	/**
	 * Method validates the breadcrumbs in the blog.
	 */
	public static void validateBreadcrumb() {
		String breadCrumb1 = WebUtility.getElement(Locators.getLocators("loc.btn.breadcrumb1"));
		Assert.assertEquals(breadCrumb1, ValidatingData.getValidatingData("breadcrumb1"),
				"Incorrect order of the breadcrumb");
		String breadCrumb2 = WebUtility.getElement(Locators.getLocators("loc.btn.breadcrumb2"));
		Assert.assertEquals(breadCrumb2, ValidatingData.getValidatingData("breadcrumb2"),
				"Incorrect order of the breadcrumb");

	}

	/**
	 * Method validates the breadcrumbs in the blog.
	 */
	public static void ValidateErrorMsg() {

		String required = WebUtility.getAttribute(Locators.getLocators("loc.hidden.msg"), "required");
		Assert.assertEquals(required, ValidatingData.getValidatingData("commentAlert"),
				"Error msg functionality not correct");
	}
}
