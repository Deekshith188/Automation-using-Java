package com.sgtesting.actitime.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginLogout extends Initialize{
	
	/**
	 * Created By:
	 * Modified By:
	 * Reviewed By:
	 * Test Case ID:
	 * @Parameters :
	 * @return :
	 * Purpose:
	 * Description:
	 */
	public static void login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Created By:
	 * Modified By:
	 * Reviewed By:
	 * Test Case ID:
	 * @Parameters :
	 * @return :
	 * Purpose:
	 * Description:
	 */
	public static void logout()
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

}
