import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.NoSuchElementException;
public class Waitsexample {

	public static void main(String[] args) {
		ChromeOptions coptions = new ChromeOptions();
		coptions.addArguments("--disable-notifications");
	
System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver2\\chromedriver.exe"); 
WebDriver driver=new ChromeDriver(coptions);

//driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
driver.get("https://www.monsterindia.com/");
driver.manage().window().maximize();
driver.findElement(By.linkText("LOGIN")).click();
WebDriverWait wait= new WebDriverWait(driver,20);
WebElement element=wait.until(ExpectedConditions.elementToBeClickable(By.id("signinName")));

//driver.findElement(By.id("signinName")).click();

	}

}
