package com.selenium.ui.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TypeIntoFieldDemo {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Selenium");
		driver.findElement(By.name("btnK")).click();
		Thread.sleep(3000);
		driver.quit();
	}
}
