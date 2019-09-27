package com.atmecs.testflow;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

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

	@SuppressWarnings("deprecation")
	public static int getDate() {

		String string = WebUtility.getElement(Locators.getLocators("loc.btn.blogDate"));
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
		LocalDate localDate = LocalDate.parse(string, formatter);
		System.out.println(localDate); // 2010-01-02

		String local[] = (localDate + "").split("-");

		String day = Calendar.getInstance().getTime() + "";
		Date date = new Date();
		int month = date.getMonth() + 1;
//		System.out.println(day);// 5 2 1 Fri Sep 27 14:28:35 IST 2019
		String[] date1 = day.split(" ");
		String systemDate = date1[5] + month + date1[2];
		System.out.println(systemDate);
		int monthDifference = Integer.parseInt(date1[5]) - month;
		if (monthDifference < 0) {
			monthDifference = 12 - monthDifference;
		}

		int yearDifference = Integer.parseInt(local[0]) - Integer.parseInt(date1[5]);
		if (yearDifference > 0) {
			int difference = yearDifference * 12;
			monthDifference = monthDifference + difference;
		}
		return monthDifference;
	}
}
