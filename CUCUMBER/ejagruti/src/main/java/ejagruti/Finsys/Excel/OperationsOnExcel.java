package ejagruti.Finsys.Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Hashtable;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class OperationsOnExcel
{
	public static int GetTotalRowCount(String filename, int sheetno) throws IOException 
	{
		FileInputStream file= new FileInputStream(new File(filename));
		XSSFWorkbook workbook= new XSSFWorkbook(file);
		XSSFSheet worksheet =workbook.getSheetAt(sheetno);
		int rowcount= worksheet.getLastRowNum();
		return rowcount+1;
	}
	
	public static int GetTotalRowCount(String filename, String sheetname) throws IOException
	{
		FileInputStream file= new FileInputStream(new File(filename));
		XSSFWorkbook workbook= new XSSFWorkbook(file);
		XSSFSheet worksheet =workbook.getSheet(sheetname);
		int rowcount= worksheet.getLastRowNum();
		return rowcount+1;
	}
	
	public static int GetTotalColumnCount(String filename, String sheetname, int rowno) throws IOException
	{
		FileInputStream file= new FileInputStream(new File(filename));
		XSSFWorkbook workbook= new XSSFWorkbook(file);
		XSSFSheet worksheet =workbook.getSheet(sheetname);
		int columncount= worksheet.getRow(rowno).getLastCellNum();
		return columncount;
	}
	
	public static int GetTotalColumnCount(String filename, int sheetno, int rowno) throws IOException
	{
		FileInputStream file= new FileInputStream(new File(filename));
		XSSFWorkbook workbook= new XSSFWorkbook(file);
		XSSFSheet worksheet =workbook.getSheetAt(sheetno);
		int columncount= worksheet.getRow(rowno).getLastCellNum();
		return columncount;
	}
	
	public static String GetCellData(String filename, int sheetno, int rowno, int colno) throws IOException
	{
		FileInputStream file= new FileInputStream(new File(filename));
		XSSFWorkbook workbook= new XSSFWorkbook(file);
		XSSFSheet worksheet =workbook.getSheetAt(sheetno);
		String cellstring= worksheet.getRow(rowno).getCell(colno).getStringCellValue();
		return cellstring;
	}
	
	public static String GetCellData(String filename, String sheetname, int rowno, int colno) throws IOException
	{
		FileInputStream file= new FileInputStream(new File(filename));
		XSSFWorkbook workbook= new XSSFWorkbook(file);
		XSSFSheet worksheet =workbook.getSheet(sheetname);
		String cellstring= worksheet.getRow(rowno).getCell(colno).toString();
		return cellstring;
	}

	public static void SetCellData(String filename, int sheetno,int rowno,int colno,String datastring) throws IOException
	{
		FileInputStream file= new FileInputStream(new File(filename));
		XSSFWorkbook workbook= new XSSFWorkbook(file);
		XSSFSheet worksheet =workbook.getSheetAt(sheetno);
		
		worksheet.getRow(rowno).getCell(colno).setCellValue(datastring);
		/*XSSFRow row= worksheet.createRow(rowno);
		XSSFCell cell = row.createCell(colno);
		cell.setCellValue(datastring);*/
		FileOutputStream fileout= new FileOutputStream(filename);
		workbook.write(fileout);	
	}
	
	public static void SetCellData(String filename, String sheetname,int rowno,int colno, String datastring) throws IOException
	{
		FileInputStream file= new FileInputStream(new File(filename));
		XSSFWorkbook workbook= new XSSFWorkbook(file);
		XSSFSheet worksheet =workbook.getSheet(sheetname);
		
		worksheet.getRow(rowno).getCell(colno).setCellValue(datastring);
		/*XSSFRow row= worksheet.createRow(rowno);
		XSSFCell cell = row.createCell(colno);
		cell.setCellValue(datastring);*/
		FileOutputStream fileout= new FileOutputStream(filename);
		workbook.write(fileout);
	}
	
	public static Hashtable<Integer, String[]> ReadAllExcelFile(String filename, int sheetno) throws IOException
	{
		Hashtable<Integer,String[]> readexcel=new Hashtable<Integer,String[]>();
		 
		FileInputStream file= new FileInputStream(new File(filename));
		XSSFWorkbook workbook= new XSSFWorkbook(file);
		XSSFSheet worksheet =workbook.getSheetAt(sheetno);
		int usedrows= worksheet.getLastRowNum();
		
		for(int i=0;i<=usedrows;i++)
			{
				int usedcolnum= worksheet.getRow(i).getLastCellNum();//getCell(colno).getStringCellValue();
				String[] rowarr=new String[usedcolnum];	
				for(int j=0;j<usedcolnum;j++)
					{
						XSSFCell cellstring1 =worksheet.getRow(i).getCell(j);
						if(cellstring1!=null)
						{
							String cellstring=cellstring1.toString();
							rowarr[j]=cellstring;
							//readexcel.put(j,cellstring);
						} 
						else
						{
							String cellstring="";
							rowarr[j]=cellstring;
						}
					}
					readexcel.put(i,rowarr);	
					//System.out.println(Arrays.toString(rowarr));		
					//System.out.println(readexcel);
					System.out.println(Arrays.toString(readexcel.get(i)));
			}	
		
		//	public Hashtable<Integer, String[]> Execute(Map<String, String> TestInput) throws InterruptedException 
			return readexcel;
	}
	
	public static Hashtable<Integer, String[]> ReadAllExcelFile(String filename, String sheetname) throws IOException
	{
		Hashtable<Integer,String[]> readexcel=new Hashtable<Integer,String[]>();
		 
		FileInputStream file= new FileInputStream(new File(filename));
		XSSFWorkbook workbook= new XSSFWorkbook(file);
		XSSFSheet worksheet =workbook.getSheet(sheetname);
		int usedrows= worksheet.getLastRowNum();
		
		for(int i=0;i<=usedrows;i++)
			{
				int usedcolnum= worksheet.getRow(i).getLastCellNum();//getCell(colno).getStringCellValue();
				String[] rowarr=new String[usedcolnum];	
				for(int j=0;j<usedcolnum;j++)
				{
					XSSFCell cellstring1 =worksheet.getRow(i).getCell(j);
					if(cellstring1!=null)
					{
						String cellstring=cellstring1.toString();
						rowarr[j]=cellstring;
						//readexcel.put(j,cellstring);
					} 
					else
					{
						String cellstring="";
						rowarr[j]=cellstring;
					}
				}
					readexcel.put(i,rowarr);	
					//System.out.println(Arrays.toString(rowarr));		
					//System.out.println(readexcel);
					System.out.println(Arrays.toString(readexcel.get(i)));
			}	
			
				return readexcel;
	}

	public static void main(String[] args) throws IOException 
	{
		System.out.println(" Program is Started.....");
		
		int rowcount= GetTotalRowCount("C:\\Users\\hp\\Desktop\\Suresh\\Excel Operations\\Excel_Operations.xlsx","Sheet1");
		System.out.println(" Total number of Rows = "+rowcount);
		
		int colcount= GetTotalColumnCount("C:\\Users\\hp\\Desktop\\Suresh\\Excel Operations\\Excel_Operations.xlsx",1,1);
		System.out.println(" Total number of Columns = "+colcount);
		
		String cellstring = GetCellData("C:\\Users\\hp\\Desktop\\Suresh\\Excel Operations\\Excel_Operations.xlsx","Sheet1",3,1);
		System.out.println(" Cell Data = "+cellstring);
		
		SetCellData("C:\\Users\\hp\\Desktop\\Suresh\\Excel Operations\\Excel_Operations.xlsx","Sheet1",1,1,"DevOps");
		
		SetCellData("C:\\Users\\hp\\Desktop\\Suresh\\Excel Operations\\Excel_Operations.xlsx",1,2,1,"Selenium");
		
		ReadAllExcelFile("C:\\Users\\hp\\Desktop\\Suresh\\Excel Operations\\Excel_Operations.xlsx","Sheet1");
		
		ReadAllExcelFile("C:\\Users\\hp\\Desktop\\Suresh\\Excel Operations\\Excel_Operations.xlsx",1);
		
		System.out.println(" Program is Finished.....");
	}

}
