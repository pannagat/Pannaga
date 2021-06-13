package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class POMWebPage {
	
	
	static WebElement element=null;
	
	
	
	
	public static WebElement sigin(WebDriver driver)
	{
	 element=driver.findElement(By.linkText("Sign in"));
		return element;
	}
	
	public static WebElement email(WebDriver driver)
	{
		WebElement element=driver.findElement(By.id("email_create"));
		return element;
	}
	public static WebElement submit(WebDriver driver)
	{
		element=driver.findElement(By.id("SubmitCreate"));
		return element;
	}
	public static WebElement gender(WebDriver driver)
	{
		element=driver.findElement(By.id("id_gender2"));
		return element;
	}
	public static WebElement firstname(WebDriver driver)
	{
		element=driver.findElement(By.id("customer_firstname"));
		return element;
	}
	public static WebElement lastname(WebDriver driver)
	{
		element=driver.findElement(By.id("customer_lastname"));
		return element;
	}
	
	
	
	
	

}
