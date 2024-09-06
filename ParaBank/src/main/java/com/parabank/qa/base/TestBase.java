package com.parabank.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.parabank.qa.util.Testutil;


	public class TestBase {

		public static WebDriver driver;
		public static Properties prop; // Global variable

		
		public TestBase() {
			try {
			
			prop = new Properties();
			FileInputStream ip = new FileInputStream(("C:\\Users\\tasleem.arshad\\eclipse-workspace\\ParaBank\\src\\main\\java\\com\\parabank\\qa\\config\\Config.properties"));
			prop.load(ip);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		@SuppressWarnings("deprecation")
		public static void Initialization() {
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")){
//			System.setProperty("webdriver.chrome.driver", "");	
		 driver = new ChromeDriver(); 
		}
		else if(browserName.equals("FF")){
		//	System.setProperty("webdriver.gecko.driver", "");	
		 driver = new FirefoxDriver(); 
		}
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Testutil.Page_Load_TimeOut, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Testutil.Implicit_Wait, TimeUnit.SECONDS);
		
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		 
		//driver.get(prop.getProperty("url"));
	}
	
	}

