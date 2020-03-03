package webDriverBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpennewWindow {

	public static void main(String[] args) throws InterruptedException {
    
		System.setProperty("webdriver.chrome.driver", "c:\\selenium\\Drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	    driver.get("https://www.google.com");
	    WebElement link_Gmail=driver.findElement(By.partialLinkText("Gmail"));
	
	    Actions Act=new Actions(driver);
	    Thread.sleep(3000);
	    
	    //open Gmail page in new tab
	    Act.contextClick(link_Gmail).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	
	    //open Gmail page in new window
	    Act.contextClick(link_Gmail).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	}

}
