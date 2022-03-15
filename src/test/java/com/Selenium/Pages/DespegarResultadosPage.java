package com.Selenium.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DespegarResultadosPage {

	private WebDriver driver = null;
	
	@FindBy(css="h1.accommodation-name.eva-3-h2")
	WebElement titulo;
	
	public DespegarResultadosPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
}
	public boolean tituloEsVisible() throws Exception{
	    Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		return this.titulo.isDisplayed();
	}

}