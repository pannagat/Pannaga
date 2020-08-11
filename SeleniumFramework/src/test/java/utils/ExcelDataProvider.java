package utils;

import org.testng.annotations.DataProvider;

public class ExcelDataProvider {
	
		
	
	@DataProvider(name="test1")
	public Object[][] getData()
	{
		String excelpath="C:\\Users\\user1\\git\\Pannaga\\SeleniumFramework\\Excel\\AssignData.xlsx";
		Object data[][]=testData(excelpath, "Sheet1");
		return data;
	}
	public Object[][] testData(String excelpath,String sheetname)
	{
		ExcelUtils  excel=new ExcelUtils(excelpath, sheetname); 
		int rowcount=excel.getcolCount();
		int colcount=excel.getrowCount();
		
		Object data[][]=new Object[rowcount][colcount];
		
		
		for(int i=0;i<rowcount;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				String celldata=excel.getcellData(i, j);
				System.out.print(celldata + " | ");
				data[i][j]=celldata;
				
			}
			System.out.println();
			
		}
		return data;
	}

}
