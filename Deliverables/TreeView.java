package ej.mm.modules;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

public class TreeView {

	WebElement objTreeNode=null;
	WebElement objCompanyName=null;
	List<WebElement> objChildItems=null;
	ArrayList<String> allCompanies=null;
	public static String ExpandTreeNodeIfCollapsed(String NodeName)
	{
		//----First identify the object for the given TreeNode and initialize declared object haivng name
				//----objTreeNode
				
				//-----now write a code to check whether the given Tree Node is expanded or collapsed
				
				//-----write down a code to click on the above initialized object if it is collapsed
				//----if it is expanded then leave it as is
		return "";
	}
	public static String ClickOnTreeNode(String CompanyName)
	{
		//----First identify the object for the given Tree Node and initialize declared object haivng name
		//----objCompanyName
				
								
		//-----write down a code to click on the above initialized object
		return "";
	}
	public static ArrayList<String> GetAllChildItemsForTheGivenTreeNode(String TreeNodeName)
	{
		//----First identify the object for the given TreeNode and initialize declared object haivng name
				//----objTreeNode
		
		//----identify all the child objects present for given selected treenode and store them in objChildItems
		
		//---write a code here which will initialize the allCompanies variable by reading the all company names and store it in  
		//--- ArrayList
		
		return null;
	}
	
	public static void main(String[] args) {
		//-----suppose user wants to Select COMPANY>>SECTOR Tree Node from the tree view then
		String val=TreeView.ExpandTreeNodeIfCollapsed("COMPANY");
		String val1=TreeView.ExpandTreeNodeIfCollapsed("SECTOR");
		
		//-----Suppose user wants all the Child Items present under COMPANY>EXCHANGE>NSE Tree Node then
		String val3=TreeView.ExpandTreeNodeIfCollapsed("COMPANY");
		String val4=TreeView.ExpandTreeNodeIfCollapsed("EXCHANGE");
		String val5=TreeView.ExpandTreeNodeIfCollapsed("NSE");
		ArrayList<String> val6=TreeView.GetAllChildItemsForTheGivenTreeNode("NSE");

	}

}
