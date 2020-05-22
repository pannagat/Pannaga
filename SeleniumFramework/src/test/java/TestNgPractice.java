import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgPractice {
	
	WebDriver driver=null;
	@	BeforeTest
	public void setup()
	{
		
		ChromeOptions coptions = new ChromeOptions();
		coptions.addArguments("--disable-notifications");
	
System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver3\\chromedriver.exe"); 
	driver=new ChromeDriver(coptions);
	}

	@Test(priority=1,description="To check the login functionality of amazon.in")
	public void TestCase() throws InterruptedException
	{
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("Hello, Sign in")).click();
		Thread.sleep(4500);
		
		driver.findElement(By.id("ap_email")).sendKeys("9880300340");
		
		driver.findElement(By.id("continue")).click();
		Thread.sleep(4500);
		driver.findElement(By.id("ap_password")).sendKeys("Queen@123");
	}
	

	
	@Test(priority=2,description="To check the search functionality of Google")
	public void Search() throws InterruptedException
	{
		ChromeOptions coptions = new ChromeOptions();
		coptions.addArguments("--disable-notifications");
	
System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver3\\chromedriver.exe"); 
	driver=new ChromeDriver(coptions);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("Automation By Selenium");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		Thread.sleep(5000);
	}

	
	/*@AfterTest
	public void finishtest()
	{
		
	driver.close();
	}*/
	
}
