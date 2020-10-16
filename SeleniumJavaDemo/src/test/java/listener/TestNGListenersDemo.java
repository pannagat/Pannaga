

	
	package listener;

	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

	
	public class TestNGListenersDemo {
		static WebDriver driver=null;
		
		
		@BeforeTest
		public static void stup()
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		@Test
		public void Test1() throws InterruptedException
		{
			driver.get("https://www.monsterindia.com/");
			driver.manage().window().maximize();
			driver.findElement(By.partialLinkText("UPLOAD RESUME")).click();


			driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\user1\\Downloads\\New folder\\Sample Doc.docx");

			Thread.sleep(5000);

			driver.findElement(By.id("pop_upload")).click();
			}


		
		
		
		@Test
		public void Test2()
		{
			System.out.println("Iam inside Test2");
			Assert.assertTrue(false);
		}
		
		@Test
		public void Test3()
		{
			System.out.println("Iam inside Test3");
			throw new SkipException("This test is skipped");
		}



}
