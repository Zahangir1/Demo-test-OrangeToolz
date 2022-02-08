package com.orangeToolz.pageObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC_001_LoginPage {
	
	WebDriver driver=null;
	
	public TC_001_LoginPage(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	By emailField= By.xpath("//input[@id='email-1']");
	By passwordField= By.xpath("//input[@id='password-1']");
	By logIn= By.xpath("//button[@id='m_login_signin_submit']");
	By profile= By.xpath("/html[1]/body[1]/div[2]/div[1]/main[1]/aside[1]/div[1]/ul[1]/li[9]/a[1]/span[1]");
	By profile2= By.xpath("//a[@title='Profile']");
	By firstName= By.xpath("//input[@name='first_name']");
	
	
	
	public void enterEmail(String text) {
		driver.findElement(emailField).sendKeys(text);
		
	}
	
	public void enterPassword(String text) {
		driver.findElement(passwordField).sendKeys(text);
		
	}
	

	public void clickLogInButton() {
		driver.findElement(logIn).sendKeys(Keys.RETURN);
		
	}
	
	public void clickProfile() {
		new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(profile2)).click();
		
	}
	
	public String  verifyFirstName() {
		String text=driver.findElement(firstName).getAttribute("value");
		System.out.println("text is: "+text);
		return text;
	}
}
