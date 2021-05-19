package Revision;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelPractice {
	static String projectpath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	
	
	
	public  ExcelPractice(String excelpath,String sheetname) 
	
	
	{
		try
		{
		
		projectpath=System.getProperty("user.dir");
		 workbook=new XSSFWorkbook(projectpath+"\\Excel\\AssignData.xlsx");
		sheet=workbook.getSheet("Sheet1");
	}
	
		catch(Exception e)
		{
			e.printStackTrace();
			e.getMessage();
			e.getCause();
		}
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		getrowcount();
		getcolcount();
		getcelldatastring(0,0);
		getcelldatanum(1,0);
	}
	
	public static int getrowcount()
	{
		int rowcount=0;
		try
		{
		 
	rowcount=sheet.getPhysicalNumberOfRows();
		//System.out.println("Number of rows" + rowcount);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			e.getMessage();
			e.getCause();
		}
		return rowcount;
		
		
		
	}
	
	public static int getcolcount()
	{
		int colcount=0;
		try
		{
	
		 
	colcount=sheet.getRow(0).getPhysicalNumberOfCells();
		//System.out.println("Number of columns" + colcount);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			e.getMessage();
			e.getCause();
		}
		return colcount;
	}
	
		
		public static String getcelldatastring(int rownum,int colnum)
		{
			String celldatastring=null;
			try
			{
		
			
			celldatastring=sheet.getRow(rownum).getCell(colnum).getStringCellValue();
			//.out.println(celldatastring);
			}
			catch(Exception e)
			{
				e.printStackTrace();
				e.getMessage();
				e.getCause();
			}
			return celldatastring;
		}
		
			public static void getcelldatanum(int rownum,int colnum)
			{
				
				try
				{
			
				
			double celldatanum=sheet.getRow(rownum).getCell(colnum).getNumericCellValue();
				//System.out.println(celldatanum);
				}
				catch(Exception e)
				{
					e.printStackTrace();
					e.getMessage();
					e.getCause();
				}
		
		

}
}
