package utils;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReviseAfterLong {
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement unm=driver.findElement(By.id("email"));
		System.out.println(unm.getAttribute("id"));
		System.out.println(unm.getTagName());
		
		
		driver.close();
		
		
		
		
		/*driver.get("https://www.monster.com/");
		driver.manage().window().maximize();
	System.out.println(driver.getCurrentUrl());
		
		
		
		//get title
		//String title=driver.getTitle();
		//System.out.println(title);*/
	}
}


		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//radiobuttons
				
				
		/*List<WebElement> gender=driver.findElements(By.name("sex"));
				int cnt=gender.size();
				System.out.println(cnt);
				
				
				for(int i=0;i<cnt;i++)
				{
					String txt=gender.get(i).getText();
					System.out.println(txt);
					
					gender.get(i).click();
					
				}*/
		
		
		
		
		
		
		
		
		
		
		
		
		










		
	
/****************************************************************************		
		
	/*Set<String> set=driver.getWindowHandles();
		System.out.println(set);
		Iterator<String> itr=set.iterator();
		while(itr.hasNext())
		{
			String child=itr.next();
			if(parentwindow.equals(child))
			{
				driver.switchTo().window(child);
				Thread.sleep(3500);
				
				System.out.println(driver.switchTo().window(child).getTitle());
				
			
				driver.findElement(By.name("firstname")).sendKeys("Automation");
				driver.findElement(By.name("lastname")).sendKeys("User3");
				driver.findElement(By.name("reg_email__")).sendKeys("pannaga_22@yahoo.co.in");
				//Thread.sleep(3500);
				//driver.findElement(By.name("reg_email_confirmation_")).sendKeys("pannaga_22@yahoo.co.in");
				driver.findElement(By.name("reg_passwd__")).sendKeys("Queen@123");
				
				//drop down scenarios
				/*WebElement element=driver.findElement(By.id("day"));
				Select obj=new Select(element);
				obj.selectByIndex(10);
				
				WebElement element2=driver.findElement(By.id("month"));
				Select obj2=new Select(element2);
				obj2.selectByValue("7");
				
				
				WebElement element3=driver.findElement(By.id("year"));
				Select obj3=new Select(element3);
				obj3.selectByVisibleText("1985");*/
				
				
				

				
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


