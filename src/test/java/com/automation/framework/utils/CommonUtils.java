package com.automation.framework.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.automation.framework.config.Lifecycle;

public class CommonUtils {
	
	public WebDriver driver;
	
	/**
	 * <p>Launches a Fresh instance of browser depending on the config parameters</p>
	 */
	public void launchBrowser() {
		if(Lifecycle.config.getProperty("browser").equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}else if(Lifecycle.config.getProperty("browser").equalsIgnoreCase("edge")) {
			//
		}
	}
	
	/**
	 * <p>Navigates to provided URL</p>
	 * @param url
	 */
	public void navigateTo(String url) {
		driver.get(url);
	}
	
	/**
	 * <p>Quits the active browser session</p>
	 */
	public void closeBrowser() {
		driver.quit();
	}

}
