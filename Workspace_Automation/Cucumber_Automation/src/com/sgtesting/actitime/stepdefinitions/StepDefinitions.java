package com.sgtesting.actitime.stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {
	public static WebDriver oBrowser=null;
	/**
	 * Created By:
	 * Purpose:
	 */
	@Given("^I launch the firefox browser$")
	public void I_launch_the_firefox_browser()
	{
		String path=null;
		try
		{
			path=System.getProperty("user.dir");
			System.out.println(path);
			System.setProperty("webdriver.gecko.driver", path+"\\Library\\drivers\\geckodriver.exe");
			oBrowser=new FirefoxDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Created By:
	 * Purpose:
	 */
	@And("^I navigate the Application URL$")
	public void I_navigate_the_Application_URL()
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
	 * Purpose:
	 */
	@When("^I enter the valid UserName$")
	public void I_enter_the_valid_UserName()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Created By:
	 * Purpose:
	 */
	@And("^I enter valid password$")
	public void I_enter_valid_password()
	{
		try
		{
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Created By:
	 * Purpose:
	 */
	@And("^I click on Login button$")
	public void I_click_on_Login_button()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Created By:
	 * Purpose:
	 */
	@Then("^I found a home page$")
	public void I_found_a_home_page()
	{
		try
		{
			WebElement oEle=oBrowser.findElement(By.xpath("//td[text()='Enter Time-Track']"));
			Assert.assertTrue(oEle.isDisplayed());
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	/**
	 * Created By:
	 * Purpose:
	 */
	@When("^I click on Logout link$")
	public void I_click_on_Logout_link()
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
	
	/**
	 * Created By:
	 * Purpose:
	 */
	@Then("^I found Login Page$")
	public void I_found_Login_Page()
	{
		String expected="actiTIME - Login";
		try
		{
			String actual=oBrowser.getTitle();
			Assert.assertEquals(expected, actual);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
