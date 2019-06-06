package ejagruti.features;

import org.apache.log4j.Logger;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import ejagruti.Result.HTMLReportGenerator;


public class Hooks
	{
		final static Logger objLgr = Logger.getLogger(CreateCompany.class);
		@Before
		public void StartUp(Scenario objScr)
		{
//			***Code for log file header and step counter reset.
			objLgr.info("************" + objScr.getName() + "************");
//			objLgr.info("**************////" + objScr.getSourceTagNames());
		    ejagruti.Config.Config.StepCounter = 1;
		    System.out.println("This will run before the Scenario.");
		    objLgr.info("This will run before the Scenario.");
		    
//		    Code for initiate the ExtentReport object
//		    -- Need to parameterize the report file.
//		    String sRptPath = "C:\\Abhijit\\ejagruti-automation\\ejagruti_Cucumber\\result\\extentreport\\" +  + ".html"
		    String sRptPath = "C:\\Abhijit\\ejagruti-automation\\ejagruti_Cucumber\\result\\extentreport\\AppLogin.html";
		    try
		    	{
		    		HTMLReportGenerator.TestSuiteStart(sRptPath, "ejagruti");
		    	}
		    catch (Exception objEx)
		    {
		    	System.out.println("Handled the Extent Report exception" + objEx.getMessage());
		    }
		    
		    
//			Code for start ExtentReport logger.
		    HTMLReportGenerator.TestCaseStart(objScr.getName(), objScr.getName() + "_description");
		} 
		
		@After
		public void EndWith(Scenario objScr)
		{
			System.out.println("This will run after the Scenario.");
			objLgr.info("This will run after the scenario.");
			objLgr.info("************End of " + objScr.getName() + "***********");
			objLgr.info("------------------------------------------------------------------");
			
//			Code for end ExtentReport logger.
			HTMLReportGenerator.TestCaseEnd();
			
//			TEMP: Test Suit Ending code.
			HTMLReportGenerator.TestSuiteEnd();

		}
	}