package ej.mm.modules;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

public class Search {

	WebElement objSearchCompanyTextBox=null;
	List<WebElement> objSearchComapnies=null;
	WebElement objSingleCompany=null;
	public static String SetValueToSearchCompany(String SearchCharacters)
	{
		//----First identify the object for the given Search TextBox and initialize declared object haivng name
		//----objSearchCompanyTextBox
		
		//----now write a logic which will first clear the value from the search text box
		
		//----Now write a logic which will enter SearchCharacters in the text box
		
		return "";
						
	}
	public static ArrayList<String> GetListOfSearchCompanies()
	{
		//----First identify all the search object for the given Search TextBox and initialize declared object having name
		//----objSearchComapnies
		
		//-----now one by one get all the name of the companies return by the search result and store them in above declared objSearchComapnies
		return null;
	}
	public static String ClickOnSpecificCompanyFromTheSearchResult(String ISIN)
	{
		//----First identify all the search object for the given Search TextBox and initialize declared object having name
		//----objSearchComapnies
		
		//-=---now search the object from the list objSearchComapnies and store it in objSingleCompany
		
		//----now perform the action of click on the objSingleCompany object
		
		return "";
	}
	public static void main(String[] args) {
		//-----suppose user wants to search the companies starts with d and click on the company having name Dewan Housing Finance imited
		String val=Search.SetValueToSearchCompany("d");
		Search.ClickOnSpecificCompanyFromTheSearchResult("INE202B01012"); //---this is the isin value for dewan housing finance
		//----------suppose now user wants to store all the companies present under BSE then
		String val1=Search.SetValueToSearchCompany("d");
		ArrayList<String> val12=Search.GetListOfSearchCompanies();
	}

}
