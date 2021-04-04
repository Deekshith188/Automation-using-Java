package com.sgtesting.actitime.driverscript;

import com.sgtesting.actitime.tests.Initialize;
import com.sgtesting.actitime.tests.LoginLogout;
import com.sgtesting.actitime.tests.Users;

public class DriverScript {

	public static void main(String[] args) {
		//Scenario: Create User
		Initialize.launchBrowser();
		Initialize.navigate();
		LoginLogout.login();
		Initialize.minimizeFlyOutWindow();
		Users.createUser();
		Users.deleteUser();
		LoginLogout.logout();
		Initialize.closeApplication();
		
		//Scenario: Modify User
		Initialize.launchBrowser();
		Initialize.navigate();
		LoginLogout.login();
		Initialize.minimizeFlyOutWindow();
		Users.createUser();
		Users.modifyUser();
		Users.deleteUser();
		LoginLogout.logout();
		Initialize.closeApplication();

	}
}
