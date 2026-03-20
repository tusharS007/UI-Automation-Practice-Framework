package com.utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import com.constant.Env;

public class PropertiesUtil {

	public static String readProperties(Env env, String propertyName) {

		File propFile = new File(System.getProperty("user.dir") + "\\config\\QA.properties");
		FileReader filereader = null;
		Properties prop = new Properties();

		try {
			filereader = new FileReader(propFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try {
			prop.load(filereader);
		} catch (IOException e) {

			e.printStackTrace();
		}
		String value = prop.getProperty(propertyName.toUpperCase());
		return value;
	}

}
