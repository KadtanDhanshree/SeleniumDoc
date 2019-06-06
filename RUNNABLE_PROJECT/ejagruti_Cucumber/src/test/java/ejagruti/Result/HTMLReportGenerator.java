package ejagruti.Result;

import java.net.InetAddress;
import java.net.UnknownHostException;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.relevantcodes.extentreports.NetworkMode;



public class HTMLReportGenerator {

	static ExtentReports report=null;
	static ExtentTest logger; 
	
	public static void TestSuiteStart(String ResultHTMLFilePath,String UserName) throws UnknownHostException
	{
		report = new ExtentReports(ResultHTMLFilePath, false, NetworkMode.OFFLINE);
		
		report
			.addSystemInfo("Host Name", InetAddress.getLocalHost().getHostName())
	        .addSystemInfo("Environment", "QA")
	        .addSystemInfo("User Name", UserName);
	}
	public static void TestSuiteEnd()
	{
		report.flush();report.close();
	}
	public static void TestCaseStart(String TestName,String Description)
	{
		logger=report.startTest(TestName, Description);
	}
	public static void TestCaseEnd()
	{
		report.endTest(logger);
		
	}
	public static void StepDetails(String Status,String StepName,String StepDetails,String objectImagePath)
	{
		String tbl=StepDetails+"<br>"+logger.addScreenCapture(objectImagePath);
		if(Status.equalsIgnoreCase("pass"))
		{		logger.log(LogStatus.PASS, StepName, tbl);}
		else if(Status.equalsIgnoreCase("fail"))
		{		logger.log(LogStatus.FAIL, StepName, tbl);}
		else if(Status.equalsIgnoreCase("error"))
		{		logger.log(LogStatus.ERROR, StepName, StepDetails);}
		else if(Status.equalsIgnoreCase("info"))
		{		logger.log(LogStatus.INFO, StepName, StepDetails);}
		else
		{logger.log(LogStatus.INFO, StepName, StepDetails);}
	}
	//Using polymorphism, we can use the the method in different ways...
	//Here, StepDetails has no image parameter and has used to report without screenshot
	public static void StepDetails(String Status,String StepName,String StepDetails)
	{
		if(Status.equalsIgnoreCase("pass"))
		{		logger.log(LogStatus.PASS, StepName, StepDetails);}
		else if(Status.equalsIgnoreCase("fail"))
		{		logger.log(LogStatus.FAIL, StepName, StepDetails);}
		else if(Status.equalsIgnoreCase("error"))
		{		logger.log(LogStatus.ERROR, StepName, StepDetails);}
		else if(Status.equalsIgnoreCase("info"))
		{		logger.log(LogStatus.INFO, StepName, StepDetails);}
		else
		{logger.log(LogStatus.INFO, StepName, StepDetails);}
	}
	
	public static void main(String[] args) throws UnknownHostException {
		String sImgPath = "C:\\Users\\Prakash\\Pictures\\Camera Roll\\FirstImg.jpg";
		TestSuiteStart("C:\\Abhijit\\ejagruti-automation\\ejagruti_Cucumber\\result\\extentreport\\FirstER.html", "ejagruti");
		TestCaseStart("this is test name", "this is description");
		StepDetails("pass", "this is step1", "this is step details1", sImgPath);
		StepDetails("pass", "this is step2", "this is step details2");
		TestCaseEnd();
		TestSuiteEnd();
	}

}
