package com.apps.pages.crm.accounts;
import org.testng.annotations.Test;

import com.apps.base.Page;

public class AccountsPage extends Page {
	@Test
	public static CreateAccountsPage gotoCreateAccounts() {
		click("goToCreateAccounts_XPATH");
		//driver.findElement(By.xpath("//*[@id=\"table_row_1\"]/lyte-td[3]/span[1]/link-to")).click();
		return new CreateAccountsPage();
	}
	
	public void gotoImportAccounts() {
		
	}
}
