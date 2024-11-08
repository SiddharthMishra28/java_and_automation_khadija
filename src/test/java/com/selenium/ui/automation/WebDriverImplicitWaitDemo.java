package com.selenium.ui.automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
// NOT RECOMMENDED
public class WebDriverImplicitWaitDemo {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		driver.findElement(By.id("btn1")).click();
		driver.findElement(By.id("txt1")).sendKeys("some text");
		Thread.sleep(3000);
		driver.quit();
	}
}
