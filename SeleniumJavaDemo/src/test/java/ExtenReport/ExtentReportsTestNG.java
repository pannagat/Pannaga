package ExtenReport;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportsTestNG {

	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;


	@BeforeTest
	public void setup()
	{

		htmlReporter = new ExtentHtmlReporter("extentReports.html");

		extent= new ExtentReports();
		extent.attachReporter(htmlReporter);

	}
	@Test

	public void test1() throws Exception
	{

		ExtentTest test = extent.createTest("Login to facebook");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		test.log(Status.INFO,"Starting test case");
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		test.pass("Navigated to Facebook site");
		
		driver.findElement(By.id("email")).sendKeys("pannaga_22@yahoo.co.in");
		driver.findElement(By.id("pass")).sendKeys("Queen@123");
		driver.findElement(By.name("login")).click();
		test.pass("Login is succesful");
		Thread.sleep(4000);
		
		driver.close();
	}
		
		@Test

		public void test2() throws Exception
		{

			ExtentTest test2 = extent.createTest("Login to facebook");
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			test2.log(Status.INFO,"Starting test case");
			driver.get("https://www.facebook.com");
			driver.manage().window().maximize();
			test2.pass("Navigated to Facebook site");
			
			driver.findElement(By.id("email")).sendKeys("pannaga_22@yahoo.co.in");
			driver.findElement(By.id("pass")).sendKeys("King@123");
			driver.findElement(By.name("login")).click();
			test2.fail("Login is unsuccesful");
		
		
		
		//test.info("Test is Completed");
		//test.fail("couldnt upload the resume");
		//test.addScreenCaptureFromPath("extent.png");
	}

	@AfterTest

	public void teardown()
	{
extent.flush();
	}











}
