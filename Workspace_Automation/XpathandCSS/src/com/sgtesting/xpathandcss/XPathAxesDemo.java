package com.sgtesting.xpathandcss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathAxesDemo {

	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
	//	enterSalaryForPersonNameSachinTendulkar();
	//	enterSalaryForPersonWhoIsNextToSachinTendulkar();
	//	enableCheckboxStatusForIndiaFreedomFighter();
	//	fromSachinTendulkarHisPreceding2ndPersonMakeStatusEnabled();
	//	fromEditFieldReferenceEnableCheckbox();
		fromTableReferenceEnableCheckbox();
	}
	static void launchBrowser()
	{
		
		String path=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
		oBrowser=new ChromeDriver();
		oBrowser.manage().window().maximize();
	}
	
	static void navigate()
	{
		try {
		oBrowser.get("file:///D:/HTML/WebTableHTML.html");
		Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 * following-sibling
	 */
	static void enterSalaryForPersonNameSachinTendulkar()
	{
		oBrowser.findElement(By.xpath("//td[text()='Sachin Tendulkar']/following-sibling::td[4]/input")).sendKeys("29000");
	}
	
	/**
	 * following
	 */
	static void enterSalaryForPersonWhoIsNextToSachinTendulkar()
	{
		oBrowser.findElement(By.xpath("//td[text()='Sachin Tendulkar']/following::tr[1]/td[6]/input")).sendKeys("29000");
	}
	
	/**
	 * preceding-sibling
	 */
	static void enableCheckboxStatusForIndiaFreedomFighter()
	{
		oBrowser.findElement(By.xpath("//td[text()='Indian Freedom Fighter']/preceding-sibling::td[2]/input")).click();
	}
	
	
	/**
	 * preceding
	 */
	static void fromSachinTendulkarHisPreceding2ndPersonMakeStatusEnabled()
	{
		oBrowser.findElement(By.xpath("//td[text()='Sachin Tendulkar']/preceding::tr[2]/td[1]/input")).click();
	}
	
	
	/**
	 * ancestor
	 */
	static void fromEditFieldReferenceEnableCheckbox()
	{
		oBrowser.findElement(By.xpath("//input[@id='edit4']/ancestor::tr/td[1]/input")).click();
	}
	
	/**
	 * descendant
	 */
	static void fromTableReferenceEnableCheckbox()
	{
		oBrowser.findElement(By.xpath("//table[@id='tbl1']/descendant::tr[4]/td[1]/input")).click();
	}
}
