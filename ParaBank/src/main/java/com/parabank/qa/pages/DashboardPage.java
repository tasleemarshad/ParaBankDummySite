package com.parabank.qa.pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.parabank.qa.base.TestBase;

public class DashboardPage extends TestBase {
	
	@FindBy(xpath= "/html/body/div[1]/div[3]/div[2]/h1")
	public WebElement username; 
	
   @FindBy(xpath = "//*[@id=\"rightPanel\"]/p")
   public WebElement text;
	
}
