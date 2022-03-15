package com.Selenium.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	public static WebElement findElement(WebDriver driver, By by) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}
	
	public static WebElement findElementToExist(WebDriver driver, By by) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		return wait.until(ExpectedConditions.presenceOfElementLocated(by));
	}
	
	public static void click(WebDriver driver, By by) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(by));
		BasePage.findElement(driver, by).click();
	}
}
