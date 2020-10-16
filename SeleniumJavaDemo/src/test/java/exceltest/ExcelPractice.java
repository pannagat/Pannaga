package exceltest;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelPractice {
	
	static String Projectpath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	
		

	public ExcelPractice(String excelpath, String sheetname) 
	{
		try
		{
		Projectpath=System.getProperty("user.dir");
		 workbook=new XSSFWorkbook(Projectpath+"\\Excel\\AssignData.xlsx");
		 sheet=workbook.getSheet("Sheet1");
}
		catch(Exception e)
		{
		e.printStackTrace();
		System.out.println(e.getMessage());
		System.out.println(e.getCause());
		}
}
	

	public static void main(String[] args) {
		getrowcount();
		getcolcount();
		getcelldatanum(1,0);
		getcelldatastring(1,1);
	}
	
	
	public static int getrowcount()
	{
		int rowcount=0;
		try
		{
		
	rowcount=sheet.getPhysicalNumberOfRows();
		System.out.println("Number of rows are  :" +rowcount);
		}
		catch(Exception e)
		{
		e.printStackTrace();
		System.out.println(e.getMessage());
		System.out.println(e.getCause());
		}
		return rowcount;
	}
		
		public static int getcolcount()
		{
			int colcount=0;
			try
			{
		
		colcount=sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("Number of columns are  :" +colcount);
			}
			catch(Exception e)
			{
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			}
			return colcount;
		}
			
			public static void getcelldatanum(int rownum,int colnum)
			{
				try
				{
			
				double celldatanum=sheet.getRow(rownum).getCell(colnum).getNumericCellValue();
				System.out.println("Number of columns are  :" +celldatanum);
				}
				catch(Exception e)
				{
				e.printStackTrace();
				System.out.println(e.getMessage());
				System.out.println(e.getCause());
				}
			}

				public static String getcelldatastring(int rownum,int colnum)
				{
					String celldatastring=null;
					try
					{
			     celldatastring=sheet.getRow(rownum).getCell(colnum).getStringCellValue();
					System.out.println("Number of columns are  :" +celldatastring);
					}
					catch(Exception e)
					{
					e.printStackTrace();
					System.out.println(e.getMessage());
					System.out.println(e.getCause());
					}
					return celldatastring;
			
		
		
		
	}
}
	
	
	


