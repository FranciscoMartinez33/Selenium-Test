import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class WikiTest1 {
  @Test(description ="Validar que las búsquedas en Wikipedia funcionan")
  public void ValidarBusquedaWikipedia() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "C:/Users/franc/Documents/Drivers web/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://wikipedia.org");
	  WebElement searchInput = driver.findElement(By.id("searchInput"));
	  WebDriverWait wait = new WebDriverWait(driver,15);
	  wait.until(ExpectedConditions.visibilityOf(searchInput));
	  Assert.assertTrue(searchInput.isDisplayed());
	  searchInput.sendKeys("Selenium");
	  searchInput.submit();
	  wait.until(ExpectedConditions.titleContains("Selenium"));
	  WebElement tituloResultado = driver.findElement(By.id("firstHeading"));
	  System.out.println("Texto encontrado "+ tituloResultado.getText());
	  Assert.assertTrue(tituloResultado.isDisplayed());
	  driver.close();
  }
}
