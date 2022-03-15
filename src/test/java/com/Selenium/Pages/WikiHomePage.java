package com.Selenium.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikiHomePage {
	WebDriver driver;
	
	public WikiHomePage(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(id = "searchInput")
	private WebElement searchInput;
	
	public boolean searchInputEsVisible() {
		return this.searchInput.isDisplayed();
	}
	
	public WikiResultsPage searchText(String dato)
	{
		this.searchInput.sendKeys(dato);
		searchInput.submit();
		return new WikiResultsPage(this.driver);
		
	}
}
