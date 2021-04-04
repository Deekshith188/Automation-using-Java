package com.sgtesting.actitime.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Initialize {
	
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
	public static WebDriver launchBrowser()
	{
		WebDriver oBrowser=null;
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.gecko.driver", path+"\\Library\\drivers\\geckodriver.exe");
			oBrowser=new FirefoxDriver();
			oBrowser.manage().window().maximize();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return oBrowser;
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
	public static void navigate(WebDriver oBrowser)
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
	public static void closeApplication(WebDriver oBrowser)
	{
		try
		{
			oBrowser.close();
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
	public static void minimizeFlyOutWindow(WebDriver oBrowser)
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
