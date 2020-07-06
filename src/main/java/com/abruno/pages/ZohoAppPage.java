package com.abruno.pages;

import org.openqa.selenium.By;

import com.abruno.base.Page;
import com.abruno.pages.crm.CRMHomePage;

public class ZohoAppPage  extends Page{
	
	
	
	public void gotoChat(){
		click("crmlink_CSS");
	}
	
	public CRMHomePage gotoCRM(){
		
		click("crmlink_CSS");
		
		return new CRMHomePage();
	}
	
	
	public void gotoSalesIQ(){
		click("salesIqlink_CSS");
	}

}
