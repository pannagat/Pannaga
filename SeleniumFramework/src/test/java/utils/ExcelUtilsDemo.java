package utils;

public class ExcelUtilsDemo {

	public static void main(String[] args) {
		String path=System.getProperty("user.dir");
		ExcelUtils excel=new ExcelUtils(path+"/Excel/AssignData.xlsx", "Sheet1");
		excel.getcellData(1,1);
		

	}

}
