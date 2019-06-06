package ejagruti.features;

import org.apache.log4j.Logger;

import ejagruti.Config.Config;
import ejagruti.Result.HTMLReportGenerator;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateCompany
{
	final static Logger objLgr =Logger.getLogger(LoginApp.class);
	String sImgPath = "C:\\Users\\Prakash\\Pictures\\Camera Roll\\FirstImg.jpg";
	
//	Temp COde to check the duplication Step Defination
	/*//--user enters "dummyfm" as username
		@When("^user enters \"(.*)\" as username$")
		public void SetUserName(String userName)
		{
		   try	{
			   		System.out.println("Create Company:Login User will be entered as " + userName);
			   		objLgr.info("Create Company::STEP:" + Config.StepCounter++ + " STATUS:PASS, STEP NAME:Login User will be entered as " + userName + ", Exception Info:NA");
		   		}
			catch (Exception objEx)
				{
					objLgr.info("Create Company::STEP:" + Config.StepCounter++ + " STAUS:ERROR, STEP NAME:Login User will be entered as " + userName + ", Exception Info:" + objEx.getMessage());
				}
		}*/
//	Temp COde
	
	
	@When ("^user login in application$")
	public boolean IsUserLoggedIn()
	{
		try
		{
			System.out.println("Verify User is logged in the application.");
			objLgr.info("STEP:" + Config.StepCounter++ + " STATUS:PASS, STEP NAME:When user login in application, Exception Info:NA");
			HTMLReportGenerator.StepDetails("PASS",  "When user login in application", "");
			return true;
		}
		catch(Exception objEx)
		{
			objLgr.info("STEP:" + Config.StepCounter++ + " STATUS:ERROR, STEP NAME:When user login in application, Exception Info: " + objEx.getMessage());
			HTMLReportGenerator.StepDetails("ERROR",  "When user login in application", "Exception cought: - " + objEx.getMessage());
			return false;
		}
	}
	
//	Given user is on "Welcome page" of the application
	@Given ("^user is on \"([^\"]*)\" of the application$")
	public boolean IsWelcomePageOpened(String sPgName)
	{
		try
		{
			System.out.println("Verify that user is on Welcome Page.");
			objLgr.info("STEP:" + Config.StepCounter++ + " STATUS:PASS, STEP NAME:Given user is on " + sPgName + " of the application, Exception Info:NA");
			HTMLReportGenerator.StepDetails("PASS",  "Given user is on " + sPgName + " of the application", sPgName);
			return true;
		}
		catch(Exception objEx)
		{
			objLgr.info("STEP:" + Config.StepCounter++ + " STATUS:ERROR, STEP NAME:Given user is on " + sPgName + " of the application, Exception Info: " + objEx.getMessage());
			HTMLReportGenerator.StepDetails("ERROR",  "Given user is on " + sPgName + " of the application", "Exception cought: - " + objEx.getMessage());
			return false;
		}
	}
	
//	When user clicks on Manage Company link
	@When ("^user clicks on Manage Company link$")
	public void ClickManageCompany()
	{
		try
		{
			System.out.println("User will click on Manage Company link");
			objLgr.info("STEP:" + Config.StepCounter++ + " STATUS:PASS, STEP NAME:When user clicks on Manage Company link, Exception Info:NA");
			HTMLReportGenerator.StepDetails("PASS",  "When user clicks on Manage Company link", "");
		}
		catch(Exception objEx)
		{
			objLgr.info("STEP:" + Config.StepCounter++ + " STATUS:ERROR, STEP NAME:When user clicks on Manage Company link, Exception Info: " + objEx.getMessage());
			HTMLReportGenerator.StepDetails("ERROR",  "When user clicks on Manage Company link", "Exeception cought : - " + objEx.getMessage());
		}
	}
	
//	Then application adds new tab as "Manage Company" in Main Activity
	@Then ("^application adds new tab as \"([^\"]*)\" in Main Activity$")
	public boolean IsCompanyTabDisplay(String sTabName)
	{
		try
		{
			System.out.println("System shows the 'ManageCompany' tab.");
			objLgr.info("STEP:" + Config.StepCounter++ + " STATUS:PASS, STEP NAME:Then application adds new tab as " + sTabName + " in Main Activity, Exception Info:NA");
			HTMLReportGenerator.StepDetails("PASS",  "Then application adds new tab as " + sTabName + " in Main Activity", "");
			return true;
		}
		catch (Exception objEx)
		{
			objLgr.info("STEP:" + Config.StepCounter++ + " STATUS:ERROR, STEP NAME:Then application adds new tab as " + sTabName + " in Main Activity, Exception Info: " + objEx.getMessage());
			HTMLReportGenerator.StepDetails("ERROR",  "Then application adds new tab as " + sTabName + " in Main Activity", "Exception cought: - " + objEx.getMessage());
			return false;
		}
	}
	
//	And application displays "Company" table
	@And ("^application displays \"([^\"]*)\" table$")
	public boolean IsCompanyTableDisplay(String sTblName)
	{
		try
		{
			System.out.println("Application will show 'Company' table after clicking on 'Manage Company' link.");
			objLgr.info("STEP:" + Config.StepCounter++ + " STATUS:PASS, STEP NAME:And application displays " + sTblName + " table, Exception Info:NA");
			HTMLReportGenerator.StepDetails("PASS",  "And application displays " + sTblName + " table", sTblName);
			return true;
		}
		catch(Exception objEx)
		{
			objLgr.info("STEP:" + Config.StepCounter++ + " STATUS:ERROR, STEP NAME:And application displays " + sTblName + " table, Exception Info: " + objEx.getMessage());
			HTMLReportGenerator.StepDetails("ERROR",  "And application displays " + sTblName + " table", "Exception cought: - " + objEx.getMessage());
			return false;
		}
	}
	
//	When user clicks on New link in Company table
	@When ("^user clicks on New link in Company table$")
	public void ClickNewCompany()
	{
		try
		{
			System.out.println("User will click on the New Company Link.");
			objLgr.info("STEP:" + Config.StepCounter++ + " STATUS:PASS, STEP NAME:When user clicks on New link in Company table, Exception Info:NA");
			HTMLReportGenerator.StepDetails("PASS",  "When user clicks on New link in Company table", "");
		}
		catch(Exception objEx)
		{
			objLgr.info("STEP:" + Config.StepCounter++ + " STATUS:ERROR, STEP NAME:When user clicks on New link in Company table, Exception Info: " + objEx.getMessage());
			HTMLReportGenerator.StepDetails("ERROR",  "When user clicks on New link in Company table", "Exception cought: - " + objEx.getMessage());
		}
	}
	
//	When user enters "TCS" as COMPNAY_NAME
	@When ("^user enters \"([^\"]*)\" as COMPNAY_NAME$")
	public void EnterComapnyName(String sCompName)
	{
		try
		{
			System.out.println("User will enter Company name as " + sCompName);
			objLgr.info("STEP:" + Config.StepCounter++ + " STATUS:PASS, STEP NAME:When user enters " + sCompName + " as COMPNAY_NAME, Exception Info:NA");
			HTMLReportGenerator.StepDetails("PASS",  "When user enters " + sCompName + " as COMPNAY_NAME", sCompName);
		}
		catch(Exception objEx)
		{
			objLgr.info("STEP:" + Config.StepCounter++ + " STATUS:ERROR, STEP NAME:When user enters " + sCompName + " as COMPNAY_NAME, Exception Info: " + objEx.getMessage());
			HTMLReportGenerator.StepDetails("ERROR",  "When user enters " + sCompName + " as COMPNAY_NAME", "Exception cought: - " + objEx.getMessage());
		}
	}
	
//	user enters "IT" as COMPNAY_TYPE
//	And user enters "IT" as COMPNAY_TYPE
	@And ("^user enters \"([^\"]*)\" as COMPNAY_TYPE$")
	public void EnterCompanyType(String sCompType)
	{
		try
		{
			System.out.println("User will enter the company type as " + sCompType);
			objLgr.info("STEP:" + Config.StepCounter++ + " STATUS:PASS, STEP NAME:And user enters " + sCompType + " as COMPNAY_TYPE, Exception Info:NA");
			HTMLReportGenerator.StepDetails("PASS",  "And user enters " + sCompType + " as COMPNAY_TYPE", sCompType);
		}
		catch(Exception objEx)
		{
			objLgr.info("STEP:" + Config.StepCounter++ + " STATUS:ERROR, STEP NAME:And user enters " + sCompType + " as COMPNAY_TYPE, Exception Info: " + objEx.getMessage());
			HTMLReportGenerator.StepDetails("ERROR",  "And user enters " + sCompType + " as COMPNAY_TYPE", "Exception cought: - " + objEx.getMessage());
		}
	}
	
//	user enters "INDIA" as COUNTRY
//	And user enters "INDIA" as COUNTRY
	@And ("^user enters \"([^\"]*)\" as COUNTRY$")
	public void SelectCountry (String sCountry)
	{
		try
		{
			System.out.println("User will select the Country as " + sCountry);
			objLgr.info("STEP:" + Config.StepCounter++ + " STATUS:PASS, STEP NAME:And user enters " + sCountry + " as COUNTRY, Exception Info:NA");
			HTMLReportGenerator.StepDetails("PASS",  "And user enters " + sCountry + " as COUNTRY", sCountry);
		}
		catch(Exception objEx)
		{
			objLgr.info("STEP:" + Config.StepCounter++ + " STATUS:ERROR, STEP NAME:And user enters " + sCountry + " as COUNTRY, Exception Info: " + objEx.getMessage());
			HTMLReportGenerator.StepDetails("ERROR",  "And user enters " + sCountry + " as COUNTRY", "Exception cought: - " + objEx.getMessage());
		}
	}
	
//	user enters "MAHARASTRA" as STATE
//	And user enters "MAHARASTRA" as STATE
	@And ("^user enters \"([^\"]*)\" as STATE$")
	public void SelectState (String sState)
	{
		try
		{
			System.out.println("User will select the state " + sState);
			objLgr.info("STEP:" + Config.StepCounter++ + " STATUS:PASS, STEP NAME:And user enters " + sState + " as STATE, Exception Info:NA");
			HTMLReportGenerator.StepDetails("PASS",  "And user enters " + sState + " as STATE", sState);
		}
		catch(Exception objEx)
		{
			objLgr.info("STEP:" + Config.StepCounter++ + " STATUS:ERROR, STEP NAME:And user enters " + sState + " as STATE, Exception Info:" + objEx.getMessage());
			HTMLReportGenerator.StepDetails("ERROR",  "And user enters " + sState + " as STATE", "Exception cought: - " + objEx.getMessage());
		}
	}
	
//	And user enters "PUNE" as CITY
	@And ("^user enters \"([^\"]*)\" as CITY$")
	public void EnterCity(String sCity)
	{
		try
		{
			System.out.println("User will enter the city as " + sCity);
			objLgr.info("STEP:" + Config.StepCounter++ + " STATUS:PASS, STEP NAME:And user enters " + sCity + " as CITY, Exception Info:NA");
			HTMLReportGenerator.StepDetails("PASS",  "And user enters " + sCity + " as CITY", sCity);
		}
		catch(Exception objEx)
		{
			objLgr.info("STEP:" + Config.StepCounter++ + " STATUS:ERROR, STEP NAME:And user enters " + sCity + " as CITY, Exception Info:" + objEx.getMessage());
			HTMLReportGenerator.StepDetails("ERROR",  "And user enters " + sCity + " as CITY", "Exception cought: - " + objEx.getMessage());
		}
	}
	
//	User enters "abc@ejagruti.com" as EMAIL
//	And user enters "abc@ejagruti.com" as EMAIL
	@And ("^user enters \"([^\"]*)\" as EMAIL$")
	public void EnterEMail(String sEmail)
	{
		try
		{
			System.out.println("User will enter the Email as " + sEmail);
			objLgr.info("STEP:" + Config.StepCounter++ + " STATUS:PASS, STEP NAME:And user enters " + sEmail + " as EMAIL, Exception Info:NA");
			HTMLReportGenerator.StepDetails("PASS",  "And user enters " + sEmail + " as EMAIL", sEmail);
		}
		catch(Exception objEx)
		{
			objLgr.info("STEP:" + Config.StepCounter++ + " STATUS:ERROR, STEP NAME:And user enters " + sEmail + " as EMAIL, Exception Info:" + objEx.getMessage());
			HTMLReportGenerator.StepDetails("ERROR",  "And user enters " + sEmail + " as EMAIL", "Exception cought: - " + objEx.getMessage());
		}
	}
	

//	And user enters "ABCYZ1234A" as PAN
	@And ("^user enters \"([^\"]*)\" as PAN$")
	public void EnterPAN(String sPAN)
	{
		try
		{
			System.out.println("User will enter the PAN as " + sPAN);
			objLgr.info("STEP:" + Config.StepCounter++ + " STATUS:PASS, STEP NAME:And user enters " + sPAN + " as PAN, Exception Info:NA");
			HTMLReportGenerator.StepDetails("PASS",  "And user enters " + sPAN + " as PAN", sPAN);
		}
		catch(Exception objEx)
		{
			objLgr.info("STEP:" + Config.StepCounter++ + " STATUS:ERROR, STEP NAME:And user enters " + sPAN + " as PAN, Exception Info:" + objEx.getMessage());
			HTMLReportGenerator.StepDetails("ERROR",  "And user enters " + sPAN + " as PAN", "Exception cought: - " + objEx.getMessage());
		}
	}
	
//	And user enters "XYZAB9876Z" as TIN
	@And ("^user enters \"([^\"]*)\" as TIN$")
	public void EnterTIN(String sTIN)
	{
		try
		{
			System.out.println("User will enter the PAN as " + sTIN);
			objLgr.info("STEP:" + Config.StepCounter++ + " STATUS:PASS, STEP NAME:And user enters " + sTIN + " as TIN, Exception Info:NA");
			HTMLReportGenerator.StepDetails("PASS",  "And user enters " + sTIN + " as TIN", sTIN);
		}
		catch(Exception objEx)
		{
			objLgr.info("STEP:" + Config.StepCounter++ + " STATUS:ERROR, STEP NAME:And user enters " + sTIN + " as TIN, Exception Info:" + objEx.getMessage());
			HTMLReportGenerator.StepDetails("ERROR",  "And user enters " + sTIN + " as TIN", "Exception cought: - " + objEx.getMessage());
		}
	}
	
//	And user clicks on Save button
	@And ("^user clicks on Save button$")
	public void ClickToSave()
	{
		try
		{
			System.out.println("User will click to save.");
			objLgr.info("STEP:" + Config.StepCounter++ + " STATUS:PASS, STEP NAME:And user clicks on Save button, Exception Info:NA");
			HTMLReportGenerator.StepDetails("PASS",  "And user clicks on Save button", "");
		}
		catch(Exception objEx)
		{
			objLgr.info("STEP:" + Config.StepCounter++ + " STATUS:ERROR, STEP NAME:And user clicks on Save button, Exception Info:" + objEx.getMessage());
			HTMLReportGenerator.StepDetails("ERROR",  "And user clicks on Save button", "Exception cought: - " + objEx.getMessage());
		}
	}
	
//	Application display the new record by name as "TSC" in first row of the table
//	Then application display the new record by name as "TSC" in first row of the table
	@Then ("^application display the new record by name as \"([^\"]*)\" in first row of the table$")
	public boolean ValidateNewRecord (String sCompName)
	{
		try
		{
			System.out.println("Application will show new record in table.");
			objLgr.info("STEP:" + Config.StepCounter++ + " STATUS:PASS, STEP NAME:Then application display the new record by name as " + sCompName + " in first row of the table, Exception Info:NA");
			HTMLReportGenerator.StepDetails("PASS",  "Then application display the new record by name as " + sCompName + " in first row of the table", "", sImgPath);
			return true;
		}
		catch(Exception objEx)
		{
			objLgr.info("STEP:" + Config.StepCounter++ + " STATUS:ERROR, STEP NAME:Then application display the new record by name as " + sCompName + " in first row of the table, Exception Info:" + objEx.getMessage());
			HTMLReportGenerator.StepDetails("ERROR",  "Then application display the new record by name as " + sCompName + " in first row of the table", "Exception cought: - " + objEx.getMessage(), sImgPath);
			return false;
		}
	}
}
