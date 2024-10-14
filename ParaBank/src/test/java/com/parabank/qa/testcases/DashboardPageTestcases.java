package com.parabank.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.parabank.qa.base.TestBase;
import com.parabank.qa.pages.DashboardPage;
import com.parabank.qa.pages.HomePage;
import com.parabank.qa.pages.RegisterPage;

public class DashboardPageTestcases extends TestBase {
	
	HomePage hmpage;
	RegisterPage reg_Page;
	DashboardPage dash_Page;
	
	DashboardPageTestcases (){
		super();
	}
	
	
	@BeforeMethod
	 public void setUp() {
		 Initialization();
		 hmpage = new HomePage();
		 reg_Page= new RegisterPage();
		dash_Page = new DashboardPage();
	 }
	
	@Test (priority=1)
	public void VerifyuserTittle() {
		  reg_Page.verifyClickonRegister();
		  reg_Page.createRegister();
		String tittle= dash_Page.username.getText();
		System.out.println(tittle);
		String text = dash_Page.text.getText();
		System.out.println(text);
	}
	
	//@AfterMethod
		public void tearDown(){
			driver.quit();
		}
		
	
	
	
	
	
	
	
	
	

}
