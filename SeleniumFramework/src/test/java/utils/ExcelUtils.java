package utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	static String projectpath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	
	public ExcelUtils(String excelpath,String sheetname)
	{
		try
		{
			
			workbook=new XSSFWorkbook(excelpath);
			sheet=workbook.getSheet(sheetname);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	
	public static void main(String[] args) {
		getrowcount();
		getcolcount();
		getceldata(0,0);
		getceldatanumber(1,1);
	}
	
	
	public static int getrowcount()
	{
		int rowcount=0;
		try
		{
		
	rowcount=sheet.getPhysicalNumberOfRows();
		//System.out.println("Number of rows : " +  rowcount);
		
	}
		catch(Exception e)
		{
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}
		return rowcount;
	}
	
	
	public static int  getcolcount()
	{
		int colcount=0;
		try
		{
		
		colcount=sheet.getRow(0).getPhysicalNumberOfCells();
		//System.out.println("Number of columns : " +  colcount);
		
	}
		catch(Exception e)
		{
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}
		return colcount;
	}
	
	
	public static String getceldata(int rownum,int colnum)
	{
		String celldata=null;
		try
		{
		
		celldata=sheet.getRow(rownum).getCell(colnum).getStringCellValue();
		//System.out.println("value is  : " +  celldata);
		
	}
		catch(Exception e)
		{
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}
		return celldata;
	}
	
	public static void getceldatanumber(int rownum,int colnum)
	{
		try
		{
				double celldatanum=sheet.getRow(rownum).getCell(colnum).getNumericCellValue();
		//System.out.println("Number of columns : " +  celldatanum);
		
	}
		catch(Exception e)
		{
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}
	}
}



