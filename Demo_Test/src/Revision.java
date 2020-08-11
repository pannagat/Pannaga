import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.NoSuchElementException;

public class Revision {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions coptions = new ChromeOptions();
		coptions.addArguments("--disable-notifications");
	
System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver2\\chromedriver.exe"); 
	
	    
	   WebDriver driver=new ChromeDriver(coptions);
	   driver.navigate().to("https://www.jobsforher.com/");
	   driver.manage().window().maximize();
	    driver.findElement(By.partialLinkText("Sign Up")).click();
	   driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[4]/div[1]/div[4]/a[1]/span[2]")).click();
	   driver.findElement(By.name("full_name")).sendKeys("Pannaga T N");
	   driver.findElement(By.id("mobile-number")).sendKeys("8197025222");
	   driver.findElement(By.id("email")).sendKeys("pannaga32@gmail.com");
	   driver.findElement(By.id("password")).sendKeys("Queen@123");
	   
	   
	   
	   driver.findElement(By.partialLinkText("SIGN UP & CONTINUE")).click();
	   
	   
	   /*driver.get("https://www.naukri.com/");
	   driver.manage().window().maximize();
	   driver.quit();
	   driver.close();*/
	   
	   
	   
	   
	   
	   
	   
	  /* driver.get("https://myremotedevelopers.com//");
	   driver.manage().window().maximize();
	   
	   driver.findElement(By.partialLinkText("Login")).click();
	   driver.findElement(By.xpath("/html[1]/body[1]/div[1]/nav[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[2]/a[1]")).click();
	   Thread.sleep(5000);
	   driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("pannaga32@gmail.com");
	   driver.findElement(By.xpath(" //input[@placeholder='Password']")).sendKeys("mydev123");
	   driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
	   Thread.sleep(7000);
	   
	   driver.findElement(By.xpath("/html[1]/body[1]/ui-view[1]/header[1]/nav[1]/div[1]/div[2]/ul[2]/li[1]")).click();
	   driver.findElement(By.linkText("Logout")).click();
	   driver.quit();*/
	   
	
	   //driver.findElement(By.partialLinkText("Join now")).click();
	   
//driver.findElement(By.cssSelector("body")).sendKeys(Keys.chord(Keys.CONTROL, "a"));




	}

}
