package com.sgtesting.actitime;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Assignment3 {
	public static WebDriver oBrowser=null;
	@BeforeSuite
	static void LaunchBrowser_NavigateURL()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "E:\\SeleniumAutomation\\Automation\\TestNG\\Library\\Drivers\\chromedriver.exe" );
			oBrowser = new ChromeDriver();
			oBrowser.manage().window().maximize();
			Thread.sleep(4000);
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test
	static void AA_Login()
	{
		try
		{
			WebElement login=oBrowser.findElement(By.id("username"));
			login.sendKeys("admin");
			WebElement login1=oBrowser.findElement(By.name("pwd"));
			login1.sendKeys("manager");
			WebElement LgI=oBrowser.findElement(By.xpath("//*[@id='loginButton']/div"));
			LgI.click();
			Thread.sleep(4000);
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(4000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test
	static void BB_createUser()
	{
		try
		{
			WebElement owebelement=oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]"));
			owebelement.click();
			Thread.sleep(4000);
			WebElement owebelement1=oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]"));
			owebelement1.click();
			Thread.sleep(4000);
			WebElement owebelement2=oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_firstNameField']"));
			owebelement2.sendKeys("User1");
			WebElement owebelement3=oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_lastNameField']"));
			owebelement3.sendKeys("user");
			WebElement owebelement4=oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_emailField\']"));
			owebelement4.sendKeys("abc@gmail.com");
			WebElement owebelement5=oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_usernameField\']"));
			owebelement5.sendKeys("abcd");
			WebElement owebelement6=oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_passwordField\']"));
			owebelement6.sendKeys("efgh");
			WebElement owebelement7=oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_passwordCopyField\']"));
			owebelement7.sendKeys("efgh");
			Thread.sleep(4000);
			WebElement owebelement8=oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span"));
			owebelement8.click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test
	static void CC_ModifyUser()
	{
		try
		{
			WebElement Modi=oBrowser.findElement(By.xpath("//span[text()='LN, User1']"));
			Modi.click();
			Thread.sleep(4000);
			WebElement Modify=oBrowser.findElement(By.name("lastName"));
			Modify.sendKeys("Modified");
			Thread.sleep(4000);
			WebElement Modify1=oBrowser.findElement(By.id("userDataLightBox_commitBtn"));
			Modify1.click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test
	static void DD_DeleteUser()
	{
		try
		{
			WebElement webele=oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]"));
			webele.click();
			Thread.sleep(4000);
			WebElement webele1=oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_deleteBtn\']"));
			webele1.click();
			Thread.sleep(4000);
			Alert oAlert=oBrowser.switchTo().alert();
			oAlert.accept();
			Thread.sleep(4000);
		}catch(Exception e)
		{
		e.printStackTrace();	
		}
	}
	@AfterSuite
	static void eLogout()
	{
		try
		{
			WebElement Log=	oBrowser.findElement(By.linkText("Logout"));
			Log.click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@AfterSuite
	static void fCloseApp()
	{
		try
		{
			oBrowser.close();
		}catch(Exception e)
		{
		e.printStackTrace();
		}
	}
}
