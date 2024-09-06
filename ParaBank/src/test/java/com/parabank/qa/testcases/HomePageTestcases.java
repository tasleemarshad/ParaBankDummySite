package com.parabank.qa.testcases;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.net.HttpURLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.parabank.qa.base.TestBase;
import com.parabank.qa.pages.HomePage;

public class HomePageTestcases extends TestBase {
	 HomePage hmpage;
	 
	 
	 HomePageTestcases(){
		 super();
	 }
	 
	 @BeforeMethod
	 public void setUp() {
		 Initialization();
		 hmpage = new HomePage();
	 }
	 
	 
	 @Test(priority=1)
	 public void VerifygetTittle() {
		System.out.println(driver.getTitle());
	 }
	 
	 @Test(priority=2)
	 public void VerifyImageLogo() {
		boolean flag = hmpage.validateParaImage();
		Assert.assertTrue(flag);
		System.out.println(flag);
	 }
	 @Test(priority=3)
	 public void VerifyBrokenLinks() throws Exception {
	List<WebElement> links = driver.findElements(By.tagName("a"));
	System.out.println(links.size());
	for (WebElement link :links) {
		String linkURL =link.getAttribute("herf");
		URL url = new URL(linkURL);
		URLConnection urlconnection = url.openConnection();
		HttpURLConnection httpURLConnection =(HttpURLConnection) urlconnection;
		httpURLConnection.setConnectTimeout(5000);
		httpURLConnection.connect();
		if(httpURLConnection.getResponseCode() ==200)
			System.out.println(linkURL+ "-- " +httpURLConnection.getResponseMessage());
		else
			System.err.println(linkURL+ "-- " +httpURLConnection.getResponseCode());
	}
	}	

	@Test(priority=4)
	 public void VerfiyLinkRedirectRegisterPage() throws Exception {
		 hmpage.verifyRegisterlink();
		 Thread.sleep(2000);
	 }

	 
	 //@AfterMethod
	// public void tearDown() {
	//	 driver.quit();
	// }

}
