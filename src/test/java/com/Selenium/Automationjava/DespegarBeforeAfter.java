package com.Selenium.Automationjava;

import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.Selenium.Driver.DriverFactory;
import com.Selenium.Pages.*;
import org.openqa.selenium.WebDriver;
import org.junit.Assert;

public class DespegarBeforeAfter {
	
	public WebDriver driver = null;
	public DespegarHomePage homePage = null;
	
@BeforeMethod(alwaysRun = true)
 public void setup(ITestContext context) {
	String navegadorTestSuite = context.getCurrentXmlTest().getParameter("Navegador");
	String navegador = navegadorTestSuite != null ? navegadorTestSuite : "CHROME";
	driver = DriverFactory.LevantarBrowser(driver, navegador, "https://www.despegar.com.ar");
	homePage = new DespegarHomePage(driver);
}
  	
	
  @Test(groups = { "grupo_1"},description = "Validar la búsqueda de un alojamiento con tres personas usando Before y After en página Despegar")
  public void ValidarViaje() throws Exception{
	  Assert.assertTrue(homePage.alojamientosEsVisible());
	  DespegarAlojamientosPage alojamientosPage = homePage.clickAlojamientos();
	  DespegarHotelesPage hotelesPage = alojamientosPage.buscarHotel(" Concepcion del Uruguay");
	  //DespegarResultadosPage resultadosPage = hotelesPage.verDetalle();
	  Assert.assertTrue(hotelesPage.hotelEsVisible());
}
  @Test(groups = { "grupo_2"},description = "Validar la búsqueda de un alojamiento con tres personas usando Before y After en página Despegar")
  public void ValidarViaje2() throws Exception{
	  Assert.assertTrue(homePage.alojamientosEsVisible());
	  DespegarAlojamientosPage alojamientosPage = homePage.clickAlojamientos();
	  DespegarHotelesPage hotelesPage = alojamientosPage.buscarHotel(" Buenos Aires, Buenos Aires");
	  //DespegarResultadosPage resultadosPage = hotelesPage.verDetalle();
	  Assert.assertTrue(hotelesPage.hotelEsVisible());
  }
  @Test(groups = { "grupo_1, grupo_2"},description = "Validar la búsqueda de un alojamiento con tres personas usando Before y After en página Despegar")

  public void ValidarViaje3() throws Exception{
	  Assert.assertTrue(homePage.alojamientosEsVisible());
	  DespegarAlojamientosPage alojamientosPage = homePage.clickAlojamientos();
	  DespegarHotelesPage hotelesPage = alojamientosPage.buscarHotel(" Cordoba, Cordoba");
	  //DespegarResultadosPage resultadosPage = hotelesPage.verDetalle();
	  Assert.assertTrue(hotelesPage.hotelEsVisible());
  }
  
  @AfterMethod(alwaysRun = true)
  public void closesetup() {
 	driver.close();
 }
}