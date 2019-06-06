package ej.mm.modules;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class Login {

	WebElement objUserName=null;//----declaration of username object
	WebElement objPassword=null;//----declaration of password object
	WebElement objLoginButton=null;//----declaration of loginbutton object
	WebElement objLogoutLink=null;//----declaration of logout link object on the Home Page
	WebElement objErrorMessage=null;//----declaration of error message if login operation failed 
	String actualErrorMessage=null;
	public static String EnterUserName(String userName)
	{
		
		//----write a code here which will first initialize the UserName Object and 
		//store it in objUserName varaible declared above
		
		
		//-----write a code which will perform the operations of entering given userName value into that object
		return "";
	}
	
	public static String EnterPassword(String Password)
	{
		
		//----write a code here which will first initialize the Password Object and 
		//store it in objPassword object varaible declared above
		
		
		//-----write a code which will perform the operations of entering given password value into that object
		return "";
	}
	public static String ClickOnLoginButton()
	{
		
		//----write a code here which will first initialize the Loginbutton Object and 
		//store it in objLoginButton object varaible declared above
		
		
		//-----write a code which will perform the operations of click on LoginButton object
		return "";
	}
	public static String WaitTillHomePageFullyLoaded(int TimeOutInSeconds)
	{
		
		//----Write a code here which will wait till home page appears
				return "";
	}
	public static String CheckForLogoutLinkOnTheHomePage()
	{
		
		//----write a code here which will first initialize the logout link Object and 
		//store it in objLogoutLink varaible declared above
		
		
		//-----write a code which will perform the exists operations on the logout link
		//---if logout link present then step pass else step failed
		return "";
	}
	public static String CheckForErrorMessageOnTheLoginPage(String ExpectedErrorMessage)
	{
		
		//----write a code here which will first initialize the error Object and 
		//store it in objErrorMessage Object varaible declared above
		
		//----write a code here which will read the generated error message on the login page and store it in
		//---actualErrorMessage String varaible
		
		//-----write a code which will compare the ExpectedErrorMessage with the actualErrorMessage
		//--if both are matching then step pass else step failed
		return "";
	}

	
	public static void main(String[] args) throws IOException {
		//-----NOTE: This Login Activity is depended on LaunchApp so first we need to call the LaunhApp methods
		
		//------------------------------------------
		//----suppose user wants to perform login operations for valid username then
		String op_from_OpenBrowserMethod_for_ff32=LaunchApp.OpenBrowser("FF32");
		/*String op_from_enterurl_method=LaunchApp.EnterURL("http://server:1979/ejagruti");
		String op_from_WaitTillLoginPageFullyLoaded= LaunchApp.WaitTillLoginPageFullyLoaded(30);
		String op_from_maximize_method=LaunchApp.MaximizeLoginPage();
		String op_user=Login.EnterUserName("admin");
		String op_password=Login.EnterPassword("ejagruti");
		String op_buttonclick=Login.ClickOnLoginButton();
		String op_wait_pageload=Login.WaitTillHomePageFullyLoaded(30);
		String op_logoutlink_check=Login.CheckForLogoutLinkOnTheHomePage();
							//or
		//----------suppose user wants to perform the login operation using invalid username and password
		String op_from_OpenBrowserMethod_for_ff321=LaunchApp.OpenBrowser("FF32");
		String op_from_enterurl_method1=LaunchApp.EnterURL("http://server:1979/ejagruti");
		String op_from_WaitTillLoginPageFullyLoaded1= LaunchApp.WaitTillLoginPageFullyLoaded(30);
		String op_from_maximize_method1=LaunchApp.MaximizeLoginPage();
		String op_user1=Login.EnterUserName("aasdfasdfasdmin");
		String op_password1=Login.EnterPassword("ejasdfsadfagruti");
		String op_buttonclick1=Login.ClickOnLoginButton();
		String op_error_msg1=Login.CheckForErrorMessageOnTheLoginPage("Invalid username or valid password!!!");
						//or
		//----------suppose user wants to perform the login operation using blank username and password
		String op_from_OpenBrowserMethod_for_ff3211=LaunchApp.OpenBrowser("FF32");
		String op_from_enterurl_method11=LaunchApp.EnterURL("http://server:1979/ejagruti");
		String op_from_WaitTillLoginPageFullyLoaded11= LaunchApp.WaitTillLoginPageFullyLoaded(30);
		String op_from_maximize_method11=LaunchApp.MaximizeLoginPage();
		String op_buttonclick2=Login.ClickOnLoginButton();
		String op_error_msg2=Login.CheckForErrorMessageOnTheLoginPage("Invalid username or valid password!!!");*/

	}

}
