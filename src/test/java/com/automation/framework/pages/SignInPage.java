package com.automation.framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.automation.framework.utils.CommonUtils;

public class SignInPage extends CommonUtils {
	
	public By singInLink = By.xpath("//span[text()='Sign in']");
	public By signInEmailField = By.id("field-email");
	public By passwordField = By.id("field-password");
	
	public SignInPage(WebDriver driver) {
		super(driver);
	}
	
	public void signIn(String url, String username, String password) {
		navigateTo(url);
		clickElement(singInLink);
		type(signInEmailField, username);
		type(passwordField, password);
	}
}
