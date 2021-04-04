package com.sgtesting.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static WebDriver oBrowser = null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		createUser();
		modifyUser();
		DeleteUser();
		logout();
		close();

	}

	static void launchBrowser() {

		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumAutomation\\Automation\\Web _Automatio\\Library\\Drivers\\chromedriver.exe" );
		oBrowser = new ChromeDriver();
		oBrowser.manage().window().maximize();

	}

	static void navigate() {

		try 
		{
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	static void login() {
		try 
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(2000);

			oBrowser.findElement(By.id("gettingStartedShortcutsMenuCloseId")).click();
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	static void createUser() {

		try 
		{
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div")).click();	
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("Deek");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("lastName")).sendKeys("B U");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("email")).sendKeys("User1@gmail.com");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("username")).sendKeys("Kumar");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("User1");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("User1");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_commitBtn")).click();
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	static void modifyUser()
	{
		try 
		{
			oBrowser.findElement(By.xpath("//span[text()='LN, User1']")).click();
			Thread.sleep(4000);			
			oBrowser.findElement(By.name("lastName")).sendKeys(" Modified");
			Thread.sleep(4000);			
			oBrowser.findElement(By.id("userDataLightBox_commitBtn")).click();
			Thread.sleep(4000);


		} catch (Exception e) {
		}
	}

	static void DeleteUser() {

		try
		{
			oBrowser.findElement(By.xpath("//span[text()='LN Modified, User1']")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(4000);
			Alert oAlert=oBrowser.switchTo().alert();
			oAlert.accept();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

	static void logout() {

		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

	static void close() {

		oBrowser.close();

	}

}
