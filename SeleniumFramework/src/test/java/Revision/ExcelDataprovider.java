package Revision;

public class ExcelDataprovider {
	
	
	public static void main(String[] args) {
		String excelpath="C:\\Users\\user1\\git\\Pannaga\\SeleniumFramework\\Excel\\AssignData.xlsx";
		celldata(excelpath, "Sheet1");
		
		
	}
	
	public static void celldata(String excelpath,String sheetname)
	{
		
		ExcelPractice excel=new ExcelPractice(excelpath,sheetname);
		int rowcount=excel.getrowcount();
		int colcount=excel.getcolcount();
		
		for(int i=0;i<rowcount;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				String celldatastring=excel.getcelldatastring(i, j);
				System.out.print(celldatastring  + "|");
			}
			System.out.println( );
		}
		
		
		
		
	}
	
	

}
