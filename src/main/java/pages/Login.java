package pages;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driversetup.DriverSetup;
import utils.ConfigReader;
import utils.WebDriverExtensions;

public class Login {
	public WebDriver driver;
	
	By userName = By.cssSelector("input#username");
	By passWord = By.cssSelector("input#password");
	By loginButton = By.cssSelector("button#btn-Login");
	
	public Login(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterUsername(String username)
	{
		driver.findElement(userName).sendKeys(username);
	}
	
	public void enterPassword(String password)
	{
		WebDriverExtensions.ElementToBeClickable(DriverSetup.driver, driver.findElement(passWord), Duration.ofSeconds(60));
		driver.findElement(passWord).sendKeys(password);
	}

	public void clickLogin()
	{
		driver.findElement(loginButton).click();
	}
}
