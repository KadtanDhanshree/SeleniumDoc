package ejagruti.Finsys.operations;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LogintoSBDC 
{
		
	@Given ("^User is on the applications \"(.*)\" page$")
	public boolean LoginPage(String str)
	{
		System.out.println("Driver = "+ApplicationLaunch.driver);
		WebElement top=ApplicationLaunch.driver.findElement(By.xpath("//div[.='"+str+"']"));
		return top.isDisplayed();
	}
	
	//@FindBy(how=How.XPATH,using="//input[@placeholder='Username']")
	//WebElement username;
	@When ("^user enters \"(.*)\" as username$")
	
	public void EnterUsername(String ipvalue) throws InterruptedException
	{
		Thread.sleep(1000);
		//System.out.println("Login Driver "+ApplicationLaunch.driver);
		WebElement username=ApplicationLaunch.driver.findElement(By.xpath("//input[@placeholder='Username']"));
		System.out.println("UN = "+ipvalue);
		username.sendKeys(ipvalue);
	}
	
	//@FindBy(how=How.XPATH,using="//input[@placeholder='Password']")
	//WebElement password;
	@And ("^user enters \"(.*)\" as password$")
	public void EnterPassword(String ipvalue) throws InterruptedException
	{
		Thread.sleep(1000);
		//System.out.println("Login Driver "+ApplicationLaunch.driver);
		WebElement password=ApplicationLaunch.driver.findElement(By.xpath("//input[@placeholder='Password']"));
		System.out.println("PWD = "+ipvalue);
		password.sendKeys(ipvalue);
	}
	
	//@FindBy(how=How.XPATH,using="//span[.='Login']")
	//WebElement login;
	@And ("^user clicks on login button$")
	public void ClickOnLogin() throws InterruptedException
	{
		Thread.sleep(1000);
		//System.out.println("Login Driver "+ApplicationLaunch.driver);
		WebElement login=ApplicationLaunch.driver.findElement(By.xpath("//span[.='Login']"));
		login.click();
	}
	
	@Then ("^user is on the applications home page$")
	public boolean VerifyHomePage() throws InterruptedException
	{
		Thread.sleep(1000);
		WebElement logout=ApplicationLaunch.driver.findElement(By.xpath("//a[.='LOGOUT']"));
		return logout.isDisplayed();
	}
	
	@And ("^user gets the message starting with \"(.*)\" on the top$")
	public boolean VerifyWelcomePage(String str1) throws InterruptedException
	{
		Thread.sleep(1000);
		WebElement welcome=ApplicationLaunch.driver.findElement(By.xpath("//span[.='Welcome dummy[FM]']"));
		return welcome.isDisplayed();
	}
	
	@Then ("^user is on the application Login page with Error message$")
	public boolean LoginPageWithError() throws InterruptedException
	{
		Thread.sleep(1000);
		WebElement top=ApplicationLaunch.driver.findElement(By.xpath("//div[.='Login to SBDC']"));
		return top.isDisplayed();
	}
	
	//@FindBy(how=How.XPATH,using="//*[@id='error']")
	//WebElement error;
	@And ("^User gets the Error message \"(.*)\" at the bottom$")
	public String IsAnyErrorExist(String str1) throws InterruptedException
	{
		Thread.sleep(1000);
		WebElement error=ApplicationLaunch.driver.findElement(By.xpath("//*[@id='error']"));
		return error.getText();
	}
	
}
