package com.Selenium.Automationjava;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.Selenium.Driver.DriverFactory;
import com.Selenium.Pages.WikiHomePage;
import com.Selenium.Pages.WikiResultsPage;

public class WikiBeforeAfterTest {
	
	public WebDriver driver = null;
	public WikiHomePage homePage = null;

@BeforeMethod
 public void setup() {
	driver = DriverFactory.LevantarBrowser(driver, "CHROME", "https://www.wikipedia.org/");
	homePage = new WikiHomePage(driver);
}
  
	@Test(description = "Validar la busqueda de un texto en Wikipedia con Before After")
  public void buscarDato() {
		 WikiResultsPage resultspage = homePage.searchText("Selenium");
		 Assert.assertTrue("El título no está visible", resultspage.tituloEsVisible());
  }
	@AfterMethod
	public void closesetup() {
	driver.close();
	}
}
