package utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HundredUser {

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
	}

