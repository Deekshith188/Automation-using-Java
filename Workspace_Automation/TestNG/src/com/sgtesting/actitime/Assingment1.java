package com.sgtesting.actitime;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Assingment1 {

	public static WebDriver oBrowser = null;


	@BeforeClass
	static void A_launchBrowser() {
		

		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumAutomation\\Automation\\TestNG\\Library\\Drivers\\chromedriver.exe" );
		oBrowser = new ChromeDriver();
		oBrowser.manage().window().maximize();

	}

	@Test
	static void B_navigate() {
		

		try 
		{
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(2000);

		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

	@Test
	static void C_login() {

		try 
		{

			oBrowser.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("gettingStartedShortcutsMenuCloseId")).click();
			Thread.sleep(2000);

		} catch (Exception e) 
		{	
			e.printStackTrace();
		}
	}


	@Test
	static void D_createUser() 
	{

		try 
		{
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("firstname");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("lastName")).sendKeys("lastname");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("email")).sendKeys("Name@gmail.com");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("username")).sendKeys("User1_username");
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



	@Test
	static void E_modifyUser()
	{
		try 
		{
			oBrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_firstNameField']")).clear();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_firstNameField']")).sendKeys("NewName");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div")).click();
			


		} catch (Exception e) {
		}
	}

	@Test
	static void F_DeleteUser() {

		try
		{
			oBrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_deleteBtn']")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

	@Test

	static void G_logout() {

		try
	{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(4000);
		}catch(Exception e)
	{
			e.printStackTrace();
		}

	}


	@AfterClass
	static void H_close() {

		oBrowser.close();

	}

}
