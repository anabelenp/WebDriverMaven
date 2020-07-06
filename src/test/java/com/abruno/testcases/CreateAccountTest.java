package com.abruno.testcases;

import java.util.Hashtable;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.abruno.base.Page;
import com.abruno.pages.ZohoAppPage;
import com.abruno.pages.crm.accounts.AccountsPage;
import com.abruno.pages.crm.accounts.CreateAccountPage;
import com.abruno.utilities.Utilities;

public class CreateAccountTest {
	
	
	@Test(dataProviderClass=Utilities.class,dataProvider="dp")
	public void createAccountTest(Hashtable<String,String> data){
		
		ZohoAppPage zp = new ZohoAppPage();
		zp.gotoCRM();
		AccountsPage account = Page.menu.gotoAccounts();
		CreateAccountPage cap = account.gotoCreateAccounts();
		cap.createAccount(data.get("accountname"));
		Assert.fail("Create account test failed");
		
	}

}
