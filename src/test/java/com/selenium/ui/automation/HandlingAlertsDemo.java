package com.selenium.ui.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlertsDemo {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		// ALERT WITH OK BUTTON ONLY
//		driver.findElement(By.className("btn-danger")).click();
//		driver.switchTo().alert().accept(); // switches the context to javascript alert
//		driver.findElement(By.xpath("a[@href='#CancelTab']")).click();
		
		// ALERT WITH OK AND CANCEL
//		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click(); // NOT RECOMMENDED!
//		driver.findElement(By.className("btn-primary")).click();
//		driver.switchTo().alert().accept();
//		String data1 = driver.findElement(By.id("demo")).getText();
//		System.out.println(data1);
//		driver.findElement(By.className("btn-primary")).click();
//		driver.switchTo().alert().dismiss();
//		String data2 = driver.findElement(By.id("demo")).getText();
//		System.out.println(data2);
		
		// ALERT WITH INPUT BOX
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
		driver.findElement(By.className("btn-info")).click();
		driver.switchTo().alert().sendKeys("Sid");
		driver.switchTo().alert().accept();
		String data3 = driver.findElement(By.id("demo1")).getText();
		System.out.println(data3);
		Thread.sleep(2000);
		driver.quit();
	}
}
