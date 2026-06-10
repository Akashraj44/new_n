package base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import frameworkfactory.DriverFactory;

import org.openqa.selenium.WebDriver;

public class BaseTest {
	protected WebDriver driver;
	@BeforeMethod
	public void setup() {
		
		driver = DriverFactory.initializeBrowser("Chrome");
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		}
	@AfterMethod
	public void tearDown() {
		if(driver!=null)
			driver.quit();
	}
}
