import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.NoSuchElementException;
public class Practice {

	public static void main(String[] args) throws InterruptedException {
		
		{ 
			ChromeOptions coptions = new ChromeOptions();
			coptions.addArguments("--disable-notifications");
		
System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe"); 
		
		    
		   WebDriver driver=new ChromeDriver(coptions);
		   driver.get("https://www.monsterindia.com/");
		   
		   driver.manage().window().maximize();
		   
		   driver.findElement(By.partialLinkText("UPLOAD RESUME")).click();
		   driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\user1\\Downloads\\New folder\\Sample Doc.docx");
		   
		   
		   Thread.sleep(33000);

		   
		  driver.findElement(By.id("pop_upload")).click();
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		    /*driver.get("https://www.naukri.com/");
		  driver.manage().window().maximize();
		  driver.findElement(By.xpath("//input[@class='orangeBtn bifurLightBox']")).click();
		  Thread.sleep(3000);
		  
		  driver.findElement(By.xpath("/html[1]/body[1]/div[10]/div[5]/div[2]/form[1]/div[1]/div[1]/button[1]")).click();*/


		   
	   
/*driver.get("https://www.monsterindia.com/");

driver.manage().window().maximize();

driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/a[1]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/i[1]")).click();
Thread.sleep(2000);
driver.findElement(By.name("fullname")).sendKeys("Pannaga");
driver.findElement(By.name("email")).sendKeys("pannaga_22@yahoo.co.in");

driver.findElement(By.name("Password")).sendKeys("Queen@123");

driver.findElement(By.name("Mobile Number")).sendKeys("09820283105");





driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\user1\\Downloads\\New folder\\Resume_Pannaga_10.docx");


driver.findElement(By.id("registerSubmit" )).click();

driver.close();*/

	}
	}
}


