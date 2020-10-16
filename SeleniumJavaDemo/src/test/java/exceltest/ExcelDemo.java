package exceltest;

public class ExcelDemo {
	public static void main(String[] args) {
		
	
	
	String Projectpath=System.getProperty("user.dir");
	ExcelPractice excel=new ExcelPractice(Projectpath+"\\Excel\\AssignData.xlsx","Sheet1");
	excel.getrowcount();
	excel.getcolcount();
	excel.getcelldatanum(1, 0);
	excel.getcelldatastring(1, 1);

}
}
