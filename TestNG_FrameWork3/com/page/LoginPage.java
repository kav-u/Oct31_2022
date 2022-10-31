package com.page;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;

import com.base.BaseClass;

public class LoginPage extends BaseClass {

//	 public FileInputStream loginFile;
//	 public Properties loginLoad;

//	public LoginPage() {
//		try {
//			loginFile = new FileInputStream(
//					"/Users/kavya/Documents/Eclipse_kk/TestNG_FrameWork3/resources/locators/LoginPage.properties");
//			loginLoad = new Properties();
//			loginLoad.load(loginFile);
//
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//	}

	public static void enterUsername(String un) {
		driver.findElement(By.xpath(loginLoad.getProperty("loginpage.username"))).sendKeys(un);

	}
	
	public static void enterPassword(String pwd) {
		driver.findElement(By.xpath(loginLoad.getProperty("loginpage.password"))).sendKeys(pwd);

	}

	public static void clickLoginBtn() {
		driver.findElement(By.xpath(loginLoad.getProperty("loginpage.loginbtn"))).click();

	}
	
}
