package ej.selenium.operations;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Operations {

	public static WebDriver driver=null;
	public static WebDriverWait wait=null;
	private int timeout=30;
	public Operations()
	{
		
	}
	public void LaunchApplication(String BrowserName,String URL,String WebDriverExePath)
	{
			if(BrowserName.equalsIgnoreCase("ff"))
			{
				driver=new FirefoxDriver();
			}
			if(BrowserName.equalsIgnoreCase("ch"))
			{
				System.setProperty("webdriver.chrome.driver",WebDriverExePath);
				driver=new ChromeDriver();
			}
			if(BrowserName.equalsIgnoreCase("ie"))
			{
				System.setProperty("webdriver.ie.driver",WebDriverExePath);
				driver=new InternetExplorerDriver();
			}
	    	wait=new WebDriverWait(driver,timeout);
			driver.get(URL);
			driver.manage().timeouts().pageLoadTimeout(timeout, TimeUnit.SECONDS);
			driver.manage().window().maximize();
	 }
	public WebElement IsObjectExists(String xPath)
	{
		WebElement obj=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xPath)));
		return obj;
	}
	public boolean IsObjectPresent(String xPath)
	{
		WebElement obj=IsObjectExists(xPath);
		 return obj.isDisplayed();
	}
	public String ObjectGetAttributeValue(String xPath,String AttributeName)
	{
		WebElement obj=IsObjectExists(xPath);
		return obj.getAttribute(AttributeName);
	}
	//###############Button######################
	public void ObjectClick(String xPath)
	{
			WebElement obj=IsObjectExists(xPath);
			obj.click();
	
	}
	//###############Button######################
	public void ObjectDoubleClick(String xPath)
	{
		WebElement obj=IsObjectExists(xPath);
		Actions act=new Actions(driver);
		act.doubleClick(obj).build().perform();
	}
	public void ObjectRightClick(String xPath)
	{
	
	}
	//###############TextBox######################
	public void TextBoxSetValue(String xPath,String Value) throws InterruptedException
	{
		WebElement obj=IsObjectExists(xPath);
		obj.clear();
		Thread.sleep(1000);
	
		obj.sendKeys(Value);
	}
	public void TextBoxAppendValue(String xPath,String Value)
	{
		WebElement obj=IsObjectExists(xPath);
		obj.sendKeys(Value);
	}
	
	//#################Table#####################
		public int TableGetRowCount(String xPath)
		{
			WebElement obj=IsObjectExists(xPath);
			return obj.findElements(By.tagName("tr")).size();
		}
		public int TableGetColumnCount(String xPath,int RowNumber)
		{
			WebElement obj=IsObjectExists(xPath);
			return obj.findElements(By.tagName("tr")).get(RowNumber).findElements(By.tagName("td")).size();
		}
		public String TableGetCellValue(String xPath,int RowNumber,int ColumnNumber)
		{
			WebElement obj=IsObjectExists(xPath);
			return obj.findElements(By.tagName("tr")).get(RowNumber).findElements(By.tagName("td")).get(ColumnNumber).getText();
		}
		//######################Frame#################
		public WebDriver FrameSwitchByIndex(int Index)
		{
			return   driver.switchTo().frame(Index);
		}
		public WebDriver FrameSwitchByXPath(String xPath)
		{
			 WebElement obj=  driver.findElement(By.xpath(xPath));
			 return  driver.switchTo().frame(obj);
		}
		public WebDriver FrameSwitchByName(String NameOfTheFrame)
		{
			  return  driver.switchTo().frame(NameOfTheFrame);
		}
		//######################Drop Down#################
		public void DropDownSelectByVisibleText(String xPath,String Value)
		{
			WebElement obj=IsObjectExists(xPath);
			Select sel=new Select(obj);
			sel.selectByVisibleText(Value);
		}
		public void DropDownSelectByIndex(String xPath,int Index)
		{
			WebElement obj=IsObjectExists(xPath);
			Select sel=new Select(obj);
			sel.selectByIndex(Index);
		}
		public void DropDownSelectByOptionValue(String xPath,String OptionValue)
		{
			WebElement obj=IsObjectExists(xPath);
			Select sel=new Select(obj);
			sel.selectByValue(OptionValue);
		}
		public String DropDownGetSelectedValue(String xPath)
		{
			WebElement obj=IsObjectExists(xPath);
			Select sel=new Select(obj);
			return sel.getFirstSelectedOption().getText();
		}
		public ArrayList<String> DropDownGetAllSelectedValue(String xPath)
		{
			WebElement obj=IsObjectExists(xPath);
			Select sel=new Select(obj);
			ArrayList<String> allSelectedValue=new ArrayList<String>();
			 for(WebElement ele: sel.getAllSelectedOptions())
			 {
				 allSelectedValue.add(ele.getText());
			 }
			 return allSelectedValue;
		}
	private void TestCase1() throws InterruptedException
	{
		Operations op=new Operations();
		op.LaunchApplication("ff", "http://localhost:90/finsys", "");
		op.TextBoxSetValue("//input[@placeholder='Username']", "dummyfm");
		op.TextBoxSetValue("//input[@placeholder='Username']", "dummyfm");
		op.TextBoxSetValue("//input[@placeholder='Password']", "passw0rd");
	 	op.ObjectClick("//span[.='Login']");
	 	String val=op.ObjectGetAttributeValue("//a[.='LOGOUT']", "innerText");
	 	if(val.equalsIgnoreCase("LOGOUT"))
	 	{
	 		
	 		 System.out.println("Test Case 1 is passed");
	 	}
	 	else
	 	{
	 		System.out.println("Test Case 2 is Failed");
	 	}
	}
	public static void main(String[] args) throws InterruptedException {
	
		Operations op=new Operations();
		op.TestCase1();
		System.out.println("in main");
			
	}

}
