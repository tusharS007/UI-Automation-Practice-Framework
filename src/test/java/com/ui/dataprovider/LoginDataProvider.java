package com.ui.dataprovider;

import java.util.Iterator;

import org.testng.annotations.DataProvider;

import com.ui.pojo.User;
import com.utility.CSVReaderUtility;
import com.utility.ExcelReaderUtility;
import com.utility.JsonReaderUtility;

public class LoginDataProvider {
	
	@DataProvider(name="loginTestJsonDataProvider")
	public Iterator<Object[]> loginDataProvider() {
		return JsonReaderUtility.readJson("loginData.json");
	}
	
	@DataProvider(name="LoginTestCSVDataProvider")
	public Iterator<User> loginCSVDataProvider() {
		return CSVReaderUtility.readCSV("loginData.csv");
	}

	@DataProvider(name="LoginTestExcelDataProvider")
	public Iterator<User> loginExcelDataProvider() {
		return ExcelReaderUtility.readExcelFile("LoginData.xlsx");
	}
}
