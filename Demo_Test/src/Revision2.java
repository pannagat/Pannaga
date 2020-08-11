import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.NoSuchElementException;
public class Revision2 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions coptions = new ChromeOptions();
		coptions.addArguments("--disable-notifications");
	
System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver2\\chromedriver.exe"); 
WebDriver driver=new ChromeDriver(coptions);


driver.get("https://www.amazon.in");
driver.manage().window().maximize();
WebElement d2=driver.findElement(By.id("searchDropdownBox"));
Select d3=new Select(d2);
List<WebElement> d4=d3.getOptions();
System.out.println(d4.size());
for(int i=0;i<d4.size();i++)
{
	String txt2=d4.get(i).getText();
	System.out.println(txt2);
}






/*WebElement pan=driver.findElement(By.id("day"));

Select d1=new Select(pan);
List<WebElement> sar=d1.getOptions();
System.out.println(sar.size());
for(int i=0;i<sar.size();i++)
{
	String txt=sar.get(i).getText();
	System.out.println(txt);
	sar.get(i).click();
}
*/	















/*d1.selectByIndex(19);


WebElement ptn=driver.findElement(By.id("month"));
Select m1=new Select(ptn);
m1.selectByIndex(5);

WebElement nan=driver.findElement(By.id("year"));
Select y1=new Select(nan);
y1.selectByIndex(20);*/


















//facebook select by value*************************************
/*WebElement day=driver.findElement(By.id("day"));

Select d1=new Select(day);
d1.selectByValue("17");

WebElement month=driver.findElement(By.id("month"));

Select m1=new Select(month);
m1.selectByValue("11");

WebElement year=driver.findElement(By.id("year"));

Select y1=new Select(year);
y1.selectByValue("1982");*/























//*********************drop down amazon****************************************
/*driver.navigate().to("https://www.amazon.in/");
driver.manage().window().maximize();


WebElement abc=driver.findElement(By.id("searchDropdownBox"));
Select d1=new Select(abc);
d1.selectByIndex(12);

d1.selectByValue("search-alias=apparel");

d1.selectByVisibleText("Garden & Outdoors");*/




//******************checkbox**************************
/*driver.navigate().to("https://www.amazon.in/");
driver.manage().window().maximize();
driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Phones");
driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']")).click();
Thread.sleep(1500);
driver.findElement(By.xpath("//li[@id='p_89/Nokia']//i[@class='a-icon a-icon-checkbox']")).click();*/



























	





/*driver.navigate().to("https://www.facebook.com/");
driver.manage().window().maximize();
driver.findElement(By.linkText("Forgotten account?")).click();


driver.findElement(By.name("firstname")).sendKeys("Selenium");

driver.findElement(By.name("lastname")).sendKeys("Webdriver");


driver.findElement(By.name("reg_email__")).sendKeys("0123456789");

driver.findElement(By.name("reg_passwd__")).sendKeys("Queen@123");*/











/************WebElement pannaga=driver.findElement(By.xpath("//div[@class='_5iyy']//img[@class='img']"));

System.out.println(pannaga.isEnabled());
System.out.println(pannaga.isSelected());
System.out.println(pannaga.isDisplayed());************************/


















/*driver.findElement(By.id("email")).sendKeys("pannaga_22@yahoo.co.in");
driver.findElement(By.id("pass")).sendKeys("Queen@123");

driver.findElement(By.id("email")).clear();
System.out.println("clear for email done");

driver.findElement(By.id("pass")).clear();


System.out.println("clear for pssword done");*/


















/*browser navigation methods**************************	
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Images")).click();
		Thread.sleep(1000);
		
	driver.navigate().back();
	
		System.out.println("backward is done");
	
		driver.navigate().forward();
		
		System.out.println("forward is done");
		
		driver.navigate().refresh();
		System.out.println("refresh is done");
		
		*****************************************************/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*String variable=driver.getTitle();
		
		driver.findElement(By.id("login_Layer")).click();
		
		
		
		
		WebElement unm=driver.findElement(By.id("eLoginNew"));
		System.out.println(unm.getAttribute("id"));
		System.out.println(unm.getTagName());*/
		
		
		//System.out.println(variable);
		
		//System.out.println(driver.getCurrentUrl());
		
		
		//driver.close();
		
	//driver.quit();

	}

}
