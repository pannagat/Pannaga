package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvider {
	WebDriver driver=null;
	@BeforeTest
	
	public void setuptest()
	{
		ChromeOptions coptions = new ChromeOptions();
		coptions.addArguments("--disable-notifications");
	
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver4\\chromedriver.exe"); 
		driver=new ChromeDriver(coptions);
	}
	@Test(dataProvider="test 1")
	public void test1(String Username,String Password) throws InterruptedException
	{
		System.out.println(Username+ "|" +Password);
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys(Username);
		driver.findElement(By.name("pass")).sendKeys(Password);
		Thread.sleep(4500);
		driver.findElement(By.id("u_0_b")).click();
		
		
		driver.findElement(By.id("userNavigationLabel")).click();
		Thread.sleep(3000);

		driver.findElement(By.linkText("Log Out")).click();
	}
	
	
	
	
	
	
	@DataProvider(name="test 1")
	public  Object[][] getData()
	{
		String excelpath="C:\\Users\\user1\\git\\Pannaga\\SeleniumFramework\\Excel\\AssignData.xlsx";
		Object data[][]=testData(excelpath, "Sheet1");
		return data;
	}
	
	
	
	
	
	
	
	public  Object[][] testData(String excelpath, String sheetname)
	{
		ExcelUtils excel=new ExcelUtils(excelpath, sheetname);
		int rowcount=excel.getrowcount();
		int colcount=excel.getcolcount();
		
		
		Object data[][]=new Object[rowcount-1][colcount];
		
		
		
		
		
		
		
		
		
		for(int i=1;i<rowcount;i++)
		{
			for(int j=0;j<colcount;j++)	
			{
				String celldata=excel.getceldata(i, j);
				//System.out.print(celldata + "| ");
				data[i-1][j]=celldata;
				
				
				
				
				
			}
			//System.out.println();
		}
		
		
		return data;
		
	}

}
