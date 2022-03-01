import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class WikiTest1 {
  @Test(description ="Validar que las búsquedas en Wikipedia funcionan")
  public void ValidarBusquedaWikipedia() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "C:/Users/franc/Documents/Drivers web/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://wikipedia.org");
	  WebElement searchInput = driver.findElement(By.id("searchInput"));
	  Thread.sleep(2000);
	  Assert.assertTrue(searchInput.isDisplayed());
	  searchInput.sendKeys("Selenium");
	  searchInput.submit();
	  Thread.sleep(2000);
	  WebElement tituloResultado = driver.findElement(By.id("firstHeading"));
	  System.out.println("Texto encontrado "+ tituloResultado.getText());
	  Assert.assertTrue(tituloResultado.isDisplayed());
	  driver.close();
  }
}
