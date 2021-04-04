package com.sgtesting.testcase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.sgtesting.pages.BaseClass;
import com.sgtesting.pages.LoginPage;
import com.sgtesting.utility.BrowserFactory;
import com.sgtesting.utility.ExcelDataProvider;

public class LoginTestCRM extends BaseClass {
	
	@Test 
	public void LoginApp() throws IOException
	{
		
		ExcelDataProvider excel=new ExcelDataProvider();
		excel.getStringData("Login", 0, 0);
		
	
		LoginPage loginPage=PageFactory.initElements(driver, LoginPage.class);
		
		
		loginPage.logintoActitime(excel.getStringData("Login", 0, 0),excel.getStringData("Login", 0, 0));
		
		
	}
	
	
}
