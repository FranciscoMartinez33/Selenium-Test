import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class Despegar2 {
  @Test(description = "Validar que los textos de los botones que están en el header se puedan extraer")
  public void ValidarTextoBotonesLista() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "C:/Users/franc/Documents/Drivers web/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
      Thread.sleep(1000);
      System.out.println("Direccionando a el sitio de Despegar");
	  driver.get("https://www.despegar.com.ar");
	  List<WebElement> ListaElementos = driver.findElements(By.cssSelector("ul.header-list-products > li"));
	  for (WebElement elemento : ListaElementos) {
		  System.out.println("Seleccionando un botón superior");
		  WebElement contenidoElemento = elemento.findElement(By.cssSelector("ul.header-list-products > li > a > div"));
		  //contenidoElemento.click();
		  System.out.println(elemento.getText());
       Assert.assertTrue(contenidoElemento.isDisplayed(), "El elemento no es visible");
	  }
	  driver.close();
  }
}
