package utils;

public class ExcelUtilsDemo {
	
	
	public static void main(String[] args) {
		String projectpath=System.getProperty("user.dir");
		ExcelUtils excel=new ExcelUtils(projectpath+"/Excel/AssignData.xlsx", "Sheet1");
		excel.getrowcount();
		excel.getcolcount();
		excel.getceldata(0, 0);
		excel.getceldatanumber(1, 1);
		
		
		
	}

}
