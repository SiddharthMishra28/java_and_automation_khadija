package com.selenium.ui.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadDemo {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/FileUpload.html");
		driver.findElement(By.id("input-4")).sendKeys("C:\\Users\\Admin\\dev-workspace\\java_and_automation_khadija\\sample_upload.txt");
		driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div[1]/button[3]")).click();
		Thread.sleep(2000);
		driver.quit();
	}
}
