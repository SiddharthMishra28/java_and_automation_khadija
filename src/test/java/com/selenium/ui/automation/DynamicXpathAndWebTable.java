package com.selenium.ui.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpathAndWebTable {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/index.html");
		for(int i=2;i<=3; i++) {
			for(int j=1; j<=3; j++) {
				String data = driver.findElement(By.xpath("//tbody/tr["+i+"]/td["+j+"]")).getText();
//				String data = driver.findElement(By.cssSelector("tr:nth-of-type("+i+") > td:nth-of-type("+j+")")).getText();
				System.out.println(data);
			}
		}
		driver.quit();
	}
}
