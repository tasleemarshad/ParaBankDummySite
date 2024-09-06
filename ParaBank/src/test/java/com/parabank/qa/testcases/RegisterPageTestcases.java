package com.parabank.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.parabank.qa.base.TestBase;
import com.parabank.qa.pages.HomePage;
import com.parabank.qa.pages.RegisterPage;

public class RegisterPageTestcases extends TestBase {
	
	HomePage hmpage;
	RegisterPage reg_Page;
	
	public RegisterPageTestcases() {
		super();
	}

	
	@BeforeMethod
	 public void setUp() {
		 Initialization();
		 hmpage = new HomePage();
		 reg_Page= new RegisterPage();
	 }
	
	
	@Test (priority=1)
	public void VerifyRegisterPageTittle() {
		reg_Page.verifyClickonRegister();
		String Sptitle = reg_Page.validateSignupTitle();
		Assert.assertEquals(Sptitle, "[ParaBank | Register for Free Online Account Access");
		System.out.println(Sptitle);
	}
	
	@Test(priority=2)
	public void verifyRegisterPage() {
		reg_Page.verifyClickonRegister();
		reg_Page.createRegister();
	}

	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
	
	
}
