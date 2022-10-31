package com.base;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {

	public static WebDriver driver;
	 public FileInputStream loginFile;
	 public static Properties loginLoad;
	{
		try {
			loginFile = new FileInputStream(
					"/Users/kavya/Documents/Eclipse_kk/TestNG_FrameWork3/resources/locators/LoginPage.properties");
			loginLoad = new Properties();
			loginLoad.load(loginFile);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	@BeforeMethod
	public void openBrowser() {

		System.setProperty("webdriver.chrome.driver",
				"/Users/kavya/Documents/Eclipse_kk/TestNG_FrameWork3/driver/chromedriver");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");

	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
