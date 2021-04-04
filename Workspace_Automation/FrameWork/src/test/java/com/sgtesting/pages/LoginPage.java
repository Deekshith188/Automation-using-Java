package com.sgtesting.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	@FindBy(name="username")WebElement uname;
	
	@FindBy(name="pwd")WebElement pass;
	
	@FindBy(xpath="//a[@id='loginButton']")WebElement loginbutton;
	
	public void logintoActitime(String username,String password )
	{
		uname.sendKeys(username);
		pass.sendKeys(password);
		loginbutton.click();
	}

}
