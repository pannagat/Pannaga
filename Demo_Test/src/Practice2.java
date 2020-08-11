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


	
public class Practice2 {

	public static void main(String[] args) throws InterruptedException {
		{  
			
			
			ChromeOptions coptions = new ChromeOptions();
			coptions.addArguments("--disable-notifications");
		
System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver4\\chromedriver.exe"); 
WebDriver driver=new ChromeDriver(coptions);
driver.get("https://www.amazon.in/");
driver.manage().window().maximize();
driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Phones");
driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']")).click();
Thread.sleep(2000);

driver.findElement(By.xpath("//li[@id='p_89/Generic']//label")).click();





















/////////////////////////////drop down///////////////////
/*driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
WebElement element=driver.findElement(By.id("day"));

Select obj=new Select(element);
obj.selectByIndex(4);


WebElement element1=driver.findElement(By.id("month"));

Select obj1=new Select(element1);
obj1.selectByValue("9");


WebElement element2=driver.findElement(By.id("year"));

Select obj2=new Select(element2);
obj2.selectByVisibleText("1942");
System.out.println("All the drop down have been clicked");*/





































































///////////////////////////get attribute
/*WebElement element=driver.findElement(By.id("email"));
System.out.println(element.getAttribute("id"));*/


//////////////////////////upload a file
/*driver.get("https://www.monsterindia.com/");
Thread.sleep(1500);
 driver.manage().window().maximize();
 driver.findElement(By.partialLinkText("UPLOAD RESUME")).click();
 driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\user1\\Downloads\\New folder\\Resume_Pannaga_10.docx");*/




//driver.get("https://www.facebook.com/");
//driver.manage().window().maximize();
/*WebElement element=driver.findElement(By.xpath("//div[@class='_5iyy']//img[@class='img']"));
System.out.println(element.isEnabled());
System.out.println(element.isDisplayed());
System.out.println(element.isSelected());*/





/*driver.get("https://www.monsterindia.com/");
driver.manage().window().maximize();
String element=driver.getTitle();
System.out.println(element);*/












////////////////////////browser navigation

/*driver.get("https://www.google.co.in");
driver.manage().window().maximize();
driver.findElement(By.name("q")).sendKeys("Automation");
driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
Thread.sleep(3000);

driver.navigate().back();
System.out.println("back button is clicked");

driver.navigate().forward();
System.out.println("forward button has been clicked");

driver.navigate().refresh();
System.out.println("refresh button has been clicked");*/
		}
	}
}








































/*driver.get("https://www.amazon.in");
driver.manage().window().maximize();
WebElement srs=driver.findElement(By.id("searchDropdownBox"));
Select s1=new Select(srs);
//s1.selectByIndex(11);
//s1.selectByValue("search-alias=mobile-apps");
//s1.selectByVisibleText("Car & Motorbike");
List<WebElement> sar=s1.getOptions();
System.out.println(sar.size());
for(int i=0;i<sar.size();i++){
	String txt=sar.get(i).getText();
	
	System.out.println(txt);*/


/*driver.get("https://www.monsterindia.com/");
driver.manage().window().maximize();
driver.findElement(By.partialLinkText("UPLOAD RESUME")).click();
driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\user1\\Downloads\\New folder\\Sample Doc.docx");
Thread.sleep(1500);
driver.findElement(By.id("pop_upload")).click();*/
























	

	

	


