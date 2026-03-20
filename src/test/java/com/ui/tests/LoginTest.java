package com.ui.tests;

import static com.constant.Browser.CHROME;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ui.pages.HomePage;
import com.ui.pojo.User;

public class LoginTest {

	/*
	 * 
	 * Test Method!!! 1/ Test Script should be small 2. cannot have loops, try
	 * catch, conditional statements 3. Reduce the use of local variable 4. Atleast
	 * one assertion
	 * 
	 */

	HomePage homePage;

	@BeforeMethod(description = "Load the Homepage of the website")
	public void setup() {
		homePage = new HomePage(CHROME);
	}

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
			"sanity" }, dataProviderClass = com.ui.dataprovider.LoginDataProvider.class, dataProvider = "LoginTestExcelDataProvider")
	public void loginExcelTest(User user) {

		assertEquals(homePage.goToLoginPage().doLoginWith(user.getEmailAddress(), user.getPassword()).getUserName(),
				"Tushar Shelar");
	}

}
