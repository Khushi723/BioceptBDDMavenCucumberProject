package stepdefinition;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import driversetup.DriverSetup;
import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.Login;
import utils.ConfigReader;
import utils.ElementUtil;
import utils.WebDriverExtensions;

public class LoginSteps {	
	
	private Login login;
	private ElementUtil elementutil;
	private String PageTitle;
	
	@Given("User is on the Login page")
	public void user_is_on_the_login_page() {	
		
	//goToURL("https://bioceptbetaweb-qa.azurewebsites.net/Account/Login");
	}
	
	@When("User gets the title of the page")
	public void user_gets_the_title_of_the_page() {
		elementutil = new ElementUtil(DriverSetup.driver);
		PageTitle = elementutil.getPageTitle();
	}
	
	@Then("The page title should be {string}")
	public void the_page_tile_should_be(String expectedTitle) {
		assertEquals(PageTitle, expectedTitle);
	}
	
	@When("user enters the username as {string}")
	public void user_enters_the_username_as(String username) {
	    login = new Login(DriverSetup.driver);
		login.enterUsername(username);
	}
	
	@When("user enters the password as {string}")
	public void user_enters_the_password_as(String password) {
		login.enterPassword(password);
	}
	
	@When("user clicks on the {string} button")
	public void user_clicks_on_the_button(String string) {
	    login.clickLogin();
	}
}
