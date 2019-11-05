package com.atmecs.constants;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 * In this class, grid connection is being done
 */
public class GridConnection {
	static public URL url;
	String nodeurl;

	/**
	 * In this method, hub is created
	 */
	public WebDriver getConnection(WebDriver driver, String browser) {
		nodeurl = "http://55.55.52.193:4444/wd/hub";

		DesiredCapabilities capability = new DesiredCapabilities();

		try {
			url = new URL(nodeurl);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

		capability.setBrowserName(browser);
		capability.setPlatform(Platform.WIN10);
		driver = new RemoteWebDriver(url, capability);
		driver.get("https://www.atmecs.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		return driver;
	}
}