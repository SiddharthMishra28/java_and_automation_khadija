package com.selenium.ui.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframesDemo {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.switchTo().frame("singleframe");
		driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("hello");
		Thread.sleep(3000);
		// Dynamic waits
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//li/a[@href='#Multiple']")).click();
		driver.quit();
	}
}
