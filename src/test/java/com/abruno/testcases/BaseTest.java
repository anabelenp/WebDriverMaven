package com.abruno.testcases;

import org.testng.annotations.AfterSuite;

import com.abruno.base.Page;

public class BaseTest {
	
	
	@AfterSuite
	public void tearDown(){
		
		Page.quit();
		
	}

}
