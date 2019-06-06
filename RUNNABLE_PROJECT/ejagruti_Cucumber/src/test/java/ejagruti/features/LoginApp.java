package ejagruti.features;

import org.apache.log4j.Logger;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import ejagruti.Config.Config;
import ejagruti.Result.HTMLReportGenerator;


public class LoginApp 
{
	final static Logger objLgr = Logger.getLogger(LoginApp.class);
	String sImgPath = "C:\\Users\\Prakash\\Pictures\\Camera Roll\\FirstImg.jpg";
	
	@When("^user opens the \"([^\"]*)\" browser$")
	public void OpenBrowser(String browsername)
	{
	   try	{
				System.out.println("this will open the browser: " + browsername);
				objLgr.info("STEP:" + Config.StepCounter++ + " STATUS:PASS, STEP NAME:When user opens the " + browsername + " browser, Exception Info:NA");
				HTMLReportGenerator.StepDetails("PASS",  "When user opens the " + browsername + " browser", "");
		   	}
	   catch (Exception objEx)
	   		{
		   		objLgr.info("STEP:" + Config.StepCounter++ + " STATUS:ERROR, STEP NAME:When user opens the " + browsername + " browser, Exception Info: " + objEx.getMessage());
		   		HTMLReportGenerator.StepDetails("ERROR",  "When user opens the " + browsername + " browser", objEx.getMessage());
	   		}
//	   String Status,String StepName,String StepDetails
	   
	}
	
	//  And user enter the url "http://localhost:90/finsys"
	@And("^user enter the url \"([^\"]*)\"$")
	public void EnterURL(String url)
	{
	   try	{
		   		System.out.println("URL will be entered here " + url);
		   		objLgr.info("STEP:" + Config.StepCounter++ + " STATUS:PASS, STEP NAME:And user enter the url " + url + ", Exception Info:NA");
		   		HTMLReportGenerator.StepDetails("PASS", "And user enter the url ", url);
	   		}
		catch(Exception objEx)
			{
				objLgr.info("Step:" + Config.StepCounter++ + " STATUS:ERROR, STEP NAME:And user enter the url " + url + ", Exception Info:" + objEx.getMessage());
				HTMLReportGenerator.StepDetails("ERROR", "And user enter the url " + url, "Exception cought: - " + objEx.getMessage());
			}
	}
	
   //Given user is on the application login page
	@Given ("^user is on the application login page$")
   public boolean IsAppOpened()
   {
	   try	{
			   System.out.println("User landed on Login page.");
			   objLgr.info("STEP:" + Config.StepCounter++ + " STATUS:PASS, STEP NAME:Given user is on the application login page. Exception Info:NA");
			   HTMLReportGenerator.StepDetails("PASS", "Given user is on the application login page", "");
			   return true;
	   		}
	   catch(Exception objEx)
	   		{
		   		objLgr.info("STEP:" + Config.StepCounter++ + " STATUS:ERROR, STEP NAME:Given user is on the application login page.Exception Info: " + objEx.getMessage());
		   		HTMLReportGenerator.StepDetails("ERROR", "Given user is on the application login page", "Exception cought: - " + objEx.getMessage());
		   		return false;
	   		}
   }
	
   //--user enters "dummyfm" as username
	@When("^user enters \"([^\"]*)\" as username$")
	public void SetUserName(String userName)
	{
	   try	{
		   		System.out.println("Login User will be entered as " + userName);
		   		objLgr.info("STEP:" + Config.StepCounter++ + " STATUS:PASS, STEP NAME:When user enters " + userName + " as username, Exception Info:NA");
		   		HTMLReportGenerator.StepDetails("PASS", "When user enters " + userName + " as username", userName);
	   		}
		catch (Exception objEx)
			{
				objLgr.info("STEP:" + Config.StepCounter++ + " STAUS:ERROR, STEP NAME:When user enters " + userName + " as username, Exception Info:" + objEx.getMessage());
				HTMLReportGenerator.StepDetails("ERROR", "When user enters " + userName + " as username", "Exception cought: - " + objEx.getMessage());
			}
	}
	
	//--user enters "passw0rd" as password
	@And("user enters \"([^\"]*)\" as password$")
	public void SetPassword(String userPass)
	{
	   try	{
		   		System.out.println("User entered password as " + userPass);
		   		objLgr.info("STEP:" + Config.StepCounter++ + " STATUS:PASS, STEP NAME:And user enters "+ userPass + " as password, Exception Info:NA");
		   		HTMLReportGenerator.StepDetails("PASS", "And user enters "+ userPass + " as password", userPass);
	   		}
		catch(Exception objEx)
			{
				objLgr.info("STEP:" + Config.StepCounter++ + " STATUS:ERROR, STEP NAME:And user enters "+ userPass + " as password, Exception Info:" + objEx.getMessage());
				HTMLReportGenerator.StepDetails("ERROR", "And user enters "+ userPass + " as password", "Exception cought: - " + objEx.getMessage());
			}
		
	}
	
	//--And user clicks on login button
	@And ("user clicks on login button$")
	public void ClickLogin()
	{
	   try	{
		   		System.out.println("Login button will be clicked.");
		   		objLgr.info("STEP:" + Config.StepCounter++ + " STATUS:PASS, STEP NAME:And user clicks on login button. Exception Info:NA");
		   		HTMLReportGenerator.StepDetails("PASS", "And user clicks on login button", "");
	   		}
		catch(Exception objEx)
			{
				objLgr.info("STEP:" + Config.StepCounter++ + " STATUS:ERROR, STEP NAME:And user clicks on login button. Exception Info: " + objEx.getMessage());
				HTMLReportGenerator.StepDetails("ERROR", "And user clicks on login button", "Exception cought: - " + objEx.getMessage());
			}
	}
	
	//--user is on the application home page and gets welcome message.
	//	Then user is on the application home page
	@Then ("^user is on the application home page$")
	public boolean validateUserLoggedIn()
	{
		try	{
				System.out.println("User Login validation.");
				objLgr.info("STEP:" + Config.StepCounter++ + " STATUS:PASS, STEP NAME:Then user is on the application home page. Exception Info:NA");
				HTMLReportGenerator.StepDetails("PASS", "Then user is on the application home page.", "", sImgPath);
				return true;
			}
		catch(Exception objEx)
			{
				objLgr.info("STEP:" + Config.StepCounter++ + " STATUS:ERROR, STEP NAME:Then user is on the application home page. Exception Info: " + objEx.getMessage());
				HTMLReportGenerator.StepDetails("ERROR", "Then user is on the application home page.", "Exception cought: - " + objEx.getMessage(), sImgPath);
				return false;
			}
	}
	
	@Then ("^user gets \"([^\"]*)\" message$")
	public boolean validateLoginMsg(String sMsg)
	{
		try	{
				System.out.println("Validate login message.");
				objLgr.info("STEP:" + Config.StepCounter++ + " STATUS:PASS, STEP NAME:Then user gets '" + sMsg + "' message. Exception Info:NA");
				HTMLReportGenerator.StepDetails("PASS", "Then user gets '" + sMsg + "' message", sMsg, sImgPath);
				return true;
			}
		catch(Exception objEx)
			{
				objLgr.info("STEP:" + Config.StepCounter++ + " STATUS:ERROR, STEP NAME:Then user gets '" + sMsg + "' message. Exception Info:" + objEx.getMessage());
				HTMLReportGenerator.StepDetails("ERROR", "Then user gets '" + sMsg + "' message", "Exception cought: - " + objEx.getMessage());
				return false;
			}
	}
}