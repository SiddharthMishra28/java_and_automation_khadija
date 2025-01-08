package com.automation.framework.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CommonUtils {
	
	public WebDriver driver;
	
	public CommonUtils(WebDriver driver) {
		this.driver = driver;
	}
	
	/**
	 * <p>Navigates to provided URL</p>
	 * @param url
	 */
	public void navigateTo(String url) {
		driver.get(url);
	}
	
	/**
	 * <p>Clicks on the provided Webelement </p>
	 * @param element
	 */
	public void clickElement(By element) {
		driver.findElement(element).click();
	}
	
	/**
	 * <p>Types into provided Webelement </p>
	 * @param element
	 * @param keyStorkes
	 */
	public void type(By element, String keyStorkes) {
		driver.findElement(element).sendKeys(keyStorkes);
	}

}
