package webDriverBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollingPage {

	public static void main(String[] args) {
		
       System.setProperty("webdriver.gecko.driver","c:\\selenium\\Drivers\\geckodriver.exe");		
       WebDriver driver=new FirefoxDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   
	   driver.get("https://selenium.dev");
	
	   JavascriptExecutor js= (JavascriptExecutor) driver;
	   js.executeScript("window.scrollBy(0,4000)");
	}

}
