package com.sgtesting.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutWebElement {

	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigateURL();
		login();

	}
	static void launchBrowser()
	{
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oBrowser.manage().window().maximize();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void navigateURL()
	{
		try
		{
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("DemoUser1");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("username")).clear();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("username")).sendKeys("DemoUser2");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("username")).clear();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("username")).sendKeys("DemoUser3");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("username")).clear();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("username")).sendKeys("DemoUser444");
			Thread.sleep(2000);
			String text=oBrowser.findElement(By.id("username")).getAttribute("value");
			System.out.println(text);
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}


