package com.apps.testcases;
import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import com.apps.base.Page;
import com.apps.pages.HomePage;
import com.apps.pages.SigninPage;
import com.apps.pages.ZohoPage;

public class LoginTest extends BaseTest{
	
	@Test
	public void doLogin() {
		HomePage home = new HomePage();
		SigninPage signp = home.goToSignIn();
		ZohoPage zohopage = signp.doLogin("srikrishna.bhaskar@gmail.com", "Mahi@1234");
		
	        }
		}
	