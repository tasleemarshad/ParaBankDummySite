package com.parabank.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.parabank.qa.base.TestBase;

public class RegisterPage extends TestBase {
	
	@FindBy(xpath= "//*[@id='loginPanel']/p[2]/a")
	WebElement RegisterLink;
	
	@FindBy(id="customer.firstName")
	WebElement FName;
	
	@FindBy(id="customer.firstName.errors")
	public WebElement FNameError;

	@FindBy(id="customer.lastName")
	WebElement LName;
	
	@FindBy(id="customer.lastName.errors")
	public WebElement LNameError;
	
	@FindBy(id="customer.address.street")
	WebElement Address;
	
	@FindBy(id="customer.address.street.errors")
	public WebElement AddresError;
	
	@FindBy(id="customer.address.city")
	WebElement city;
	
	@FindBy(id="customer.address.city.errors")
	public WebElement CityError;
	
	@FindBy(id="customer.address.state")
	WebElement State;
	
	@FindBy(id="customer.address.state.errors")
	public WebElement StateError;
	
	@FindBy(id="customer.address.zipCode")
	WebElement Zipcode;
	
	@FindBy(id="customer.address.zipCode.errors")
	public WebElement ZipcodeError;
	
	@FindBy(id="customer.phoneNumber")
	WebElement PhoneNumber;
	
	@FindBy(id="customer.ssn")
	WebElement SSN;
	
	@FindBy(id="customer.ssn.errors")
	public WebElement SSNError;
	
	@FindBy(id="customer.username")
	WebElement UserName;
	
	@FindBy(id="customer.username.errors")
	public WebElement UNameError;
	
	@FindBy(id="customer.password")
	WebElement Password;
	
	@FindBy(id="customer.password.errors")
	public WebElement PasswordError;
	
	@FindBy(id ="repeatedPassword")
	WebElement ConfirmPassword;
	
	@FindBy(id="repeatedPassword.errors")
	public WebElement RpasswordError;
	
	@FindBy(xpath="//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input")
	public WebElement RegisterBtn;
	
	@FindBy(xpath= "//*[@id='rightPanel']/h1")
	WebElement Tittle;


	public RegisterPage() {
		PageFactory.initElements(driver, this);
	}
	
	//ACTIONS
	
	public void verifyClickonRegister() {
		RegisterLink.click();	
	}
	
	public String validateSignupTitle() {
		return driver.getTitle();
	}
	
	//public String validationAlert() {
	//	return FNameError.getText();
	//}
		
	public DashboardPage createRegister(){
	
	FName.sendKeys("Test");	
	LName.sendKeys("qa");
	Address.sendKeys("city tower Gulberg");
	city.sendKeys("LHR");
	State.sendKeys("IS");
	Zipcode.sendKeys("54000");
	PhoneNumber.sendKeys("87584584785");
	SSN.sendKeys("1111");
	UserName.sendKeys("qa");
	Password.sendKeys("Abcd1234");
	ConfirmPassword.sendKeys("Abcd1234");
	RegisterBtn.click();
	
	return new DashboardPage();
	}

	
	
}



