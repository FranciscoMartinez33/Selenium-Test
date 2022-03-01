import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {
  @Test
  public void BusquedaTercerSitio() throws Exception{
	  System.setProperty("webdriver.chrome.driver", "C:/Users/franc/Documents/Drivers web/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
      Thread.sleep(1000);
      System.out.println("Direccionando a el sitio Google");
	  driver.get("https://www.google.com");
	  WebElement Entrada = driver.findElement(By.xpath("//*[@class='gLFyf gsfi']"));
	  Entrada.sendKeys("Selenium");
	  Entrada.sendKeys(Keys.ENTER);
	  Thread.sleep(2000);
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  js.executeScript("window.scrollBy(0,550)", "");
	  Thread.sleep(1000);
	  WebElement TercerSitio = driver.findElement(By.id("dimg_21"));
	  TercerSitio.sendKeys(Keys.ENTER);
	  Thread.sleep(3000);
	  WebElement Titulo = driver.findElement(By.xpath("//div[@class='et_pb_text_inner']/*[text()='Herramientas de testing: introducción a Selenium']"));
	  System.out.println("Texto encontrado "+ Titulo.getText());
	  Assert.assertTrue(Titulo.isDisplayed());
  }
}
