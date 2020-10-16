

	
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

	
	public class TestNGListenersDemo2 {
		static WebDriver driver=null;
		
		
		
		@Test
		public void Test4() throws InterruptedException
		{
			System.out.println("Iam inside Test4");


		}
		
		
		@Test
		public void Test5()
		{
			System.out.println("Iam inside Test5");
			Assert.assertTrue(false);
		}
		
		@Test
		public void Test6()
		{
			System.out.println("Iam inside Test6");
			throw new SkipException("This test is skipped");
		}



}
