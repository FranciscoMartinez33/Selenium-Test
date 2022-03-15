package com.Selenium.Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikiResultsPage {

	@FindBy(id="firstHeading")
	WebElement titulo;
	
	private WebDriver driver = null;
	
	public WikiResultsPage (WebDriver drive) {
		this.driver = driver;
		PageFactory.initElements(drive, this);
	}
	public boolean tituloEsVisible() {
		return this.titulo.isDisplayed();
	}
}
