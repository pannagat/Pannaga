package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POMWebPage2 {
	
	WebDriver driver=null;
	
	By sigin=By.linkText("Sign in");
	
	By email=By.id("email_create");
	
	
	By submit=By.id("SubmitCreate");
	
	By gender=By.id("id_gender2");
	
	By firstname=By.id("customer_firstname");
	
	By lastname=By.id("customer_lastname");
	
	public POMWebPage2(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	
	public void signinaccount()
	{
		driver.findElement(sigin).click();
	}
	
	public void createemail(String text1)
	{
		driver.findElement(email).sendKeys(text1);
	}
	
	public void createsubmit()
	{
		driver.findElement(submit).click();
	}
	
	public void genderclick()
	{
		driver.findElement(gender).click();
	}
	
	public void fname(String text2)
	{
		driver.findElement(firstname).sendKeys(text2);
	}
	
	public void lname(String text3)
	{
		driver.findElement(firstname).sendKeys(text3);
	}
	
	

}
