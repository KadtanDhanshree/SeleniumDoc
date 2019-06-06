package ejagruti.Finsys.operations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class ApplicationLaunch 
{
	public static WebDriver driver=null;
	
	@When ("^User opens the Chrome browser$")
	public void OpenBrowser() throws InterruptedException
	{
		System.out.println(System.getProperty("user.dir"));
		System.setProperty("webdriver.chrome.driver", "C:\\WS_Project1_Java\\ejagruti\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize() ;
		Thread.sleep(1000);
		//System.setProperty("webdriver.gecko.driver", "C:\\WS_Project1_Java\\ejagruti\\Driver\\geckodriver_64bit_0.19.1.exe");
		//driver=new FirefoxDriver();
		
	}
	
	@And ("^User enters the URL \"(.*)\"$")
	public void EnterURL(String url) throws InterruptedException
	{
		driver.get(url);
		Thread.sleep(1000);
	}
	
}
