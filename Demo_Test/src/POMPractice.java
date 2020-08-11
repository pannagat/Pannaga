import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import PageObject.WebPagePractice1;
public class POMPractice {

	static WebDriver driver=null;

		public static void main(String[] args) throws InterruptedException {
		
			
			ChromeOptions coptions = new ChromeOptions();
			coptions.addArguments("--disable-notifications");
		
	System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver4\\chromedriver.exe"); 
driver=new ChromeDriver(coptions);


WebPagePractice1 practice=new WebPagePractice1(driver);

driver.get("https://www.naukri.com");
driver.manage().window().maximize();
practice.method1();

Thread.sleep(4000);
practice.method2();
practice.method3("MandaarMatre");
practice.method4("automationuser1982@gmail.com");
practice.method5("Queen@123");

		}
}



		






























/*driver.get("https://www.naukri.com");
driver.manage().window().maximize();
	WebPagePractice1.signup(driver).click();
	Thread.sleep(4000);
	WebPagePractice1.expereienced(driver).click();
	WebPagePractice1.First_name(driver).sendKeys("MandaarMatre");
	WebPagePractice1.email(driver).sendKeys("automationuser1982@gmail.com");
	WebPagePractice1.password(driver).sendKeys("Queen@123");*/
	
	
	
	

	


