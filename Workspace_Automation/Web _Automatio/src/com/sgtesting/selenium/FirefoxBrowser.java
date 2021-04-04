package com.sgtesting.selenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigateURL();
		//closeApplication();
		
	}
	static void launchBrowser() {
		try {
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.gecko.driver",path+"\\Library\\Drivers\\geckodriver.exe");
			oBrowser=new FirefoxDriver();
			Thread.sleep(4000);
			
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	static void navigateURL() {
		try {
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(4000);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	static void login(){
		{
			try
			{
				
			}catch (Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	static void closeApplication()
	{
		try
		{
			oBrowser.close();
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
