

package Practice3;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Revision {

	
	@Test
		public void testrun()
		{
			System.out.println("Iam inside test1");
		}
	
	
	@Test
	public void testrun2()
	{
		System.out.println("Iam inside test2");
		//int i=100/0;
	}
	
	
	
	@Test(retryAnalyzer=listener.RetryAnalyzer.class)
	public void testrun3()
	{
		System.out.println("Iam inside test3");
		Assert.assertTrue(0>1);
	}

		
				
				//WebDriverManager.chromedriver().setup();
				
				
				//WebDriver driver=new ChromeDriver();
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			/*	driver.get("http://automationpractice.com/index.php");
				driver.manage().window().maximize();
				driver.findElement(By.linkText("Sign in")).click();
				Thread.sleep(4000);
				driver.findElement(By.id("email_create")).sendKeys("pannaga_22@yahoo.co.in");
				driver.findElement(By.id("SubmitCreate")).click();
				Thread.sleep(4000);
				
				
WebElement day=driver.findElement(By.id("months"));
				
				day.click();
				
				List<WebElement> dropdown=driver.findElements(By.cssSelector("#months>option"));
				for(WebElement e: dropdown) {
					
					
						System.out.println(e.getText());
					if(e.getText().equals("May")) {
						e.click();
						break;
					}
				}
				
				
				/*driver.get("https://www.facebook.com");
				driver.manage().window().maximize();
				
				String parent=driver.getWindowHandle();
				System.out.println(parent);

				Thread.sleep(10000);
				driver.findElement(By.linkText("Create New Account")).click();
				
				
				Set<String>s1=driver.getWindowHandles();
				Iterator<String> i1=s1.iterator();
				while(i1.hasNext())
				{
					String child=i1.next();
					if(!parent.equalsIgnoreCase(child))
							{
						driver.switchTo().window(child);
							} 
					Thread.sleep(5000);
				WebElement day=driver.findElement(By.id("day"));
				
				day.click();
				
			List<WebElement> dropdown=driver.findElements(By.cssSelector("#day"));
			for(WebElement skills:dropdown)
			{
				if(skills.getText().equals("15"))
				{
					skills.click();
				}
			}*/
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				/*driver.get("https://www.naukri.com");
				driver.manage().window().maximize();
				
				Thread.sleep(3000);
				String title=driver.getTitle();
				
				driver.quit();
				
				System.out.println(title);*/
				
				
				
				
				
			}
		// TODO Auto-generated method stub

	



