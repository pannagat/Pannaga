import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.NoSuchElementException;
public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		
		{  
			ChromeOptions coptions = new ChromeOptions();
			coptions.addArguments("--disable-notifications");
		
System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver3\\chromedriver.exe"); 
		
		//System.setProperty("webdriver.gecko.driver","D:\\geckodriver-v0.24.0-win32\\geckodriver.exe");
		    
		    WebDriver driver=new ChromeDriver(coptions);
		  
		    driver.get("https://www.linkedin.com/");
			 
		    driver.manage().window().maximize();
		    driver.findElement(By.linkText("Join now")).click();
		    
		    Thread.sleep(4500);
		    driver.findElement(By.id("email-or-phone")).sendKeys("0123456789");
		   driver.findElement(By.id("password")).sendKeys("0123456789");
		    driver.findElement(By.id("join-form-submit")).click();
	
		    driver.findElement(By.id("first-name")).sendKeys("nitish");
		    driver.findElement(By.id("last-name")).sendKeys("bharadwaj");
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
/*******************to select only single radio button*******************************8
		 List<WebElement> element= driver.findElements(By.name("sex"));
		    int cnt=element.size();
		    for(int i=1;i<=cnt;i++)
		    {
		    	element.get(1).click();
		    }*/
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    /*driver.findElement(By.name("firstname")).sendKeys("Mother");
		    driver.findElement(By.name("lastname")).sendKeys("Theresa");
		    
		    driver.findElement(By.name("reg_email__")).sendKeys("0123456789");
		    
		    driver.findElement(By.name("reg_passwd__")).sendKeys("scorpio");
		    
		    
		   WebElement day= driver.findElement(By.id("day"));
		   Select d1=new Select(day);
		   	
		   
		  /*List<WebElement> dd= d1.getOptions();
		  System.out.println(dd.size());
		  for(int i=0;i<dd.size();i++)
		  {
			String txt=  dd.get(i).getText();
			System.out.println(txt);
			dd.get(i).click();
			  
		  }
		   
		   WebElement month= driver.findElement(By.id("month"));
		   
		   Select m1=new Select(month);
		   m1.selectByValue("5");
		   System.out.println(month.getAttribute("value"));
		   

		   
		   WebElement year= driver.findElement(By.id("year"));
		   
		   Select y=new Select(year);
		   y.selectByValue("1982");
		   
		  List<WebElement> gender=driver.findElements(By.name("sex"));
		  int cnt=gender.size();
		  System.out.println(cnt);
		  
		  for(int i=0;i<cnt;i++)
		  {
			 String txt= gender.get(i).getText();
			 System.out.println(txt);
			 gender.get(i).click();
			 Thread.sleep(6000);
		  }*/
		  
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		  
		  
		  /*WebElement unm=driver.findElement(By.id("email"));
		   unm.sendKeys("pannaga_22@yahoo.co.in");
		   
		   WebElement unm1=driver.findElement(By.name("pass"));
				 unm1.sendKeys("Queen@123");
				 
				 unm.clear();
				 unm1.clear();
				
				 
				 unm.sendKeys("pannaga32@gmail.com");
				 driver.close();*/
				 
				 
		   
		   
		   
		  
		  /*WebElement img=driver.findElement(By.xpath("//div[@class='_5iyy']//img[@class='img']"));
		  System.out.println(img.isDisplayed());
		  System.out.println(img.isEnabled());
		  System.out.println(img.isSelected());*/
		    
		    
		    
		    /*driver.findElement(By.id("email")).sendKeys("pannaga_22@yahoo.co.in");
		    
		    driver.findElement(By.name("pass")).sendKeys("Queen@123");
		    
		    driver.findElement(By.id("loginbutton")).click();
		    Thread.sleep(3000);
		    
		    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div[2]/div[1]/div/div/div/div/div[1]/ul/li/a/div")).click();
		    
		    driver.findElement(By.linkText("Create post")).click();*/
		    
		    
		    
		    
		  /*  String title= driver.getTitle();
			  
			  System.out.println(title);
			  
			  System.out.println(driver.getCurrentUrl());
			  
			  WebElement unm=driver.findElement(By.id("email"));
			  System.out.println(unm.getAttribute("id"));
			  
			  WebElement unm1=driver.findElement(By.name("pass"));
			  System.out.println(unm1.getAttribute("id"));
			  
			  driver.close();*/
			  
			  
			  
			
			  /*  unm.sendKeys("pannaga_22yahoo.co.in");
			    
			    driver.findElement(By.name("pass")).sendKeys("Queen@123");
			    driver.findElement(By.id("loginbutton")).click();
			    Thread.sleep(3000);
		    
		    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/div[1]")).click();
		    
		    
		    driver.findElement(By.partialLinkText("Create post")).click();*/
		    
		    
		    
		    
		
		    
		   /*driver.findElement(By.id("userNavigationLabel")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.partialLinkText("Log Out")).click();
		    
		    driver.close();*/

	}

}
}
