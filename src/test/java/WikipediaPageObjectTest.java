import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.Selenium.Driver.DriverFactory;
import com.Selenium.Pages.*;
import org.junit.Assert;

public class WikipediaPageObjectTest {
  @Test(description = "Validar la búsqueda en la página Wikipedia")
  public void validarBusqueda() {
	  WebDriver driver = null;
	  driver = DriverFactory.LevantarBrowser(driver, "CHROME", "https://www.wikipedia.org/");
	  WikiHomePage homePage = new WikiHomePage(driver);
	  WikiResultsPage resultspage = homePage.searchText("Selenium");
	  Assert.assertTrue("El título no está visible", resultspage.tituloEsVisible());
	  driver.close();
	  
  }
}
