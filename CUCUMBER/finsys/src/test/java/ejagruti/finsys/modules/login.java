package ejagruti.finsys.modules;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ejagruti.finsys.pageobjects.baseclass;
import ejagruti.finsys.pageobjects.homepage;
import ejagruti.finsys.pageobjects.loginpage;


public class login {
	//--------------Operations---------
		loginpage loginpageobj=null;
		 homepage homepageobj=null;
	 @When("^user opens the \"(.*)\" browser$")
	 public void OpenBrowser(String BrowserName)
	 {
				System.out.println(BrowserName+" -------------------");
				
				{if(BrowserName.equalsIgnoreCase("firefox"))
					baseclass.driver=new FirefoxDriver();
				}
     }
	  @Given("^user enter the url \"(.*)\"$")
	  public void LaunchApplication(String URL)
	  {
				System.out.println("url:"+URL);
				baseclass.driver.get(URL);
				baseclass.driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
				baseclass.wait=new WebDriverWait(baseclass.driver, 30);
      }
	  @Given("^user is on the application login page$")
	  public void LoginPage()
	  {
		  loginpageobj=new loginpage(baseclass.driver);
	  }
	 
	  @When("^user enters \"(.*)\" as username$")
	  public void EnterUserName(String Username)
	  {
			loginpageobj.username.sendKeys(Username);
	  }
		@When("^user enters \"(.*)\" as password$")
		public void EnterPassword(String Password)
		{
			System.out.println(Password+" ---------------");
			loginpageobj.password.sendKeys(Password);
		}
		@When("^user clicks on login button$")
		public void LoginButtonClick()
		{
			loginpageobj.loginbutton.click();
		}
		@Given("^user is on the application home page$")
		  public void HomePage()
		  {
				
				homepageobj=new homepage(baseclass.driver);
		  }
		 @Then("^user gets the message starting with \"(.*)\" on the top$")
			public void CheckForHomePage(String message)
			{
			 baseclass.wait.until(ExpectedConditions.textToBePresentInElement(homepageobj.logout, "LOGOUT"));
			 	String welcomemsg=homepageobj.welcomemessage.getText();
			 	System.out.println(welcomemsg+" --------------------");
			}
		 @Given("^temp$")
		 public void delthis()
		 {
			 System.out.println("temp is calling");
		 }
		 @When("^user clicks on logout button$")
			public void ClickOnLogout()
			{
			 	homepageobj.logout.click();
			}
		 
		// ==================================================================

		@Before()
		public void BeforeEveryScenario(Scenario scenario)
		{
			System.out.println("new scenario is started "+scenario.getName());
		}
}
