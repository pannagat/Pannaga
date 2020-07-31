package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	static String path;
	static XSSFWorkbook workbook;
	static XSSFSheet Sheet;

	
	
		

	public ExcelUtils(String excelpath, String sheetname) {
		try
		{
		
		workbook=new XSSFWorkbook(excelpath);
		Sheet=workbook.getSheet("Sheet1");	

	}
	catch(Exception e)
		{
		e.printStackTrace();
		}
	}
		
	

	public static void main(String[] args) {
		//getrowCount();
		//getcellData(1,1);
		getcolCount();
		
	}
	
	
	public static void getcolCount()
	{
		try
		{
			path=System.getProperty("user.dir");
			
			int colcount=Sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("Number of rows is" +colcount);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();

		}
	}
		
		
		public static void getcellData(int rowNum,int colnum)
		{
			try
			{
				

				String celldata=Sheet.getRow(rowNum).getCell(rowNum).getStringCellValue();
				System.out.println(celldata);
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
				System.out.println(e.getCause());
				e.printStackTrace();

			}
		}
}

	
		//getcellDataNumber();
	

	/*public static void getrowCount()
	{
		try
		{
			path=System.getProperty("user.dir");
			workbook=new XSSFWorkbook(path+"\\Excel\\AssignData.xlsx");
			Sheet=workbook.getSheet("Sheet1");
			int example=Sheet.getPhysicalNumberOfRows();
			System.out.println("Number of rows is" + example);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();

		}
	}

	public static void getcellData()
	{
		try
		{
			path=System.getProperty("user.dir");
			workbook=new XSSFWorkbook(path+"\\Excel\\AssignData.xlsx");
			Sheet=workbook.getSheet("Sheet1");	


			String celldata=Sheet.getRow(0).getCell(0).getStringCellValue();
			System.out.println(celldata);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();

		}
	}
		
		public static void getcellDataNumber()
		{
			try
			{
				path=System.getProperty("user.dir");
				workbook=new XSSFWorkbook(path+"\\Excel\\AssignData.xlsx");
				Sheet=workbook.getSheet("Sheet1");	


			double celldata=Sheet.getRow(0).getCell(1).getNumericCellValue();
				System.out.println(celldata);
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
				System.out.println(e.getCause());
				e.printStackTrace();
	}





		}
}*/
