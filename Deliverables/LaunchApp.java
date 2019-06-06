package ej.mm.modules;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import ej.mm.config.Config;

public class LaunchApp {

	public static String OpenBrowser(String browserName) throws IOException
	{
		String output_message=null;
		if(browserName.equalsIgnoreCase("ff32"))
		{
			System.setProperty("webdriver.gecko.driver",Config.getParameterValue("firefox_driver_exe_path_32bit"));
			Config.driver=new FirefoxDriver();
			output_message="Browser Successfully Open.BrowserName:"+browserName+",WebDriver Exe Path:"+Config.getParameterValue("firefox_driver_exe_path_32bit");

		}
		if(browserName.equalsIgnoreCase("ch32"))
		{
			System.setProperty("webdriver.chrome.driver",Config.getParameterValue("chrome_driver_exe_path_32bit"));
			Config.driver=new ChromeDriver();
			output_message="Browser Successfully Open.BrowserName:"+browserName+",WebDriver Exe Path:"+Config.getParameterValue("chrome_driver_exe_path_32bit");

		}
		if(browserName.equalsIgnoreCase("ie32"))
		{
			System.setProperty("webdriver.ie.driver",Config.getParameterValue("ie_driver_exe_path_32bit"));
			Config.driver=new InternetExplorerDriver();
			output_message="Browser Successfully Open.BrowserName:"+browserName+",WebDriver Exe Path:"+Config.getParameterValue("ie_driver_exe_path_32bit");

		}
		if(browserName.equalsIgnoreCase("ff64"))
		{
			System.setProperty("webdriver.gecko.driver",Config.getParameterValue("firefox_driver_exe_path_64bit"));
			Config.driver=new FirefoxDriver();
			output_message="Browser Successfully Open.BrowserName:"+browserName+",WebDriver Exe Path:"+Config.getParameterValue("firefox_driver_exe_path_64bit");

		}
		if(browserName.equalsIgnoreCase("ch64"))
		{
			System.setProperty("webdriver.chrome.driver",Config.getParameterValue("chrome_driver_exe_path_64bit"));
			Config.driver=new ChromeDriver();
			output_message="Browser Successfully Open.BrowserName:"+browserName+",WebDriver Exe Path:"+Config.getParameterValue("chrome_driver_exe_path_64bit");

		}
		if(browserName.equalsIgnoreCase("ie64"))
		{
			System.setProperty("webdriver.ie.driver",Config.getParameterValue("ie_driver_exe_path_64bit"));
			Config.driver=new InternetExplorerDriver();
			output_message="Browser Successfully Open.BrowserName:"+browserName+",WebDriver Exe Path:"+Config.getParameterValue("ie_driver_exe_path_64bit");

		}
		return output_message;
	}
	public static String EnterURL(String ApplicationURL)
	{
		//-----write a code here which will launch the application url on the opened browser
		return "";
	}
	public static String WaitTillLoginPageFullyLoaded(int TimeOutSeconds)
	{
		//----Write a code here which will wait till login page appears
		return "";
	}
	public static String MaximizeLoginPage()
	{
		//----Write a code here which will maximize the login page
		return "";
	}

	public static void main(String[] args) throws IOException {
		//---------------------------suppose user wants to open the browser in Firefox on 32 bit OS
		String op_from_OpenBrowserMethod_for_ff32=LaunchApp.OpenBrowser("FF32");
		String op_from_enterurl_method=LaunchApp.EnterURL("http://server:1979/ejagruti");
		String op_from_WaitTillLoginPageFullyLoaded= LaunchApp.WaitTillLoginPageFullyLoaded(30);
		String op_from_maximize_method=LaunchApp.MaximizeLoginPage();
										//or
		//---------------------------suppose user wants to open the browser in Internet Explorer on 32 bit OS
		String op_from_OpenBrowserMethod_for_ie32=LaunchApp.OpenBrowser("IE32");
		String op_from_enterurl_method_ie=LaunchApp.EnterURL("http://server:1979/ejagruti");
		String op_from_WaitTillLoginPageFullyLoaded_ie= LaunchApp.WaitTillLoginPageFullyLoaded(10);
		String op_from_maximize_method_ie=LaunchApp.MaximizeLoginPage();
									  //or
		//---------------------------suppose user wants to open the browser in chrome on 64 bit OS
		String op_from_OpenBrowserMethod_for_ch64=LaunchApp.OpenBrowser("CH64");
		String op_from_enterurl_method_ch=LaunchApp.EnterURL("http://server:1979/ejagruti");
		String op_from_WaitTillLoginPageFullyLoaded_ch= LaunchApp.WaitTillLoginPageFullyLoaded(50);
		String op_from_maximize_method_ch=LaunchApp.MaximizeLoginPage();
		//-----llike wise you can do it for CH32,FF64,IE64
	}

}
