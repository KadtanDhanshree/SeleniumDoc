package ejagruti.Finsys.Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Temp 
{
	
	public static void main(String[] args) throws IOException
	{
		System.out.println("Program is Started...");
		FileInputStream file=new FileInputStream(new File("C:\\Users\\hp\\Desktop\\Suresh\\Excel Operations\\Excel_Operations.xlsx"));
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		//Get the first sheet from workbook & Sheet starts/counts from Zero(0)
		XSSFSheet sheet=workbook.getSheetAt(0);
		//Get the total number of rows from selected sheet of workbook & row starts/counts from Zero(0)
		int val1=sheet.getLastRowNum();
		//System.out.println(" Row ="+val1);
		//Get the total number of columns from first row & column starts/counts from One(1) but when we update it starts/counts from Zero
		int val2=sheet.getRow(1).getLastCellNum();
		// Get data from specific cell or location (Second row & Second column)
		String str=sheet.getRow(1).getCell(0).toString();
		System.out.println("Total Rows = "+(val1+1)+" Total Columns = "+val2+" Data from specific cell = "+str);
		// Set the data
		sheet.getRow(1).getCell(1).setCellValue("Selenium");
		
		FileOutputStream outstream=new FileOutputStream("C:\\Users\\hp\\Desktop\\Suresh\\Excel Operations\\Excel_Operations.xlsx");
		
			workbook.write(outstream);
			
			System.out.println("Program is Finished...");
	}

}
