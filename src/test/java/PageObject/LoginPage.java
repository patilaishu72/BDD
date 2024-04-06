package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;
	
	public LoginPage(WebDriver rDriver)
	{
		ldriver=rDriver;
		
		PageFactory.initElements(rDriver, this);
	}
	
	@FindBy(id="Email")
	WebElement email;
	
	@FindBy(id="Password")
	WebElement pass;
	
	@FindBy(xpath="//button[@class=\"button-1 login-button\"]")
	WebElement loginButton;
	
	@FindBy(xpath="/html/body/div[3]/nav/div/ul/li[3]/a")
	WebElement logout;
	
	public void enterEmail(String emailAdd)
	{
		email.clear();
		email.sendKeys(emailAdd);
	}
	
	public void enterPass(String password)
	{
		pass.clear();
		pass.sendKeys(password);
	}
	
	public void clickOnLogin()
	{
		loginButton.click();
	}
	
	public void clickOnLogout()
	{
		logout.click();
	}
	
	
	
	
	
}
