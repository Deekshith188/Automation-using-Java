package com.sgtesting.testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCaseWithoutFrameWork {
	public static WebDriver driver=null;
	@Test
	public void test()throws Exception{
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumAutomation\\Automation\\InterviewQuestion\\Library\\Drivers\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
				
	}

}
