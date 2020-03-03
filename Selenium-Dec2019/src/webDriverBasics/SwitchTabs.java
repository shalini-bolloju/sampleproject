package webDriverBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTabs {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","c:\\selenium\\Drivers\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   
	    driver.get("https://www.google.com");
	    
	    Thread.sleep(3000);

	  //Open a new tab using Ctrl + t
	    driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
	    driver.get("https://www.yahoo.com");
	    Thread.sleep(3000);
	    
	    //Switch between tabs using Ctrl + \t
	    driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "\t");
	    Thread.sleep(3000);

	}

}
