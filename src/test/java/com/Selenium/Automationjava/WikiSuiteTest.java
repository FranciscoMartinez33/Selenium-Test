package com.Selenium.Automationjava;

import org.testng.annotations.Test;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.Selenium.Driver.DriverFactory;
import com.Selenium.Pages.WikiHomePage;
import com.Selenium.Pages.WikiResultsPage;

public class WikiSuiteTest {
	
	public WebDriver driver = null;
	public WikiHomePage homePage = null;

@BeforeMethod
 public void setup(ITestContext context) {
	String navegadorTestSuite = context.getCurrentXmlTest().getParameter("Navegador");
	String navegador = navegadorTestSuite != null ? navegadorTestSuite : "CHROME";
	driver = DriverFactory.LevantarBrowser(driver, navegador, "https://www.wikipedia.org/");
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
