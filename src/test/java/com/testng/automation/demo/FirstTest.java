package com.testng.automation.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTest {
	
	WebDriver driver;
	
	// Lifecycle or Hooks
	
	@BeforeTest
	public void setupSteps() {
		driver = new ChromeDriver();
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method...");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class...");
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
