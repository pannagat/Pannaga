package Config;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Log4js.Log4jsDemo;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDemo {

	WebDriver driver=null;
	public static String browsername=null;
	
	private static Logger logger=LogManager.getLogger(Log4jsDemo.class);

	@BeforeTest

	public void setuptest()
	{
		String projectpath=System.getProperty("user.dir");
		PropertiesFile.getproperties();
		
		if(browsername.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			//System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe"); 

			 driver=new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			
		}
		
		 logger.info("Browser started");
	}

	@Test

	public  void demo()
	{



		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		//driver.findElement(By.linkText("Sign in")).click();
		//driver.findElement(By.id("email_create")).sendKeys("pannaga_22@yahoo.co.in");
		//driver.findElement(By.id("SubmitCreate")).click();



	}
	@AfterTest
	public void teardowntest()
	{
		driver.close();
		System.out.println("Test completed");
		PropertiesFile.setproperties();
	}




}


