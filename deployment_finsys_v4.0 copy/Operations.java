package ej.Selenium.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Operations {
	public static WebDriver driver=null;
	public static WebDriverWait wait=null;
	
	public static void LaunchApplication(String BrowserName,String URL)
	{
		
	}
	public static void ObjectClick(String xPath)
	{
		WebElement obj=WaitTillObjectExists(xPath,30);
		obj.click();
	}
	
	public static WebElement WaitTillObjectExists(String xPath,int timeinseconds)
	{
		wait=new WebDriverWait(driver, timeinseconds);
		WebElement obj=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xPath)));
		return obj;
	}
	public static void main(String Args[])
	{
		
	
	}

}
