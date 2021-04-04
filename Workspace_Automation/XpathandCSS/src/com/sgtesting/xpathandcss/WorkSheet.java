package com.sgtesting.xpathandcss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkSheet {

	public static void main(String[] args) {
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Automation\\Automation\\Web_Automation1\\Library\\Drivers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.youtube.com/watch?v=BtmeQOcdIKI&list=PL6flErFppaj2ArNxLyR4nQ4JV8qFc56-M&index=6&ab_channel=Mukeshotwani");
			driver.manage().window().maximize();
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
