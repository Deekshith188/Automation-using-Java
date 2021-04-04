package com.sgtesting.utility;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	public static WebDriver startApplication(WebDriver driver,String browsername,String appUrl) {
		if(browsername.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "E:\\Workspace_Automation\\FrameWork\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			
		}
		driver.manage().window().maximize();
		driver.get(appUrl);
		
		
		return driver;
		
	}
	public static void quitBrowser(WebDriver driver)
	{
		driver.quit();
		
		
	}

}


