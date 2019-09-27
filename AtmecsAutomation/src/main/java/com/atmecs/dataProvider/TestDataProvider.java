package com.atmecs.dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.atmecs.constants.FilePath;
import com.atmecs.pages.HomePage;
import com.atmecs.utils.ProvideExcelData;

/**
 * In this class, data is given from the dataprovider
 */
public class TestDataProvider {

	HomePage home = new HomePage();

	/**
	 * In this method, getting the data of the city into object array and returning
	 * to the calling method
	 */

	@DataProvider(name = "header")
	public Object[][] getHeader() {
		ProvideExcelData provideData = new ProvideExcelData(FilePath.TESTDATA_FILE, 0);
		Object[][] getData = provideData.provideExcelData();
		return getData;
	}

	@DataProvider(name = "header1")
	public Object[][] getOption1() {
		ProvideExcelData provideData = new ProvideExcelData(FilePath.TESTDATA_FILE, 1);
		Object[][] getData = provideData.provideExcelData();
		return getData;
	}

	@DataProvider(name = "header2")
	public Object[][] getOption2() {
		ProvideExcelData provideData = new ProvideExcelData(FilePath.TESTDATA_FILE, 2);
		Object[][] getData = provideData.provideExcelData();
		return getData;
	}

	@DataProvider(name = "header3")
	public Object[][] getCityData() {
		ProvideExcelData provideData = new ProvideExcelData(FilePath.TESTDATA_FILE, 3);
		Object[][] getData = provideData.provideExcelData();
		return getData;
	}

	@DataProvider(name = "footer2")
	public Object[][] getfooter() {
		ProvideExcelData provideData = new ProvideExcelData(FilePath.TESTDATA_FILE, 4);
		Object[][] getData = provideData.provideExcelData();
		return getData;
	}

	/**
	 * In this method, getting the data of the passengers details into object array
	 * and returning to the calling method
	 */
	@Test(priority = 2, dataProvider = "footer2", dataProviderClass = TestDataProvider.class)
	public void validatefooter(String footer, String footer1) {
		System.out.println(footer);
		System.out.println(footer1);

	}
}