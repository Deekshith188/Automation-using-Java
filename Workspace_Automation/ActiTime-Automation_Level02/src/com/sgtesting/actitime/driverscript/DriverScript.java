package com.sgtesting.actitime.driverscript;

import org.openqa.selenium.WebDriver;

import com.sgtesting.actitime.tests.Initialize;
import com.sgtesting.actitime.tests.LoginLogout;
import com.sgtesting.actitime.tests.Users;

public class DriverScript {

	public static void main(String[] args) {
		WebDriver oBrowser=null;
		//Scenario: Create User
		oBrowser=Initialize.launchBrowser();
		Initialize.navigate(oBrowser);
		LoginLogout.login(oBrowser);
		Initialize.minimizeFlyOutWindow(oBrowser);
		Users.createUser(oBrowser);
		Users.deleteUser(oBrowser);
		LoginLogout.logout(oBrowser);
		Initialize.closeApplication(oBrowser);
		
		//Scenario: Modify User
		oBrowser=Initialize.launchBrowser();
		Initialize.navigate(oBrowser);
		LoginLogout.login(oBrowser);
		Initialize.minimizeFlyOutWindow(oBrowser);
		Users.createUser(oBrowser);
		Users.modifyUser(oBrowser);
		Users.deleteUser(oBrowser);
		LoginLogout.logout(oBrowser);
		Initialize.closeApplication(oBrowser);

	}
}
