package com.sgtesting.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {
	public static WebDriver oBrowser = null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		createCustomer();
		createProject();
		deleteProject();
		deleteCustomer();		
		logout();
		close();
	}


	 static void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver","E:\\SeleniumAutomation\\Automation\\Web _Automatio\\Library\\Drivers\\chromedriver.exe");
		oBrowser = new ChromeDriver();
		oBrowser.manage().window().maximize();	
	}
	 static void navigate()
	{	
		try 
		{
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(4000);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	 static void login() 
	{
		try 
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(4000);
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.id("gettingStartedShortcutsMenuCloseId")).click();
			Thread.sleep(4000);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}

	}
	 static void createCustomer() 
	{
		try 
		{
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[3]/a/div[2]")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div/div[2]")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("Deek");
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//*[@id=\"customerLightBox_commitBtn\"]/div/span")).click();
			Thread.sleep(4000);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	 static void createProject() 
	{
		try 
		{
			oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div/div[2]")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("/html/body/div[14]/div[2]")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.id("projectPopup_projectNameField")).sendKeys("Project1");
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//*[@id=\"projectPopup_commitBtn\"]/div/span")).click();
			Thread.sleep(4000);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	 static void deleteProject()
	{		
		try 
		{
			oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[2]/div[3]/div/div")).click();
			Thread.sleep(2000);
			
			oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div[4]/div/div[3]/div")).click();
			Thread.sleep(2000);
		
			oBrowser.findElement(By.xpath("//*[@id=\"projectPanel_deleteConfirm_submitTitle\"]")).click();
			Thread.sleep(2000);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	

	 static void deleteCustomer() 
	{		
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[4]/div/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[4]/div/div[3]/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"customerPanel_deleteConfirm_submitTitle\"]")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	 static void logout() 
	{
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

