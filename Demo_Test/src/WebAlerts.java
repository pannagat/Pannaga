import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.NoSuchElementException;
public class WebAlerts {

	public static void main(String[] args)throws InterruptedException  {
		
		{ 
			ChromeOptions coptions = new ChromeOptions();
			coptions.addArguments("--disable-notifications");
		
System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver4\\chromedriver.exe"); 
WebDriver driver=new ChromeDriver(coptions);


driver.get("https://www.naukri.com");
driver.manage().window().maximize();
driver.findElement(By.xpath("//div[@class='wdgt-register-upload-btn']//button[@class='btn'][contains(text(),'Register for free')]")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("//button[contains(text(),'I am Experienced')]")).click();

driver.findElement(By.id("fname")).sendKeys("MandaarMatre");
driver.findElement(By.id("email")).sendKeys("automationuser1982@gmail.com");
driver.findElement(By.name("password")).sendKeys("Queen@123");
driver.findElement(By.name("number")).sendKeys("0123456789");







/*driver.get("https://www.testandquiz.com/selenium/testing.html");
driver.manage().window().maximize();
driver.findElement(By.xpath("//button[contains(text(),'Generate Confirm Box')]")).click();
Thread.sleep(10000);
String text=driver.switchTo().alert().getText();
System.out.println(text);


driver.switchTo().alert().dismiss();

/*driver.switchTo().alert().accept();
System.out.println("correct text appeared");*/












/*WebElement drop=driver.findElement(By.id("searchDropdownBox"));
Select d1=new Select(drop);
//d1.selectByIndex(5);

d1.selectByVisibleText("Books");


//driver.close();








/*driver.get("http://softwaretestingplace.blogspot.com/2017/03/javascript-alert-test-page.html");

driver.manage().window().maximize();

driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();
String text=driver.switchTo().alert().getText();
System.out.println(text);

Thread.sleep(5000);

//driver.switchTo().alert().accept();

driver.switchTo().alert().dismiss();*/
















/*driver.get("https://ksrtc.in/");
driver.manage().window().maximize();

driver.findElement(By.xpath("/html[1]/body[1]/main[1]/form[1]/div[1]/div[1]/div[2]/div[3]/button[1]")).click();
String text=driver.switchTo().alert().getText();
System.out.println(text);
Thread.sleep(3000);

driver.switchTo().alert().accept();

Thread.sleep(3000);

driver.close();*/

	

	}

}
}
