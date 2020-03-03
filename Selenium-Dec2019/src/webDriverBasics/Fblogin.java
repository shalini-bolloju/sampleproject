package webDriverBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fblogin {

	public static void main(String[] args)  throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","c:\\selenium\\Drivers\\chromedriver.exe");
	       ChromeDriver driver=new ChromeDriver();
	       driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	       driver.get("https://www.facebook.com/");
	       
	       Select sel_day = new Select(driver.findElement(By.id("day")));
	        sel_day.selectByVisibleText("18");
	       
	       
	       Select sel_month = new Select(driver.findElement(By.id("month")));
	        sel_month.selectByVisibleText("Aug");
	       // sel_month1.selectByValue("9");
	       // sel_month1.selectByIndex(4);
	        
	       
	        Select sel_year = new Select(driver.findElement(By.id("year")));
	        sel_year.selectByVisibleText("2000");
	       
	     // driver.findElement(By.linkText("Create a page")).click();
	        driver.findElement(By.partialLinkText("Create a")).click();
	        Thread.sleep(5000);
	        driver.navigate().back();
	       
	       
	}
	

}
