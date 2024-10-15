package com.selenium.ui.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectFromDropdownDemo {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
		driver.findElement(By.id("RESULT_TextField-1")).sendKeys("sid");
		// Locate the Element where the dropdown exists
		// Pass the element to the Select class
		Select bestTimeToContactDropdown = new Select(driver.findElement(By.name("RESULT_RadioButton-9")));
		bestTimeToContactDropdown.selectByVisibleText("Evening");
		Thread.sleep(3000);
		driver.quit();
	}
}
