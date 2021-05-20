package Practice3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Ignore

public class TestNgIgnoreTest {
	WebDriver driver=null;
	

	
	
	
	
	
	
	@Test
	
		public void Test1()
		{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
			driver.get("https://www.google.com");
			driver.manage().window().maximize();
			
		}
	
@Test
	public void Test2() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		driver.quit();
		
	}
	
	
	}




