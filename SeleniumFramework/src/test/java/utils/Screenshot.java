package utils;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Screenshot {
	public static void main(String[] args) throws Exception {
		
	
		
		ChromeOptions coptions = new ChromeOptions();
		coptions.addArguments("--disable-notifications");
	
	
	System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver4\\chromedriver.exe"); 
	WebDriver driver=new ChromeDriver(coptions);
	driver.get("https://www.monsterindia.com");
	driver.manage().window().maximize();
	TakesScreenshot ts = (TakesScreenshot)driver;
	File source=ts.getScreenshotAs(OutputType.FILE);
	
		FileUtils.copyFile(source, new File("D:\\screenshot.png"));
   
    		 
        }
 
    }




