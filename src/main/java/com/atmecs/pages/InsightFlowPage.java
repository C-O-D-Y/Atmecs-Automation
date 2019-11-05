package com.atmecs.pages;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

import org.testng.Assert;

import com.atmecs.constants.Locators;
import com.atmecs.constants.ValidatingData;
import com.atmecs.helpers.WebUtility;

public class InsightFlowPage {
	static Locators loc = new Locators();
	ValidatingData data = new ValidatingData();

	public static void getDate() {
		String date = WebUtility.getElement(Locators.getLocators("loc.btn.date"));
		DateFormat originalFormat = new SimpleDateFormat("MMMM dd, yyyy", Locale.ENGLISH);
		DateFormat targetFormat = new SimpleDateFormat("yyyyMMdd");
		date = targetFormat.format(originalFormat);
		String month[] = date.split(",");
	}

	public static void validateContent() {
		String text = WebUtility.getElement(Locators.getLocators("loc.content.txt"));
		Assert.assertEquals(text, (ValidatingData.getValidatingData("content")), "Content is not present");
	}
}
