package com.Selenium.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.Selenium.Pages.BasePage;

public class DespegarAlojamientosPage extends BasePage{
	private WebDriver driver = null;
 
	
	@FindBy(css="div.input-container>input[placeholder='Ingresá una ciudad, alojamiento o punto de interés']")
	WebElement ciudadBuscar;
	
	@FindBy(css = "div.input-container>input[placeholder='Entrada']")
	WebElement calendario;
	
	@FindBy(xpath = "//*[@class='sbox5-floating-tooltip sbox5-floating-tooltip-opened']//*[@class='sbox5-monthgrid' or @class='sbox5-monthgrid sbox5-compact-view'][@data-month='2022-04']//*[@class='sbox5-monthgrid-datenumber-number'][text()='1']")
	WebElement fechaInicio;
	
	@FindBy(xpath = "//*[@class='sbox5-floating-tooltip sbox5-floating-tooltip-opened']//*[@class='sbox5-monthgrid' or @class='sbox5-monthgrid sbox5-compact-view'][@data-month='2022-04']//descendant::div[19]")
	WebElement fechaSalida;
	
	@FindBy(xpath = "//button[@class='sbox5-3-btn -primary -md']")
	WebElement aplicarFechas;
	
	@FindBy(css = ".sbox5-3-double-input")
	WebElement habitaciones;
	
	@FindBy(css = ".stepper__room .stepper__room__row:nth-child(1) button.steppers-icon-right.stepper__icon")
	WebElement agregaradulto;
	
	@FindBy(css = ".stepper__room .stepper__room__row:nth-child(2) button.steppers-icon-right.stepper__icon")
	WebElement agregarmenor;
	
	@FindBy(css = ".select.select")
	WebElement edades;
	
	@FindBy(xpath = "//select[@class='select']/option[@class='select-option'][@value='8']")
	WebElement edadMenor;
	
	@FindBy(xpath = "//*[@class='distribution__container distribution__type__rooms']//*[@class='stepper__room__footer ']//*[@class='btn-text'][text()='Aplicar']")
	WebElement aplicarHabitaciones;
	
	@FindBy(xpath = "//*[@class='sbox5-box-container']//*[@class='btn-text'][text()='Buscar']")
	WebElement buscarAlojamiento;
	
	public DespegarAlojamientosPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void elegirCiudad(String destino) throws Exception{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		click(driver,By.cssSelector("div.input-container>input[placeholder='Ingresá una ciudad, alojamiento o punto de interés']"));
		this.ciudadBuscar.sendKeys(destino);
		Thread.sleep(2000);
		this.ciudadBuscar.sendKeys(Keys.CONTROL);
		Thread.sleep(2000);
		this.ciudadBuscar.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}
	
	public void elegirFechas() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		click(driver, By.cssSelector("div.input-container>input[placeholder='Entrada']"));
		click(driver, By.xpath("//*[@class='sbox5-floating-tooltip sbox5-floating-tooltip-opened']//*[@class='sbox5-monthgrid' or @class='sbox5-monthgrid sbox5-compact-view'][@data-month='2022-04']//*[@class='sbox5-monthgrid-datenumber-number'][text()='1']"));
		click(driver, By.xpath("//*[@class='sbox5-floating-tooltip sbox5-floating-tooltip-opened']//*[@class='sbox5-monthgrid' or @class='sbox5-monthgrid sbox5-compact-view'][@data-month='2022-04']//descendant::div[19]"));
		js.executeScript("window.scrollBy(0,250)", "");
		click(driver,By.xpath("//button[@class='sbox5-3-btn -primary -md']"));
		js.executeScript("window.scrollBy(0,-250)", "");
	}
	public void elegirHabitaciones() {
		click(driver, By.cssSelector(".sbox5-3-double-input"));
		click(driver, By.cssSelector(".stepper__room .stepper__room__row:nth-child(1) button.steppers-icon-right.stepper__icon"));
		click(driver, By.cssSelector(".stepper__room .stepper__room__row:nth-child(2) button.steppers-icon-right.stepper__icon"));
		click(driver, By.cssSelector(".select.select"));
		click(driver, By.xpath( "//select[@class='select']/option[@class='select-option'][@value='8']"));
		click(driver, By.xpath("//*[@class='distribution__container distribution__type__rooms']//*[@class='stepper__room__footer ']//*[@class='btn-text'][text()='Aplicar']"));
	}
	
	public DespegarHotelesPage buscarHotel() {
		click(driver, By.xpath("//*[@class='sbox5-box-container']//*[@class='btn-text'][text()='Buscar']"));
		findElementToExist(driver,By.cssSelector("span.accommodation-name.-eva-3-ellipsis"));
		return new DespegarHotelesPage(this.driver);
	}
	
	public DespegarHotelesPage buscarHotel(String destino) throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		click(driver,By.cssSelector("div.input-container>input[placeholder='Ingresá una ciudad, alojamiento o punto de interés']"));
		this.ciudadBuscar.sendKeys(destino);
		Thread.sleep(2000);
		this.ciudadBuscar.sendKeys(Keys.CONTROL);
		Thread.sleep(2000);
		this.ciudadBuscar.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		//this.ciudadBuscar.submit();
		this.calendario.click();
		findElementToExist(driver, By.xpath("//*[@class='sbox5-floating-tooltip sbox5-floating-tooltip-opened']//*[@class='sbox5-monthgrid' or @class='sbox5-monthgrid sbox5-compact-view'][@data-month='2022-04']//*[@class='sbox5-monthgrid-datenumber-number'][text()='1']"));
		this.fechaInicio.click();
		findElementToExist(driver, By.xpath("//*[@class='sbox5-floating-tooltip sbox5-floating-tooltip-opened']//*[@class='sbox5-monthgrid' or @class='sbox5-monthgrid sbox5-compact-view'][@data-month='2022-04']//descendant::div[19]"));
		this.fechaSalida.click();
		js.executeScript("window.scrollBy(0,250)", "");
		this.aplicarFechas.click();
		 js.executeScript("window.scrollBy(0,-250)", "");
		this.habitaciones.click();
		findElement(driver, By.cssSelector(".stepper__room .stepper__room__row:nth-child(1) button.steppers-icon-right.stepper__icon"));
		this.agregaradulto.click();
		findElement(driver, By.cssSelector(".stepper__room .stepper__room__row:nth-child(2) button.steppers-icon-right.stepper__icon"));
		this.agregarmenor.click();
		findElementToExist(driver, By.cssSelector(".select.select"));
		this.edades.click();
		findElement(driver, By.xpath( "//select[@class='select']/option[@class='select-option'][@value='8']"));
		this.edadMenor.click();
		findElementToExist(driver, By.xpath("//*[@class='distribution__container distribution__type__rooms']//*[@class='stepper__room__footer ']//*[@class='btn-text'][text()='Aplicar']"));
		this.aplicarHabitaciones.click();
		findElementToExist(driver, By.xpath("//*[@class='sbox5-box-container']//*[@class='btn-text'][text()='Buscar']"));
		this.buscarAlojamiento.click();
		findElementToExist(driver,By.cssSelector("span.accommodation-name.-eva-3-ellipsis"));
		return new DespegarHotelesPage(this.driver);
		
	}
	
}
