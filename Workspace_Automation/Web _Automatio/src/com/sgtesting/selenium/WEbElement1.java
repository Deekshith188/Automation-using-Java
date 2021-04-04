package com.sgtesting.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;

public class WEbElement1 {
public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		NavigateURL();
		Login();
		MinimizeFly();
		createUser();
		DeleteUser();
		Logout();
		CloseApp();
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
	static void NavigateURL()
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
	static void Login()
	{
		try
		{
			WebElement login=oBrowser.findElement(By.id("username"));
			login.sendKeys("admin");
			WebElement login1=oBrowser.findElement(By.name("pwd"));
			login1.sendKeys("manager");
			WebElement login2=oBrowser.findElement(By.xpath("//*[@id='loginButton']/div"));
			login2.click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createUser()
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
			WebElement ele=oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_emailField\']"));
			ele.sendKeys("abc@gmail.com");
			WebElement ele2=oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_usernameField\']"));
			ele2.sendKeys("abcd");
			WebElement ele3=oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_passwordField\']"));
			ele3.sendKeys("efgh");
			WebElement ele4=oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_passwordCopyField\']"));
			ele4.sendKeys("efgh");
			Thread.sleep(4000);
			WebElement ele5=oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span"));
			ele5.click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void DeleteUser()
	{
		try
		{
			WebElement dele=oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]"));
			dele.click();
			
			Thread.sleep(4000);
			WebElement dele1=oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_deleteBtn\']"));
			dele1.click();
			Thread.sleep(4000);
			Alert oAlert=oBrowser.switchTo().alert();
			oAlert.accept();
			Thread.sleep(4000);
		}catch(Exception e)
		{
		e.printStackTrace();	
		}
	}
	static void Logout()
	{
		try
		{
			WebElement logout=oBrowser.findElement(By.linkText("Logout"));
			logout.click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void CloseApp()
	{
		try
		{
			oBrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void MinimizeFly()
	{
		try
		{
			WebElement mini=oBrowser.findElement(By.xpath("//*[@id=\'gettingStartedShortcutsPanelId\']"));
			mini.click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
