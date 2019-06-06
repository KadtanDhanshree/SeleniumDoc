package ej.mm.modules;

import org.openqa.selenium.WebElement;

public class AccordionPane {

	WebElement objAccordionPane=null;
	public static String ExpandAccordionPaneIfCollapsed(String AccordionPaneName)
	{
		//----First identify the object for the given AccordionPane and initialize declared object haivng name
		//----objAccordionPane
		
		//-----now write a code to check whether the given Accordion Pane Name is expanded or collapsed
		
		//-----write down a code to click on the above initialized object if it is collapsed
		//----if it is expanded then leave it as is
		return "";
	}
	public static String CollapseAccordionPaneIfExpanded(String AccordionPaneName)
	{
		//----First identify the object for the given AccordionPane and initialize declared object haivng name
		//----objAccordionPane
		
		//-----now write a code to check whether the given Accordion Pane Name is expanded or collapsed
		
		//-----write down a code to click on the above initialized object if it is expanded
		//----if it is collapsed then leave it as is
		return "";
	}
	public static void main(String[] args) {
		//----suppose stock accordion pane is already expanded and now if user wants to select WishList Accordion Pane then user will
		//----call above method given below
		String v1=AccordionPane.CollapseAccordionPaneIfExpanded("Stock");
		String v2=AccordionPane.ExpandAccordionPaneIfCollapsed("WishList");
		//----suppose wishlist accordion pane is already expanded and now if user wants to select stock Accordion Pane then user will
		//----call above method given below
		String v11=AccordionPane.CollapseAccordionPaneIfExpanded("WishList");
		String v22=AccordionPane.ExpandAccordionPaneIfCollapsed("Stock");
		

	}

}
