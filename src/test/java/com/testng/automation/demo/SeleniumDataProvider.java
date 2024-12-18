package com.testng.automation.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SeleniumDataProvider {
	
	WebDriver driver;
	
	@BeforeTest
	public void setupSteps() {
		driver = new ChromeDriver();
	}
	
	@Test(dataProvider = "credentials")
	public void loginTest(String userId, String password) throws InterruptedException {
		driver.get("https://demo.guru99.com/V1/index.php");
		driver.findElement(By.name("uid")).sendKeys(userId);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("btnLogin")).click();
		Thread.sleep(1000);
		String pageTitle = driver.getTitle();
		Assert.assertEquals(pageTitle, "GTPL Bank Manager HomePage");
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
	@DataProvider(name = "credentials")
	public String[][] userCredentialsProvider() {
		return new String[][] {
			{"mngr604499", "tasAruz"},
			{"dksajda", "tasAruz"},
			{"mngr604499", "sdsadad"},
			{"hsadkhsad", "hskdsad"}
		};
	}
}
