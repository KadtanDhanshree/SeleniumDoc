package ejagruti.finsys.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class homepage {
	WebDriver localdriverobject;
	public homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.localdriverobject=driver;
	}
	@FindBy(how=How.XPATH,using="//span[contains(text(),'Welcome')]")
	public WebElement welcomemessage;
	@FindBy(how=How.XPATH,using="//a[.='LOGOUT']")
	public WebElement logout;
	
	
}
