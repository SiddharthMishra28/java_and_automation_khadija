package com.automation.framework.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.automation.framework.utils.CommonUtils;

public class Lifecycle {
	
	public static Properties config;
	public WebDriver driver;
	public CommonUtils utils = new CommonUtils();
	
	@BeforeSuite
	public void beforeSuite() {
		readConfig("src/test/resources/config.properties");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class..");
	}
	
	@BeforeTest
	public void beforeTest() {
		utils.launchBrowser();
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method..");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method..");
	}
	
	@AfterTest
	public void afterTest() {
		utils.closeBrowser();
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After Class..");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite..");
	}
	
	/**
	 * <p>This method reads the configuration file and loads the same into memory</p>
	 * @param path
	 */
	public static void readConfig(String path) {
		try {
			FileInputStream fis = new FileInputStream(new File(path));
		    config = new Properties();
			config.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
