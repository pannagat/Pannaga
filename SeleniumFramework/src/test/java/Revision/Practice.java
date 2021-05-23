package Revision;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		implicitwait();
		
	}
	
		
		
		public static  void implicitwait()
		{
		
	WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.google.co.in");
		//driver.manage().window().maximize();
		
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.name("q")).sendKeys("Automation");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		WebDriverWait wait=new WebDriverWait(driver, 30);
		WebElement element=wait.until(ExpectedConditions.elementToBeClickable(By.name("abcde")));
		
		
		
		
		
		//driver.findElement(By.name("abcd")).click();
		
		driver.close();
		
		
		
		
		}
	}
			
		

		
		
		
		
		
		
		
		
		/*driver.get("http://automationpractice.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Sign in")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("email_create")).sendKeys("pannaga_22@yahoo.co.in");
		driver.findElement(By.id("SubmitCreate")).click();
		
		Thread.sleep(10000);
		
		driver.findElement(By.id("id_gender2")).click();
		//driver.findElement(By.id("customer_firstname")).sendKeys("Pannaga");
		
		//driver.findElement(By.id("customer_lastname")).sendKeys("Jamadagni");
		
		//driver.findElement(By.id("address2")).sendKeys("Apartment2");
		
		driver.findElement(By.id("city")).sendKeys("Belfast");
		WebElement element2=driver.findElement(By.id("id_state"));
		Select obj2=new Select(element2);
		obj2.selectByValue("36");
		/*WebElement element=driver.findElement(By.id("days"));
		
		
		Select obj1=new Select(element);
		obj1.selectByValue("17");
		System.out.println("Day is selected");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//****************************HCL assignment*****************************************
		
		
		/*driver.get("https://return-order-app.herokuapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("order-id")).sendKeys("1257945872");
		driver.findElement(By.xpath("//button[contains(text(),'Find Order')]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[contains(text(),'Return This Product')]")).click();
		Thread.sleep(3000);
		
	WebElement element=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]"));
		File test=new File("Result.txt");
		FileWriter fw=new FileWriter(test);
		PrintWriter pq= new PrintWriter(fw);
		
		
		
		pq.println(element.getText());
		pq.close();
		
		
		//driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		
		//WebElement methods
		//isEnabled
		WebElement element=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/img[1]"));
		System.out.println(element.isEnabled());
		
		System.out.println(element.isSelected());
		
		System.out.println(element.isDisplayed());
		
		
		WebElement unm=driver.findElement(By.id("pass"));
		unm.sendKeys("Queen@123");
		
		
		Thread.sleep(5000);
		
		unm.clear();
		
		//driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		/*getcurrent url
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		//get title
		String unm=driver.getTitle();
		System.out.println(unm);
		
		
		
		driver.quit();
		
	/*WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();*/
		
		//get attributes
		
		//WebElement element=driver.findElement(By.id("email"));
		//System.out.println(element.getAttribute("id"));
		
		//get tagname
		//System.out.println(element.getTagName();
		
		
		
		/*browser navigation methods
		
				driver.navigate().to("https://www.google.com");
				driver.manage().window().maximize();
				
				driver.findElement(By.name("q")).sendKeys("Automation");
				
				driver.findElement(By.name("q")).sendKeys(Keys.ENTER); 
				driver.navigate().back();
				System.out.println("back is working");
				
				Thread.sleep(5000);
				
				driver.navigate().forward();
				System.out.println("forward is working");
				
				
				driver.navigate().refresh();
				
				System.out.println("Refresh is done");*/
		
		
		


