package com.abruno.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.abruno.base.Page;

public class LoginPage  extends Page{

	
	
	public ZohoAppPage doLogin(String username,String password){
		
		type("email_CSS",username);
		type("password_CSS",password);
		click("signbtn_CSS");
		
		return new ZohoAppPage();
	}
	
	
	public void gotoSalesandMarketing(){
		
		
	}
	
	public void gotoFinance(){
		
		
	}
	
}
