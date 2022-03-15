package com.Selenium.Pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.Selenium.Driver.DriverFactory;

public class BeforeAfterPage {
	private WebDriver driver = null;
  	
	
	
 @BeforeMethod
 public void setup() {
   driver = DriverFactory.LevantarBrowser(driver, "CHROME", "https://www.despegar.com.ar");
   DespegarHomePage homePage = new DespegarHomePage(driver);
}
	  
 @AfterMethod
 public void closesetup() {
	driver.close();
}
	  
}
