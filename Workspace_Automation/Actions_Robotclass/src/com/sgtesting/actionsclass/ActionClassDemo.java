package com.sgtesting.actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDemo {

	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigateURL();
		exploreOption();
	}
	static void launchBrowser()
	{
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"E:\\Workspace_Automation\\Actions_Robotclass\\Library\\Driver\\chromedriver.exe");
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
			oBrowser.get("https://www.icicibank.com/");
			Thread.sleep(4000);
			oBrowser.findElement(By.id("push-modal-close")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void exploreOption()
	{
		try
		{
			WebElement oEle=oBrowser.findElement(By.xpath("//span[text()='Loans']"));
			Thread.sleep(2000);
			Actions oMouse=new Actions(oBrowser);
			oMouse.moveToElement(oEle).build().perform();
			Thread.sleep(2000);
			WebElement oEle1=oBrowser.findElement(By.xpath("//li[contains(text(),'Insta Car Loan')]"));
			oMouse.moveToElement(oEle1).build().perform();
			Thread.sleep(2000);
			oBrowser.findElement(By.linkText("Apply Now")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
