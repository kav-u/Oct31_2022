package com.test;

import org.testng.annotations.Test;

import com.base.BaseClass;
import com.page.LoginPage;

public class LoginTest extends BaseClass{

	
	@Test
	public void loginTest() {
		
//		LoginPage loginPage = new LoginPage();
//		loginPage.LoginPage();
		LoginPage.enterUsername("standard_user");
		LoginPage.enterPassword("secret_sauce");
		LoginPage.clickLoginBtn();
		
		
		
	}
	
}
