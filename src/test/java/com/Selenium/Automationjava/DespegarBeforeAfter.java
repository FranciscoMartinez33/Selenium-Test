package com.Selenium.Automationjava;

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
	
@BeforeMethod
 public void setup() {
	driver = DriverFactory.LevantarBrowser(driver, "CHROME", "https://www.despegar.com.ar");
	homePage = new DespegarHomePage(driver);
}
  	
	
  @Test(description = "Validar la búsqueda de un alojamiento con tres personas usando Before y After en página Despegar")
  public void ValidarViaje() throws Exception{
	  Assert.assertTrue(homePage.alojamientosEsVisible());
	  DespegarAlojamientosPage alojamientosPage = homePage.clickAlojamientos();
	  DespegarHotelesPage hotelesPage = alojamientosPage.buscarHotel(" Concepcion del Uruguay");
	  //DespegarResultadosPage resultadosPage = hotelesPage.verDetalle();
	  Assert.assertTrue(hotelesPage.hotelEsVisible());
}
  @AfterMethod
  public void closesetup() {
 	driver.close();
 }
}