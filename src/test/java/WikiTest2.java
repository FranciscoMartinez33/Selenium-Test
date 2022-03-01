import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;



public class WikiTest2 {
  @DataProvider(name = "Data Provider Wiki")
  public Object[][] dbMethod(){
	  return new Object[][] {{"Selenium"},{"Java"},{"TestNG"}};
  }
  @Test(dataProvider = "Data Provider Wiki", description = "Validar que las búsquedas en Wikipedia funcionan")
  public void ValidarBusquedaWikipedia(String searchText) throws Exception{
	  //Assert.assertTrue(homePage.searchInputVisible(),"El input no esta visible");
	 // WikiResultsPage resultsPage = homePage.searchText(searchText);
	 // Assert.assertTrue(resultsPage.tituloIsVisible(), "El titulo no esta visible");
	  System.setProperty("webdriver.chrome.driver", "C:/Users/franc/Documents/Drivers web/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://wikipedia.org");
	  WebElement searchInput = driver.findElement(By.id("searchInput"));
	  Thread.sleep(2000);
	  Assert.assertTrue(searchInput.isDisplayed());
	  searchInput.sendKeys(searchText);
	  searchInput.submit();
	  Thread.sleep(2000);
	  WebElement tituloResultado = driver.findElement(By.id("firstHeading"));
	  System.out.println("Texto encontrado "+ tituloResultado.getText());
	  WebDriverWait ewait = new WebDriverWait(driver,10);
	  ewait.until(ExpectedConditions.titleContains(tituloResultado.getText()));
	  Assert.assertTrue(tituloResultado.isDisplayed());
	  driver.close();
	  
  }
}
