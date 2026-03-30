package com.ui.tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ui.pojo.User;

@Listeners({com.ui.listners.TestListner.class})
public class LoginTest extends TestBase {

	/*
	 * 
	 * Test Method!!! 1/ Test Script should be small 2. cannot have loops, try
	 * catch, conditional statements 3. Reduce the use of local variable 4. Atleast
	 * one assertion
	 * 
	 */

	@Test(description = "Verify with the valid user is able to login to Application", groups = { "e2e",
			"sanity" }, dataProviderClass = com.ui.dataprovider.LoginDataProvider.class, dataProvider = "loginTestJsonDataProvider")
	public void loginTest(User user) {

		assertEquals(homePage.goToLoginPage().doLoginWith(user.getEmailAddress(), user.getPassword()).getUserName(),
				"Tushar Shelar");

	}

	@Test(description = "Verify with the valid user is able to login to Application", groups = { "e2e",
			"sanity" }, dataProviderClass = com.ui.dataprovider.LoginDataProvider.class, dataProvider = "LoginTestCSVDataProvider")
	public void loginCSVTest(User user) {

		assertEquals(homePage.goToLoginPage().doLoginWith(user.getEmailAddress(), user.getPassword()).getUserName(),
				"Tushar Shelar");
	}

	@Test(description = "Verify with the valid user is able to login to Application", groups = { "e2e",
			"sanity" }, dataProviderClass = com.ui.dataprovider.LoginDataProvider.class, dataProvider = "LoginTestExcelDataProvider",
			retryAnalyzer = com.ui.listner.MyRetryAnalyser.class)
	public void loginExcelTest(User user) {

		assertEquals(homePage.goToLoginPage().doLoginWith(user.getEmailAddress(), user.getPassword()).getUserName(),
				"Tushar Shelar");
	}

}
