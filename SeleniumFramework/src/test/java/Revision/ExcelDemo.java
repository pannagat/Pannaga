package Revision;

public class ExcelDemo {
	
	
	
	public static void main(String[] args) {
		
		String projectpath=System.getProperty("user.dir");
		ExcelPractice excel=new ExcelPractice(projectpath+"\\Excel\\AssignData.xlsx", "Sheet1");
		
		excel.getrowcount();
		excel.getcolcount();
		excel.getcelldatastring(1,1);
		excel.getcelldatanum(0,1);
		
		
	}

}
