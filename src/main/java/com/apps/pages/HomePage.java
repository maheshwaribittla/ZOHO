package com.apps.pages;
import org.openqa.selenium.By;
import com.apps.base.Page;

public class HomePage extends Page {
	
	public void goToSignUp() {
		
		//driver.findElement(By.cssSelector(".zh-signup")).click();
		
		 click("SigninBtn_CSS");
	}
	
	public SigninPage goToSignIn() {
		
		driver.findElement(By.cssSelector(".zh-login")).click();
		return new SigninPage();
		
	}
	public void goToSupport() {
		
		driver.findElement(By.cssSelector(".zh-support")).click();
		
	}
	
	public void goToLearnMore() {
		
	}

}


