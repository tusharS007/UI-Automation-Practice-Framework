package com.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.constant.Browser;
import com.constant.Env;
import com.utility.BrowserUtility;
import com.utility.JSONUtility;

public final class HomePage extends BrowserUtility {
	
	private static final By SIGN_IN_LOCATOR = By.xpath("//a[contains(@title,'Log in to')]");
	LoginPage loginPage;
	
	public HomePage(Browser browserName, boolean isHeadless) {
		super(browserName,isHeadless); //TO call the parent class constructor from the child constructor
		goToWebsite(JSONUtility.readJSON(Env.QA).getUrl());
	}
	
	public HomePage(WebDriver driver) {
		super(driver); // To Call the Parent Class constructor from the child constructor
		goToWebsite(JSONUtility.readJSON(Env.QA).getUrl());
	}
    
	public LoginPage goToLoginPage() { // Page Functions------> cannot use void!!!
		maximizeWindow();
		clickOn(SIGN_IN_LOCATOR);
		LoginPage loginPage = new LoginPage(getDriver());
		return loginPage;
	}

}
