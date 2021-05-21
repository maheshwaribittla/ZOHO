package com.apps.pages;
import org.openqa.selenium.Alert;

import com.apps.base.Page;

public final class SigninPage extends Page {
	
/*	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver; 
	}*/
	
	public ZohoPage doLogin(String uname,String password) {
		log.info("enetered in");
		
		
		type("userName_CSS", uname);
		log.info("crossed login username entry");
		
		
		
		//driver.findElement(By.cssSelector("#login_id")).sendKeys(uname);
		click("nextBtn_CSS");
		
		//driver.findElement(By.cssSelector("#nextbtn")).click();
		type("password_CSS", password);
		//driver.findElement(By.cssSelector("#password")).sendKeys(password);
		click("signInNextBtn_CSS");
		//driver.findElement(By.cssSelector("#nextbtn")).click();
		//driver.findElement(By.cssSelector(".failbutton")).click();
		
		//Alert  alert=Page.driver.switchTo().alert();
	    //if (!(alert==null)){
	    //alert.accept();
	    //}
		return new ZohoPage();
	}

}

