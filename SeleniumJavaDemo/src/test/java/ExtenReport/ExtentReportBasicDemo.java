package ExtenReport;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;


public class ExtentReportBasicDemo {
	static WebDriver driver=null;
public static void main(String[] args) throws InterruptedException {
	
	ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReports.html");
	
	 ExtentReports extent= new ExtentReports();
     extent.attachReporter(htmlReporter);

     
     ExtentTest test = extent.createTest("Upload a resume on Monster");
     
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			
			test.log(Status.INFO,"Starting test case");
			driver.get("https://www.monsterindia.com/");
			driver.manage().window().maximize();
			test.pass("Navigated to monsterindia site");
			driver.findElement(By.partialLinkText("UPLOAD RESUME")).click();


			driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\user1\\Downloads\\New folder\\Sample Doc.docx");

			Thread.sleep(5000);
			test.pass("couldnt upload the resume");
			driver.findElement(By.id("pop_upload")).click();
			
			test.pass("Submitted the resume");
			driver.close();
			
			test.pass("Closed the browser successfully");
			
			test.info("Test is Completed");
			
			
			
			 ExtentTest test2 = extent.createTest("This test is again used to  verify failed test case");
			 
				
				driver=new ChromeDriver();
				
				test2.log(Status.INFO,"Starting test case");
				driver.get("https://www.monsterindia.com/");
				driver.manage().window().maximize();
				test2.pass("Navigated to monsterindia site");
				driver.findElement(By.partialLinkText("UPLOAD RESUME")).click();


				driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\user1\\Downloads\\New folder\\Sample Doc.docx");

				Thread.sleep(5000);
				test2.fail("couldnt upload the resume");
				driver.findElement(By.id("pop_upload")).click();
				
				test2.pass("Submitted the resume");
				driver.close();
				
				test2.pass("Closed the browser successfully");
				
				test2.info("Test is Completed");
		


			extent.flush();
		}
}


