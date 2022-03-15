package com.Selenium.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DespegarHotelesPage extends BasePage {
	private WebDriver driver = null;
	@FindBy(css = "button.eva-3-btn.-md.-primary.-eva-3-fwidth")
	WebElement buttonDetail;
	@FindBy(css = "span.accommodation-name.-eva-3-ellipsis")
	WebElement titulo;
	
	public DespegarHotelesPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public boolean hotelEsVisible() {
		return this.titulo.isDisplayed();
	}
	public DespegarResultadosPage verDetalle() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
		buttonDetail.click();
		return new DespegarResultadosPage(this.driver);
	}
}
