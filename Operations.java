package operations;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
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
	private int counter=1;
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
		try
		{
		WebElement obj=IsObjectExists(xPath);
		String val= obj.getAttribute(AttributeName);
		String message="Step Number:"+(counter++)+"---Able to Get The Attribute Value:"+val+",For given Attribute Name:"+AttributeName;
		return val;
		}
		catch(Exception ex)
		{
			String message="Step Number:"+(counter++)+"---Failed to Get The Attribute Value,For given Attribute Name:"+AttributeName+"\n Exception Details:"+ex.getLocalizedMessage();
			throw new WebDriverException(message);
		}
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
		WebElement obj=IsObjectExists(xPath);
		Actions act=new Actions(driver);
		act.moveToElement(obj).build().perform();
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
		//*********check box methods**********************
		
		public void Check(String xPath)
		{
		WebElement obj=IsObjectExists(xPath);
		boolean selected_status=obj.isSelected();
		if(selected_status==false)
		obj.click();
		}
		
		public void UnCheck(String xPath)
		{
		WebElement obj=IsObjectExists(xPath);
		boolean selected_status=obj.isSelected();
		if(selected_status==true)
		obj.click();
		}
	private void TestCase1() throws InterruptedException
	{
		Operations op=new Operations();
		op.LaunchApplication("ff", "http://localhost:90/finsys", "");
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
	 		System.out.println("Test Case 1 is Failed");
	 	}
	}
	
	private void TestCase2() throws InterruptedException
	{
		Operations op=new Operations();
		op.LaunchApplication("ff", "http://localhost:90/finsys", "");
		op.TextBoxSetValue("//input[@placeholder='Username']", "dummyfm1");
		op.TextBoxSetValue("//input[@placeholder='Password']", "passw0rd1");
		op.ObjectClick("//span[.='Login']");
		String val=op.ObjectGetAttributeValue("//div[@id='error']", "innerText");
		if(val.equalsIgnoreCase("Please Enter Valid Username or Password!!!"))
	   
			System.out.println("Test case 2 is failed:Invalid credentials");
		else if(op.ObjectGetAttributeValue("//a[.='LOGOUT']", "innerText").equalsIgnoreCase("LOGOUT"))
		
	 	System.out.println("Test Case 2 is passed");
	  	
	}
	public static void main(String[] args) throws InterruptedException {
	
		Operations op=new Operations();
		//op.TestCase1();
		op.TestCase2();
		System.out.println("in main");
			
	}

}
