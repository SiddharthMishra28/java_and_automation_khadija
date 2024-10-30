package com.selenium.ui.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
	public static void main(String[] args) throws InterruptedException {
		// /html/body/form/label[2] - NOT RECOMMENDED!! - ABSOLUTE XPATH
		// //label[text()='Last Name'] - RECOMMENDED!! - RELATIVE XPATH
		// STANDARD SYNTAX - "//Tagname[@attribute=value]"
		// Example - //input[@name='email']
		// contains - //label[contains(text(), 'Name')] - PARTIAL TEXT MATCH
		// DYNAMIC XPATH
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9192838484");
		Thread.sleep(3000);
		driver.quit();
	}
}	
