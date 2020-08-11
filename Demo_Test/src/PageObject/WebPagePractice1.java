package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebPagePractice1 {
	static WebDriver driver=null;
	
	By Register_user=By.xpath("//div[@class='wdgt-register-upload-btn']//button[@class='btn'][contains(text(),'Register for free')]");
	By Experienced=By.xpath("//button[contains(text(),'I am Experienced')]");
	By First_name=By.id("fname");
	By email=By.id("email");
	By password=By.name("password");
	By number=By.name("number");
	
	public WebPagePractice1(WebDriver driver)
	{
		this.driver=driver;
	}
	
	

	public void method1()
	{
		driver.findElement(Register_user).click();
		
	}
	public void method2()
	{
		driver.findElement(Experienced).click();
		
}
	public void method3(String text1)
	{
		driver.findElement(First_name).sendKeys(text1);
	}
	public void method4(String text2)
	{
		driver.findElement(email).sendKeys(text2);
	}
	public void method5(String text3)
	{
		driver.findElement(password).sendKeys(text3);
	}
	
}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*static WebElement element=null;
	
	
	public static WebElement signup(WebDriver driver)
	{
	WebElement element=driver.findElement(By.xpath("//div[@class='wdgt-register-upload-btn']//button[@class='btn'][contains(text(),'Register for free')]"));
	return element;
	}
	
	public static WebElement expereienced(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//button[contains(text(),'I am Experienced')]"));
		return element;
	}
	
	public static WebElement First_name(WebDriver driver)
	{
		element=driver.findElement(By.id("fname"));
		return element;
	}
	public static WebElement email(WebDriver driver)
	{
		element=driver.findElement(By.id("email"));
		return element;
	}
	
	public static WebElement password(WebDriver driver)
	{
		element=driver.findElement(By.name("password"));
		return element;
	}*/
	
	
	
	
	
	
	


