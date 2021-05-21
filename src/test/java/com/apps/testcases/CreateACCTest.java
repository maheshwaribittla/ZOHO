package com.apps.testcases;

import org.testng.annotations.Test;

import com.apps.pages.crm.accounts.AccountsPage;
import com.apps.pages.crm.accounts.CreateAccountsPage;

public class CreateACCTest {
	
	@Test
public void createacc1() {
	CreateAccountsPage createAccounts=AccountsPage.gotoCreateAccounts();
	createAccounts.createAccount("Mahesh");	
	
}
}
