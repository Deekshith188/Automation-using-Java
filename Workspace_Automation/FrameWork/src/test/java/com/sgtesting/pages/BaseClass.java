package com.sgtesting.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.sgtesting.utility.BrowserFactory;

public class BaseClass {
	
	
	public  WebDriver driver;
	
	@BeforeClass

	public void setup()
	{
		driver=BrowserFactory.startApplication(driver, "Chrome", "http://localhost/login.do");
		System.out.println(driver.getTitle());
		
	}
	@AfterClass()
	public void tearDown()
	{

		BrowserFactory.quitBrowser(driver);
	}
	

}
