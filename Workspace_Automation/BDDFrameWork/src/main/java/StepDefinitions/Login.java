package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Login {
	WebDriver driver;
	
	
	
	
	@Given("^user is in Login Page$")
	public void user_is_in_Login_Page(){
		
		System.setProperty("webdriver.chrome.driver","E:\\Workspace_Automation\\BDDFrameWork\\Library\\Drivers\\chromedriver.exe");
		
		driver =new ChromeDriver();
		
		driver.get("http://localhost/login.do");
		
//		String title=driver.getTitle();
//		System.out.println(title);
//		Assert.assertEquals("actiTIME -  Login","title");
		
		
		
		
		
	}
	@When("^enter User name$")
	public void  enter_User_name ()
	{
	    driver.findElement(By.name("username")).sendKeys("admin");
				
	}
	
	@And("^enter Password$")
	public void enter_Password() throws Exception {
	
		driver.findElement(By.name("pwd")).sendKeys("manager");
	}
	
	
	@Then("^click On Login Button$")
	public void click_On_Login_Button()  {
		
		driver.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();;
	 
	}
	
	
	
	
}

	
	
	
	
