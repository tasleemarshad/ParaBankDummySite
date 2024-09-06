package com.parabank.qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.parabank.qa.base.TestBase;

public class HomePage<WebElements> extends TestBase {
	
	
	

	@FindBy(xpath= "//*[@id='loginPanel']/p[2]/a")
	WebElement RegisterLink;
	
	@FindBy(xpath= "//*[@id=\'topPanel\']/a[2]/img")
	WebElement logo; 
	
	@FindBy(tagName= "a")
	List<WebElements> link;
	

	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean validateParaImage() {
		return logo.isDisplayed();
	}
		
	public RegisterPage verifyRegisterlink() {
		RegisterLink.click();
		return new RegisterPage(); 
	}
}
