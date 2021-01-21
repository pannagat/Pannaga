package exceltest;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelPractice {
	
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	static String projectpath;
	
	public ExcelPractice(String excelpath,String sheetname)
	{
		try
		{
		projectpath=System.getProperty("user.dir");
		
		workbook=new XSSFWorkbook(projectpath+"\\Excel\\AssignData.xlsx");
		sheet=workbook.getSheet("Sheet1");	
	}
		catch(Exception e)
		{
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		
		
		getrowcount();
		getcolcount();
		getrowcalldatanum(1,0);
		getrowcalldatastring(0,0);
		
	}
	
	
	public static int getrowcount()
	{
		
		int rowcount=0;
		try
		{
			

		
		rowcount=sheet.getPhysicalNumberOfRows();
		//System.out.println("Number of rows are " + rowcount);
		
		}
		catch(Exception e)
		{
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return rowcount;
	} 
		public static int getcolcount()
		{
			int colcount=0;
			try
			{
	 
		colcount=sheet.getRow(0).getPhysicalNumberOfCells();
		//System.out.println("Number of columns are " + colcount);	
			
			
			
			
		}
	
			catch(Exception e)
			{
				System.out.println(e.getCause());
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
			return colcount;
		}


public static void getrowcalldatanum(int rownum,int colnum)
{
	try
	{

double celldatanum=sheet.getRow(rownum).getCell(colnum).getNumericCellValue();
//System.out.println(celldatanum);	
	
	
	
	
}

	catch(Exception e)
	{
		System.out.println(e.getCause());
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
}

public static String getrowcalldatastring(int rownum,int colnum)
{
	
	String celldatastring=null;
	try
	{

celldatastring=sheet.getRow(rownum).getCell(colnum).getStringCellValue();
//System.out.println(celldatastring);	
	
	
	
	
}

	catch(Exception e)
	{
		System.out.println(e.getCause());
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
	return celldatastring;
}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	


