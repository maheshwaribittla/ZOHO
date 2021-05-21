package com.apps.testcases;

import org.testng.annotations.Test;

import com.apps.base.Page;
import com.apps.pages.ZohoPage;
import com.apps.pages.crm.CRMHomePage;
import com.apps.pages.crm.accounts.AccountsPage;

public class OpenACCTest1 extends BaseTest {
	@Test
	public void openacc(){
	  CRMHomePage crmhomepage=ZohoPage.goToCRM();
	//cRMHomePage.verifyWelcome();
AccountsPage AccountsPage= Page.topMenu.goToAccounts();	

}
}
