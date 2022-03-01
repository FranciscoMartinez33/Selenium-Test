import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DespegarTest3 {
	 @DataProvider(name = "Data Provider Despegar")
	  public Object[][] dbMethod(){
		  return new Object[][] {{"Concepcion del Uruguay, Entre Ríos"},{"Buenos Aires, Buenos Aires"},{"Mendoza, Mendoza"}};
	  }
	 @Test(dataProvider ="Data Provider Despegar", description = "Validar la reserva de viaje con alojamiento de 3 adultos y un menor con tres destinos diferentes")
	  
	  public void ValidarViajesDespegar(String searchText) throws Exception{
		  System.setProperty("webdriver.chrome.driver", "C:/Users/franc/Documents/Drivers web/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
	      Thread.sleep(1000);
	      System.out.println("Direccionando a el sitio de Despegar");
		  driver.get("https://www.despegar.com.ar");
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("window.scrollBy(0,250)", "");//La pantalla es chica por lo que tiene que schrollear
		  System.out.println("Clickeando la opción Alojamientos");
		  WebElement alojamiento = driver.findElement(By.cssSelector("a[title = 'Alojamientos']"));
		  alojamiento.click();
		  Thread.sleep(1000);
		  System.out.println("Ingresando la dirección de destino");
		  WebElement destino = driver.findElement(By.cssSelector("div.input-container>input[placeholder='Ingresá una ciudad, alojamiento o punto de interés']"));
		  destino.click();
		  Thread.sleep(1000);
		  destino.sendKeys(searchText);
		  Thread.sleep(2000);
		  destino.sendKeys(Keys.CONTROL);
		  Thread.sleep(1000);
		  destino.sendKeys(Keys.ENTER);
		  System.out.println("Clickeando el calendario");
		  WebElement fechaIni = driver.findElement(By.cssSelector("div.input-container>input[placeholder='Entrada']"));
		  fechaIni.click();
		  Thread.sleep(1000);
		  System.out.println("Eligiendo fecha de Inicial");
		  WebElement Inicio = driver.findElement(By.xpath("//div[@class='sbox5-floating-tooltip sbox5-floating-tooltip-opened']//div[@class='sbox5-monthgrid'][@data-month='2022-03']//div[@class='sbox5-monthgrid-datenumber-number'][text()='4']"));
		  Inicio.click();
		  Thread.sleep(1000);
		  System.out.println("Eligiendo fecha de salida");
		  WebElement Salida = driver.findElement(By.xpath("//*[@class='sbox5-floating-tooltip sbox5-floating-tooltip-opened']//*[@class='sbox5-monthgrid'][@data-month='2022-03']//*[@class='sbox5-monthgrid-datenumber-number'][text()='11']"));
		  Salida.click();
		  Thread.sleep(1000);
		  js.executeScript("window.scrollBy(0,250)", "");//Otro schroll
		  System.out.println("Elegir días");
		  WebElement Aplicar = driver.findElement(By.xpath("//button[@class='sbox5-3-btn -primary -md']"));
		  Aplicar.click();
		  Thread.sleep(1000);
		  js.executeScript("window.scrollBy(0,-250)", "");
		  System.out.println("Clickear habitaciones");
		  WebElement Habitaciones = driver.findElement(By.cssSelector(".sbox5-3-double-input"));
		  Habitaciones.click();
		  Thread.sleep(1000);
		  System.out.println("Agregar un adulto");
		  WebElement Adultos3 = driver.findElement(By.cssSelector(".stepper__room .stepper__room__row:nth-child(1) button.steppers-icon-right.stepper__icon"));
		  Adultos3.click();
		  Thread.sleep(1000);
		  System.out.println("Agregar un menor");
		  WebElement Menores = driver.findElement(By.cssSelector(".stepper__room .stepper__room__row:nth-child(2) button.steppers-icon-right.stepper__icon"));
		  Menores.click();
		  Thread.sleep(1000);
		  System.out.println("Clickear select edad menor");
		  WebElement EdadMenor =driver.findElement(By.cssSelector(".select.select"));
		  EdadMenor.click();
		  System.out.println("Elegir edad en el select 8 años");
		  WebElement Edad =driver.findElement(By.xpath("//select[@class='select']/option[@class='select-option'][@value='8']"));
		  Edad.click();
		  Thread.sleep(1000);
		  System.out.println("Clickear para elegir las habitaciones");
		  WebElement AplicarHabit = driver.findElement(By.xpath("//*[@class='distribution__container distribution__type__rooms']//*[@class='stepper__room__footer ']//*[@class='btn-text'][text()='Aplicar']"));
		  AplicarHabit.click();
		  Thread.sleep(1000);
		  System.out.println("Clickear buscar para encontrar alojamiento con esas condiciones");
		  WebElement Busqueda =driver.findElement(By.xpath("//*[@class='sbox5-box-container']//*[@class='btn-text'][text()='Buscar']"));
		  Busqueda.click();
		  Thread.sleep(5000);
		  WebElement Hotel = driver.findElement(By.xpath("//*[@class='accommodation-name-wrapper']//*[@class='accommodation-name -eva-3-ellipsis']"));
		  System.out.println("Texto encontrado "+ Hotel.getText());
		  Assert.assertTrue(Hotel.isDisplayed());
		  driver.close();
		 
		  
	  }
	}
