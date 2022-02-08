package com.orangeToolz.testCases;

import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.orangeToolz.base.BaseCases;
import com.orangeToolz.pageObject.TC_001_LoginPage;

public class TC_001_TestCase extends BaseCases {
	
public static String baseUrl="http://159.89.38.11/login";
	
	@Test
	public static void verifyTitle() throws InterruptedException 
	{
		driver.get(baseUrl);
		new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		TC_001_LoginPage loginPage =new TC_001_LoginPage(driver);
		
		loginPage.enterEmail("test@orangetoolz.com");
		Thread.sleep(3000);
		
		loginPage.enterPassword("8Kh8nTe*^jdk");
		Thread.sleep(3000);
		
		loginPage.clickLogInButton();
		Thread.sleep(6000);
		
		loginPage.clickProfile();
		Thread.sleep(10000);
		
		loginPage.clickProfile();
		Thread.sleep(10000);
		
		String FirstNameToCheck=loginPage.verifyFirstName();
		String actualFirstName="al qw2new";
		
		System.out.println("The actual first name of the site is: "+ FirstNameToCheck);
		System.out.println("The first name in the site is: "+ actualFirstName);
		
		Assert.assertEquals(FirstNameToCheck, actualFirstName);
		Thread.sleep(5000);
		
		
	}
}
