package com.parabank.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.parabank.qa.base.TestBase;

public class RegisterPage extends TestBase {
	
	@FindBy(xpath= "//*[@id='loginPanel']/p[2]/a")
	WebElement RegisterLink;
	
	@FindBy(id="customer.firstName")
	WebElement FName;

	@FindBy(id="customer.lastName")
	WebElement LName;
	
	@FindBy(id="customer.address.city")
	WebElement Address;
	
	@FindBy(id="customer.address.state")
	WebElement State;
	
	@FindBy(id="customer.address.zipCode")
	WebElement Zipcode;
	
	@FindBy(id="customer.phoneNumber")
	WebElement PhoneNumber;
	
	@FindBy(id="customer.ssn")
	WebElement SSN;
	
	@FindBy(id="customer.username")
	WebElement UserName;
	
	@FindBy(id="customer.username")
	WebElement Password;
	
	@FindBy(id ="repeatedPassword")
	WebElement ConfirmPassword;
	
	@FindBy(xpath="//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input")
	WebElement RegisterBtn;
	
	@FindBy(xpath= "//*[@id='rightPanel']/h1")
	WebElement Tittle;
	

	public RegisterPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void verifyClickonRegister() {
		RegisterLink.click();	
	}
	
	public String validateSignupTitle() {
		return driver.getTitle();
	}
		
	public void createRegister(){
	
	FName.sendKeys("Test");	
	LName.sendKeys("qa");
	Address.sendKeys("city tower LHR");
	State.sendKeys("IS");
	Zipcode.sendKeys("54000");
	PhoneNumber.sendKeys("87584584785");
	SSN.sendKeys("1111");
	UserName.sendKeys("qa");
	Password.sendKeys("Abcd1234");
	ConfirmPassword.sendKeys("Abcd1234");
	RegisterBtn.click();
	
	}

	
	
}



