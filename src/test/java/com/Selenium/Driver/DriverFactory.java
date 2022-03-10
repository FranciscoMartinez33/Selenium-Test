package com.Selenium.Driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;

public class DriverFactory {
	
	private enum browsers {
		EDGE, SAFARI, FIREFOX, CHROME
	}
	
	public static WebDriver LevantarBrowser (WebDriver driver, String browsername, String URL) {
		{
			switch (browsers.valueOf(browsername)) {
			case CHROME: //Using WebDriver
			{
				System.setProperty("webdriver.chrome.driver","C:\\Users\\franc\\eclipse-workspace\\Automationjava\\src\\main\\java\\recursos\\chromedriver.exe");
				Reporter.log("Abro Browser");
				driver = new ChromeDriver();
				break;
				
			}
			
			case FIREFOX: //Using WebDriver
			{
				System.setProperty("webdriver.gecko.driver","C:\\Users\\franc\\eclipse-workspace\\Automationjava\\src\\main\\java\\recursos\\geckodriver.exe");
				Reporter.log("Abro Browser");
				driver = new FirefoxDriver();
				break;
				
			}
			
			case EDGE:
			{
				System.setProperty("webdriver.msedgedriver.driver","C:\\Users\\franc\\eclipse-workspace\\Automationjava\\src\\main\\java\\recursos\\msedgedriver.exe");
				Reporter.log("Abro Browser");
				driver = new EdgeDriver();
				break;
				
			}
			
			default :
				Reporter.log("No selecciono ningun browser correcto, se le asignara Chrome");
				System.setProperty("webdriver.chrome.driver","C:\\Users\\franc\\eclipse-workspace\\Automationjava\\src\\main\\java\\recursos\\chromedriver.exe");
				Reporter.log("Abro Browser");
				driver = new ChromeDriver();
				break;
				
		}
	}
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
}
}
