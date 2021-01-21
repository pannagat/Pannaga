package exceltest;

public class ExcelDemo {
	
	public static void main(String[] args) {
		
	
	String projectpath=System.getProperty("user.dir");
	ExcelPractice excel=new ExcelPractice(projectpath+"\\Excel\\AssignData.xlsx", "Sheet1");
	excel.getrowcount();
	excel.getcolcount();
	excel.getrowcalldatanum(1, 0);
	excel.getrowcalldatastring(0, 0);
	

}
}
