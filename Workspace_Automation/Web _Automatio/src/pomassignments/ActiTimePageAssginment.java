package pomassignments;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ActiTimePageAssginment {
	WebDriver oBrowser = null;
	public ActiTimePageAssginment (WebDriver oBrowser)
	{
		this.oBrowser = oBrowser;
		PageFactory.initElements(this.oBrowser, this);
	}

	//Login 
	//username enter
	private WebElement username;
	public WebElement getusername()
	{
		return username;
	}

	//Login password enter
	private WebElement pwd;
	public WebElement Loginpassword()
	{
		return pwd;
	}
	//login button click
	@FindBy(xpath="//*[@id='loginButton']/div") 
	private WebElement oLoginClick;
	public WebElement getLoginClick()
	{
		return oLoginClick;
	}
	////startExploringText
	@FindBy(xpath="//*[@id='welcomeScreenBoxId']/div[3]/div/span[1]")
	private WebElement ostartExploringText;
	public WebElement startExploringText()
	{
		return ostartExploringText;
	}

	//logout click

	private WebElement logoutLink;
	public WebElement getLogout()
	{
		return logoutLink;
	}

	//Flyoutwindow close
	@FindBy(xpath="//*[@id='gettingStartedShortcutsPanelId']")
	private WebElement oFlyoutwindowclick;
	public WebElement Flyoutwindow()
	{
		return oFlyoutwindowclick;
	}
	//create user
	//usersClick
	@FindBy(xpath="//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")
	private WebElement oUsersClick;
	public WebElement usersClick()
	{
		return oUsersClick;
	}
	//AddUserClick
	@FindBy(xpath = "//*[@id='createUserDiv']/div/div[2]")
	private WebElement oAddUserClick;
	public WebElement AddUserClick()
	{
		return oAddUserClick;
	}

	//FirstNameField
	private WebElement userDataLightBox_firstNameField;
	public WebElement FirstNameField()
	{
		return userDataLightBox_firstNameField;
	}
	//LastNameField
	private WebElement userDataLightBox_lastNameField;
	public WebElement LastNameField()
	{
		return userDataLightBox_lastNameField;
	}
	////EmailField
	private WebElement userDataLightBox_emailField;
	public WebElement EmailField()
	{
		return userDataLightBox_emailField;
	}
	//UsernameField
	private WebElement userDataLightBox_usernameField;
	public WebElement UsernameField()
	{
		return userDataLightBox_usernameField;
	}
	////UserPasswordField
	private WebElement userDataLightBox_passwordField;
	public WebElement UserPasswordField()
	{
		return userDataLightBox_passwordField;
	}
	////UserRetypePasswordField
	private WebElement userDataLightBox_passwordCopyField;
	public WebElement UserRetypePasswordField()
	{
		return userDataLightBox_passwordCopyField;
	}
	//CreateUserCommitClick
	@FindBy (xpath = "//*[@id='userDataLightBox_commitBtn']/div/span")
	private WebElement oCreateUserCommitClick;
	public WebElement CreateUserCommitClick()
	{
		return oCreateUserCommitClick;
	}
	//User1 Span
	//User1NameSpanClick
	@FindBy(xpath="//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")
	private WebElement oUser1NameSpanClick;
	public WebElement User1NameSpanClick()
	{
		return oUser1NameSpanClick;
	}
	//User2 Span
	//User2NameSpanClick
	@FindBy(xpath="//*[@id='userListTableContainer']/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]/span[2]")
	private WebElement oUser2NameSpanClick;
	public WebElement User2NameSpanClick()
	{
		return oUser2NameSpanClick;
	}
	//Delete user click
	private WebElement userDataLightBox_deleteBtn;
	public WebElement DeleteUser()
	{
		return userDataLightBox_deleteBtn;
	}
	//save changes click
	@FindBy(xpath="//*[@id='userDataLightBox_commitBtn']/div/span")
	private WebElement oSavechangesClick;
	public WebElement SavechangesClick()
	{
		return oSavechangesClick;
	}
	
}


