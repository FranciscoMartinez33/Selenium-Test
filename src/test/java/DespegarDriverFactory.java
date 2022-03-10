/*import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.Selenium.Driver.DriverFactory;

public class DespegarDriverFactory {
	
	
  @Test(description = "Validar la reserva de viaje con alojamiento de 3 adultos y un menor")
  
  public void ValidarViajeDespegar() throws Exception{
	 /* WebDriver driver = new ChromeDriver();
	  DriverFactory.LevantarBrowser(driver, "CHROME", "https://www.despegar.com.ar");
	  WebDriverWait wait = new WebDriverWait(driver,15);
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  js.executeScript("window.scrollBy(0,250)", "");//La pantalla es chica por lo que tiene que schrollear
	  System.out.println("Clickeando la opción Alojamientos");
	  WebElement alojamiento = driver.findElement(By.cssSelector("a[title = 'Alojamientos']"));
	  wait.until(ExpectedConditions.elementToBeClickable(alojamiento));
	  alojamiento.click();
	  System.out.println("Ingresando la dirección de destino");
	  WebElement destino = driver.findElement(By.cssSelector("div.input-container>input[placeholder='Ingresá una ciudad, alojamiento o punto de interés']"));
	  destino.click();
	  wait.until(ExpectedConditions.elementSelectionStateToBe(destino, false));
	  destino.sendKeys(" Concepcion del Uruguay, Entre Ríos");
	  destino.sendKeys(Keys.CONTROL);
	  Thread.sleep(2000);
	  //wait.until(ExpectedConditions.elementToBeClickable(destino));
	  destino.sendKeys(Keys.ENTER);
	  wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@class='ac-wrapper -desktop -show sbox-ab-ls']")));
	  System.out.println("Clickeando el calendario");
	  WebElement fechaIni = driver.findElement(By.cssSelector("div.input-container>input[placeholder='Entrada']"));
	  wait.until(ExpectedConditions.elementToBeClickable(fechaIni));
	  fechaIni.click();
	  System.out.println("Eligiendo fecha de Inicial");
	  wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("div.sbox5-floating-tooltip.sbox5-floating-tooltip-opened")));
	  WebElement Inicio = driver.findElement(By.xpath("//*[@class='sbox5-floating-tooltip sbox5-floating-tooltip-opened']//*[@class='sbox5-monthgrid'][@data-month='2022-04']//*[@class='sbox5-monthgrid-datenumber-number'][text()='1']"));
	  wait.until(ExpectedConditions.elementToBeClickable(Inicio));
	  Inicio.click();
	  System.out.println("Eligiendo fecha de salida");
	  WebElement Salida = driver.findElement(By.xpath("//*[@class='sbox5-floating-tooltip sbox5-floating-tooltip-opened']//*[@class='sbox5-monthgrid'][@data-month='2022-04']//*[@class='sbox5-monthgrid-datenumber-number'][text()='7']"));
	  wait.until(ExpectedConditions.elementToBeClickable(Salida));
	  Salida.click();
	  js.executeScript("window.scrollBy(0,250)", "");//Otro schroll
	  System.out.println("Elegir días");
	  WebElement Aplicar = driver.findElement(By.xpath("//button[@class='sbox5-3-btn -primary -md']"));
	  Aplicar.click();
	  js.executeScript("window.scrollBy(0,-250)", "");
	  System.out.println("Clickear habitaciones");
	  WebElement Habitaciones = driver.findElement(By.cssSelector(".sbox5-3-double-input"));
	  wait.until(ExpectedConditions.elementToBeClickable(Habitaciones));
	  Habitaciones.click();
	  wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("div.stepper__room")));
	  System.out.println("Agregar un adulto");
	  WebElement Adultos3 = driver.findElement(By.cssSelector(".stepper__room .stepper__room__row:nth-child(1) button.steppers-icon-right.stepper__icon"));
	  Adultos3.click();
	  wait.until(ExpectedConditions.visibilityOf(Adultos3));
	  System.out.println("Agregar un menor");
	  WebElement Menores = driver.findElement(By.cssSelector(".stepper__room .stepper__room__row:nth-child(2) button.steppers-icon-right.stepper__icon"));
	  Menores.click();
	  wait.until(ExpectedConditions.visibilityOf(Menores));
	  System.out.println("Clickear select edad menor");
	  WebElement EdadMenor =driver.findElement(By.cssSelector(".select.select"));
	  EdadMenor.click();
	  System.out.println("Elegir edad en el select 8 años");
	  WebElement Edad =driver.findElement(By.xpath("//select[@class='select']/option[@class='select-option'][@value='8']"));
	  Edad.click();
	  wait.until(ExpectedConditions.visibilityOf(Edad));
	  System.out.println("Clickear para elegir) las habitaciones");
	  WebElement AplicarHabit = driver.findElement(By.xpath("//*[@class='distribution__container distribution__type__rooms']//*[@class='stepper__room__footer ']//*[@class='btn-text'][text()='Aplicar']"));
	  wait.until(ExpectedConditions.visibilityOf(AplicarHabit));
	  AplicarHabit.click();
	  System.out.println("Clickear buscar para encontrar alojamiento con esas condiciones");
	  WebElement Busqueda =driver.findElement(By.xpath("//*[@class='sbox5-box-container']//*[@class='btn-text'][text()='Buscar']"));
	  Busqueda.click();
	  wait.until(ExpectedConditions.titleContains("Alojamientos"));
	  WebElement Hotel = driver.findElement(By.xpath("//*[@class='accommodation-name-wrapper']//*[@class='accommodation-name -eva-3-ellipsis']"));
	  System.out.println("Texto encontrado "+ Hotel.getText());
	  Assert.assertTrue(Hotel.isDisplayed());
	  driver.close();*/
	 
	  