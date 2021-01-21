package PageObjectModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.WebPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PageObjectTestCase {
	
	 static WebDriver driver=null;
	
	public static void main(String[] args) throws InterruptedException {
		
		
	
		
		WebDriverManager.chromedriver().setup();
				WebDriver driver=new ChromeDriver();
				
				
				WebPage practice=new WebPage();
				driver.get("https://www.linkedin.com");
				driver.manage().window().maximize();
				practice.join(driver).click();
				practice.email(driver).sendKeys("0123456789");
				practice.password(driver).sendKeys("Queen@123");
				practice.submit(driver).click();
				practice.firstname(driver).sendKeys("Mandaar");
				practice.lastname(driver).sendKeys("Maatre");
				
				
				
				
				
				

}
}
