package com.abruno.pages.crm.accounts;

import com.abruno.base.Page;

public class CreateAccountPage  extends Page {
	
	
	public void createAccount(String accountName){
		
		type("accountname_CSS",accountName);
		
	}

}
