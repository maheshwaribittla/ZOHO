package com.apps.pages;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import com.apps.base.Page;
import com.apps.pages.crm.CRMHomePage;



public class ZohoPage extends Page {

	public static  CRMHomePage goToCRM() {
		
		//driver.findElement(By.xpath("//*[@id='zl-myapps']/div[1]/div[6]/div/a/div")).click();
		
				
	
		

			    click("CRMlink_XPATH");
		return new CRMHomePage();
	}
	
	

	public void goToCalender() {
		
		driver.findElement(By.xpath("//*[@id='zl-myapps']/div[1]/div[2]/div/a/div")).click();
		
		
	
		
	}
	
	public void goToDesk() {
		
		driver.findElement(By.xpath("//*[@id=\"zl-myapps\"]/div[1]/div[2]/div/a/div")).click();
		
	}

	
}


