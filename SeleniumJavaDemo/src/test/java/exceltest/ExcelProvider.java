package exceltest;

public class ExcelProvider {
	
	String excelpath="C:\\Users\\user1\\eclipse-workspace\\SeleniumJavaDemo\\Excel\\AssignData.xlsx";
	
	public static void getdata(String excelpath, String sheetname)
	{
		
		ExcelPractice excel=new ExcelPractice(excelpath, sheetname);
		int rowcount=excel.getrowcount();
		int colcount=excel.getcolcount();
		
		
		
		
		for(int i=0;i<rowcount;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				String celldatastring=excel.getcelldatastring(i, j);
				System.out.println(celldatastring);
				
			}
		}
		
	}

}
