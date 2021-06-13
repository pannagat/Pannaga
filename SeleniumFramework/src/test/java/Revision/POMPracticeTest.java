package Revision;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.POMWebPage;

import io.github.bonigarcia.wdm.WebDriverManager;


public class POMPracticeTest {
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		POMTest();
		
	}
		public static void POMTest() throws InterruptedException
		{
			
			WebDriverManager.chromedriver().setup();
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("http://automationpractice.com/index.php");
			driver.manage().window().maximize();
			
			
			POMWebPage.sigin(driver).click();
			Thread.sleep(5000);
			POMWebPage.email(driver).sendKeys("pannaga_22@yahoo.co.in");
			
			POMWebPage.submit(driver).click();
			Thread.sleep(10000);
			
			
			
			
			
			
		}
		
		
		
	

}
