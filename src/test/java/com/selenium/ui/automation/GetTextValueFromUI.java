package com.selenium.ui.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextValueFromUI {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
		String headerValue = driver.findElement(By.tagName("h1")).getText();
		System.out.println(headerValue);
		driver.quit();
	}
}
