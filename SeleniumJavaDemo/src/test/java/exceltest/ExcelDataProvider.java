package exceltest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvider {
	
	
	@Test(dataProvider="testname1")
	
	public void testcase(String username,String password)
	{
		
		System.out.println(username + "|" + password);
	}
	
	
	
	
	
	

	
	@DataProvider(name="testname1")
	public Object[][] data()
	{
		

		String excelpath="C:\\Users\\user1\\git\\Pannaga\\SeleniumJavaDemo\\Excel\\AssignData.xlsx";
		
		Object[][] testdata=getdata(excelpath,"Sheet1");
		return testdata;
		
		
		
	}
	
	public  Object[][] getdata(String excelpath, String sheetname)
	{
		
		ExcelPractice excel=new ExcelPractice(excelpath, sheetname);
		int rowcount=excel.getrowcount();
		int colcount=excel.getcolcount();
		
		
		Object data[][]=new Object[rowcount-1][colcount];
		
		for(int i=1;i<rowcount;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				
				String celldata=excel.getrowcalldatastring(i, j);
				
				System.out.print(celldata+'|');
				data[i-1][j]=celldata;
				
				
			}
			System.out.println();
			
		}
		return data;
		
		
		
		
		
		
	}
}
	
	
	
	
