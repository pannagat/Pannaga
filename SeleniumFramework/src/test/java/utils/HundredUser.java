package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class HundredUser {
	static XSSFWorkbook workbook;
	static XSSFSheet Sheet;
	
	
	public static void main(String[] args) {
		getrowcount();
		getcolcount();
		getcelldata(0,0);
		getcelldatanumber(1,1);
	}

public static void getrowcount()
{
	try
	{
workbook=new XSSFWorkbook ("C:\\Users\\user1\\git\\Pannaga\\SeleniumFramework\\Excel\\Assigndata.xlsx");
Sheet=workbook.getSheet("Sheet1");

int cellnumber=Sheet.getPhysicalNumberOfRows();
System.out.println(cellnumber);

}
catch(Exception e)
	{
	System.out.println(e.getCause());
	System.out.println(e.getMessage());
	e.getStackTrace();
	}
}
public static void getcolcount()
{
	try
	{
		workbook=new XSSFWorkbook ("C:\\Users\\user1\\git\\Pannaga\\SeleniumFramework\\Excel\\Assigndata.xlsx");
		Sheet=workbook.getSheet("Sheet1");

int colnumber=Sheet.getRow(0).getPhysicalNumberOfCells();
System.out.println(colnumber);

}
catch(Exception e)
	{
	System.out.println(e.getCause());
	System.out.println(e.getMessage());
	e.getStackTrace();
	}
}
public static void getcelldata(int rownum,int colnum)
{
	try
	{
		workbook=new XSSFWorkbook ("C:\\Users\\user1\\git\\Pannaga\\SeleniumFramework\\Excel\\Assigndata.xlsx");
		Sheet=workbook.getSheet("Sheet1");
String celldata=Sheet.getRow(rownum).getCell(colnum).getStringCellValue();
System.out.println(celldata);

}
catch(Exception e)
	{
	System.out.println(e.getCause());
	System.out.println(e.getMessage());
	e.getStackTrace();
	}
}
public static void getcelldatanumber(int rownum,int colnum)
{
	try
	{
		workbook=new XSSFWorkbook ("C:\\Users\\user1\\git\\Pannaga\\SeleniumFramework\\Excel\\Assigndata.xlsx");
		Sheet=workbook.getSheet("Sheet1");
double celldatanumber=Sheet.getRow(rownum).getCell(rownum).getNumericCellValue();
System.out.println(celldatanumber);

}
catch(Exception e)
	{
	System.out.println(e.getCause());
	System.out.println(e.getMessage());
	e.getStackTrace();
	}
}
}














































/*public class HundredUser {

	static XSSFWorkbook work;
	static XSSFSheet sheet;
	static XSSFSheet excelSheet;

	public static void main(String args[]) throws InterruptedException {



ChromeOptions coptions = new ChromeOptions();
coptions.addArguments("--disable-notifications");

System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver4\\chromedriver.exe"); 
WebDriver driver=new ChromeDriver(coptions);
excelSheet = HundredUser.Assignment("C:\\Users\\user1\\git\\Pannaga\\SeleniumFramework\\Excel\\AssignData.xlsx", "Sheet1");


	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	for(int i=0;i<=3;i++)
	{
	driver.findElement(By.id("email")).sendKeys(excelSheet.getRow(i).getCell(0).getStringCellValue());
	driver.findElement(By.name("pass")).sendKeys(excelSheet.getRow(i).getCell(1).getStringCellValue());
	driver.findElement(By.id("u_0_b")).click();

	Thread.sleep(2500);
	driver.findElement(By.id("userNavigationLabel")).click();
	Thread.sleep(3000);

	driver.findElement(By.linkText("Log Out")).click();

	}


	}

public static XSSFSheet Assignment(String Path, String SheetName)
{
	try
	{
	work=new XSSFWorkbook("C:\\Users\\user1\\git\\Pannaga\\SeleniumFramework\\Excel\\AssignData.xlsx");

	sheet=work.getSheet("Sheet1");
}
	catch (Exception e) {
		   System.out.println(e);

}
	return sheet;
}
	}*/

