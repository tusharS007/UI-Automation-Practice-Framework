package com.ui.pages;

import org.openqa.selenium.By;

import com.constant.Browser;
import com.constant.Env;
import com.utility.BrowserUtility;
import com.utility.PropertiesUtil;

public final class HomePage extends BrowserUtility {
	
	private static final By SIGN_IN_LOCATOR = By.xpath("//a[contains(@title,'Log in to')]");
	
	public HomePage(Browser browserName) {
		super(browserName); //TO call the parent class constructor from the child constructor
		goToWebsite(PropertiesUtil.readProperties(Env.QA, "URL"));
	}
    
	public LoginPage goToLoginPage() {
		maximizeWindow();
		clickOn(SIGN_IN_LOCATOR);
		LoginPage loginPage = new LoginPage(getDriver());
		return loginPage;
	}
}
