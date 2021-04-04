package pomassignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Assignment3 {
	public static WebDriver oBrowser=null;
	public static ActiTimePageAssginment oPage=null;

	public static void main(String[] args) {

		launchBrowser();
		navigateURL();
		loginadmin();
		minimizeFlyoutwindow();
		createUser("user1", "username", "user1@gmail.com", "username", "12345");
		logout();
		
		loginuser("user1","12345");
		createUser1("user2", "user2", "user2@gmail.com", "user2", "12345");
		logout();
		
		loginadmin();
		modifyUser("54321");
		logout();
		
		loginuser("user1","54321");
		deleteUser2();
		logout();
		
		loginadmin();
		deleteUser1();
		logout();
		closebrowser();

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

	static void loginadmin()
	{
		try
		{
			oPage.getusername().sendKeys("admin");
			Thread.sleep(2000);
			oPage.Loginpassword().sendKeys("manager");
			Thread.sleep(2000);
			oPage.getLoginClick().click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void loginuser(String username, String password)
	{
		try
		{
			oPage.getusername().sendKeys("Kumar");
			Thread.sleep(2000);
			oPage.Loginpassword().sendKeys("123456");
			Thread.sleep(2000);
			oPage.getLoginClick().click();
			Thread.sleep(4000);
			oPage.startExploringText().click();
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

	static void createUser(String fn, String ln, String email, String username, String password)
	{
		try
		{
			oPage.usersClick().click();
			Thread.sleep(2000);
			oPage.AddUserClick().click();
			Thread.sleep(2000);
			oPage.FirstNameField().sendKeys("Deek");
			Thread.sleep(2000);
			oPage.LastNameField().sendKeys("BU");
			Thread.sleep(2000);
			oPage.EmailField().sendKeys("DEEk@gmail.com");
			Thread.sleep(2000);
			oPage.UsernameField().sendKeys("Kumar");
			Thread.sleep(2000);
			oPage.UserPasswordField().sendKeys("123456");
			Thread.sleep(2000);
			oPage.UserRetypePasswordField().sendKeys("123456");
			Thread.sleep(2000);
			oPage.CreateUserCommitClick().click();
			Thread.sleep(2000);

		}catch(Exception e) {e.printStackTrace();}
	}
	static void createUser1(String fn, String ln, String email, String username, String password)
	{
		try
		{
			oPage.usersClick().click();
			Thread.sleep(2000);
			oPage.AddUserClick().click();
			Thread.sleep(2000);
			oPage.FirstNameField().sendKeys("Deepu");
			Thread.sleep(2000);
			oPage.LastNameField().sendKeys("BU");
			Thread.sleep(2000);
			oPage.EmailField().sendKeys("Deepu@gmail.com");
			Thread.sleep(2000);
			oPage.UsernameField().sendKeys("dharani");
			Thread.sleep(2000);
			oPage.UserPasswordField().sendKeys("123456");
			Thread.sleep(2000);
			oPage.UserRetypePasswordField().sendKeys("123456");
			Thread.sleep(2000);
			oPage.CreateUserCommitClick().click();
			Thread.sleep(2000);

		}catch(Exception e) {e.printStackTrace();}
	}

	static void deleteUser2()
	{
		try
		{
			oPage.usersClick().click();
			oPage.User2NameSpanClick().click();
			Thread.sleep(2000);
			oPage.DeleteUser().click();
			Thread.sleep(2000);
			oBrowser.switchTo().alert().accept();

		}catch(Exception e) {e.printStackTrace();}
	}

	static void deleteUser1()
	{
		try
		{
			oPage.usersClick().click();
			oPage.User1NameSpanClick().click();
			Thread.sleep(2000);
			oPage.DeleteUser().click();
			Thread.sleep(2000);
			oBrowser.switchTo().alert().accept();

		}catch(Exception e) {e.printStackTrace();}
	}

	static void modifyUser(String newPassword)
	{
		try
		{
			oPage.usersClick().click();
			oPage.User1NameSpanClick().click();
			Thread.sleep(2000);
			oPage.UserPasswordField().sendKeys(newPassword);
			Thread.sleep(2000);
			oPage.UserRetypePasswordField().sendKeys(newPassword);
			Thread.sleep(2000);
			oPage.SavechangesClick().click();

		}catch(Exception e) {e.printStackTrace();}
	}

	static void closebrowser()
	{
		try
		{
			oBrowser.close();
		}catch(Exception e) {e.printStackTrace();}

	}

}
