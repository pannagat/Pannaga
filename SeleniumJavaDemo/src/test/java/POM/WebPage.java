package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebPage {
	
static WebDriver driver;
	 static WebElement element;
	public static WebElement join(WebDriver driver)
	{
		
	element=driver.findElement(By.linkText("Join now"));
	return element;
		
	}
	
	public static WebElement email(WebDriver driver)
	{
		element=driver.findElement(By.id("email-or-phone"));
		return element;
		
	}
	
	
	public static WebElement password(WebDriver driver)
	{
		element=driver.findElement(By.id("password"));
		return element;
		
	}
	
	public static WebElement submit(WebDriver driver)
	{
		element=driver.findElement(By.id("join-form-submit"));
		return element;
		
	}
	
	
	public static WebElement firstname(WebDriver driver)
	{
		element=	driver.findElement(By.id("first-name"));
		return element;
		
	}
	

	public static WebElement lastname(WebDriver driver)
	{
		element=driver.findElement(By.id("last-name"));
		return element;
		
	}
	
}

	
	
	
	
































/*public static void main(String[] args) throws InterruptedException {
		
		
WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.linkedin.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Join now")).click();
		Thread.sleep(3500);
		driver.findElement(By.id("email-or-phone")).sendKeys("0123456789");
		
		driver.findElement(By.id("password")).sendKeys("Queen@123");
		driver.findElement(By.id("join-form-submit")).click();
		
		driver.findElement(By.id("first-name")).sendKeys("Ranga");
		
		driver.findElement(By.id("last-name")).sendKeys("Nath");*/
		
	

	
	
	
	
	
	
	
	


