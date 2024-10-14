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
		Assert.assertEquals(Sptitle, "[ParaBank | Register for Free Online Account Access]");
		System.out.println(Sptitle);
	}
	
	
	@Test(priority=3)
	public void verifyErrorMessage() {
		reg_Page.verifyClickonRegister();
		reg_Page.RegisterBtn.click();
		String fname= reg_Page.FNameError.getText();
		System.out.println(fname);
		String lname= reg_Page.LNameError.getText();
		System.out.println(lname);
		String address= reg_Page.AddresError.getText();
		System.out.println(address);
		String city= reg_Page.CityError.getText();
		System.out.println(city);
		String state= reg_Page.StateError.getText();
		System.out.println(state);
		String zipcode= reg_Page.ZipcodeError.getText();
		System.out.println(zipcode);
		String ssn= reg_Page.SSNError.getText();
		System.out.println(ssn);
		String uname= reg_Page.UNameError.getText();
		System.out.println(uname);
		String password= reg_Page.PasswordError.getText();
		System.out.println(password);
		String rpassword= reg_Page.RpasswordError.getText();
		System.out.println(rpassword);
		
		System.out.println(fname);
	}
	
	@Test(priority=4)
	public void verifyRegisterPage() {
	    reg_Page.verifyClickonRegister();
		reg_Page.createRegister();
	}

	
	//@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
	
	
}
