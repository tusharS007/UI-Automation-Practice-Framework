package com.ui.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.ui.pages.HomePage;
import com.ui.pages.LoginPage;

public class LoginTest2 {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		
//		WebDriver wd = new ChromeDriver(options);
//		HomePage homePage = new HomePage(wd);
//		LoginPage loginPage = homePage.goToLoginPage();
//		loginPage.doLoginWith("sigaxar825@qvmao.com", "password");
//		
	}

}
