package pomassignments;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment1 {
	public static WebDriver oBrowser=null;
	public static ActiTimePageAssginment oPage=null;

	public static void main(String[] args) {

		launchBrowser();
		navigateURL();
		login();
		minimizeFlyoutwindow();
		createUser();
		deleteUser();
		logout();

	}

	static void launchBrowser()
	{
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();

			oPage=new ActiTimePageAssginment(oBrowser);

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
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void login()
	{
		try
		{
			oPage.getusername().sendKeys("admin");
			oPage.Loginpassword().sendKeys("manager");
			Thread.sleep(2000);
			oPage.getLoginClick().click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void logout()
	{
		try
		{
			oPage.getLogout().click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void minimizeFlyoutwindow()
	{
		try
		{
			oPage.Flyoutwindow().click();
			Thread.sleep(2000);

		}catch(Exception e) {e.printStackTrace();}
	}

	static void createUser()
	{
		try
		{
			oPage.usersClick().click();
			Thread.sleep(2000);
			oPage.AddUserClick().click();
			Thread.sleep(2000);
			oPage.FirstNameField().sendKeys("user1");
			Thread.sleep(2000);
			oPage.LastNameField().sendKeys("user1");
			Thread.sleep(2000);
			oPage.EmailField().sendKeys("user1@gmail.com");
			Thread.sleep(2000);
			oPage.UsernameField().sendKeys("user1");
			Thread.sleep(2000);
			oPage.UserPasswordField().sendKeys("12345");
			Thread.sleep(2000);
			oPage.UserRetypePasswordField().sendKeys("12345");
			Thread.sleep(2000);
			oPage.CreateUserCommitClick().click();
			Thread.sleep(2000);

		}catch(Exception e) {e.printStackTrace();}
	}

	static void deleteUser()
	{
		try
		{
			oPage.usersClick().click();
			oPage.User1NameSpanClick().click();
			Thread.sleep(2000);
			oPage.DeleteUser().click();
			Thread.sleep(2000);
			oBrowser.switchTo().alert().accept();

		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}



}


