package ejagruti.finsys.pageobjects;



import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class loginpage {

	WebDriver localdriverobject;
	public loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.localdriverobject=driver;
		System.out.println("INSIDE CONSTRUCTOR$$$$$$$$$$$$$$$$$$$$$$$$$$$");
	}
	@FindBy(how=How.XPATH,using="//input[@placeholder='Username']")
	public WebElement username;
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Password']")
	public WebElement password;
	@FindBy(how=How.XPATH,using="//span[.='Login']")
	public WebElement loginbutton;
	
	
}
