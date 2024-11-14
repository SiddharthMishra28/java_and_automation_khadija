package com.testng.automation.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTest {
	
	WebDriver driver;
	
	@BeforeTest
	public void setupSteps() {
		driver = new ChromeDriver();
	}
	
	@Test
	public void login_test() {
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		Assert.assertEquals(title, "Yahoo");
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
