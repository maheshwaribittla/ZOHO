package com.apps.pages.crm.accounts;

import com.apps.base.Page;

public class CreateAccountsPage extends Page {
	
	public void createAccount(String name)  {
		
		
		type("createAccountName_ID", name);
		//driver.findElement(By.id("Crm_Accounts_ACCOUNTNAME")).sendKeys(name);
		
	}

}



