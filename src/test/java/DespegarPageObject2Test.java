import org.testng.annotations.Test;
import com.Selenium.Driver.DriverFactory;
import com.Selenium.Pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.junit.Assert;

public class DespegarPageObject2Test {
  @Test(description = "Validar la búsqueda de un alojamiento con tres personas en la página despegar usando clases PageObject")

  public void ValidarAlojamientoDespegar() throws Exception{
	  WebDriver driver = null;
	  driver = DriverFactory.LevantarBrowser(driver, "CHROME", "https://www.despegar.com.ar");
	  DespegarHomePage homePage = new DespegarHomePage(driver);
	  Assert.assertTrue(homePage.alojamientosEsVisible());
	  DespegarAlojamientosPage alojamientosPage = homePage.clickAlojamientos();
	  alojamientosPage.elegirCiudad("Concepcion del Uruguay");
	  alojamientosPage.elegirFechas();
	  alojamientosPage.elegirHabitaciones();
	  DespegarHotelesPage hotelesPage = alojamientosPage.buscarHotel();
	  Assert.assertTrue("El hotel no está visible",hotelesPage.hotelEsVisible());
	  driver.close();
  }
}
