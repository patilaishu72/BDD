package StepDefination;

import org.junit.Assert;
//import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.LoginPage;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;


public class StepDef {
	
	WebDriver driver;
	public LoginPage loginpg;
	
	@Given("User launch Chrome browser")
	public void user_launch_chrome_browser() {
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    
	    loginpg = new LoginPage(driver);
	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
		driver.get(url);
	}

	@When("User enter Email as {string} and Password as {string}")
	public void user_enter_email_as_and_password_as(String emailadress, String pwd) {
	   loginpg.enterEmail(emailadress);
	   loginpg.enterPass(pwd);
	}

	@When("Click on Login")
	public void click_on_login() {
	   loginpg.clickOnLogin();
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String expectedTitle) {
	   String actualTitle= driver.getTitle();
	   
	   if(actualTitle.equals(expectedTitle))
	   {
//		   Assert.assertTrue(true);
		   Assert.assertTrue(true);
	   }
	   else
	   {
//		   Assert.assertTrue(false);
		   Assert.assertTrue(false);
	   }
	}

	@When("User click on Log out link")
	public void user_click_on_log_out_link() {
		loginpg.clickOnLogout();
	}

	@Then("close browser")
	public void close_browser() {
	    driver.close();
	    driver.quit();
	    
	}

}
