package com.abruno.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.abruno.base.Page;

public class HomePage extends Page {
	
	

	
	public void goToSupport(){
		click("support_CSS");
		
	}
	
	public void goToSignUp(){
		
		click("signuplink_CSS");
	}
	
	
	public LoginPage goToLogin(){
		
		click("loginlink_CSS");
		
		return new LoginPage();
	}
	
	public void goToZohoEdu(){
		
		
		
	}
	
	public void goToLearnMore(){
		
		
		
	}
	
	
	public void validateFooterLinks(){
		
		
	}
}
