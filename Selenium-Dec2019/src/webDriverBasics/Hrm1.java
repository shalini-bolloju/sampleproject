package webDriverBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hrm1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","c:\\selenium\\Drivers\\geckodriver.exe");
       WebDriver driver=new FirefoxDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
       driver.get("https://testingmasters.com/hrm/");
       
       driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("user02");
	 //driver.findElement(By.xpath("txtPassword")).sendKeys("TM1234");
       WebElement uid= driver.findElement(By.xpath("//input[@id='txtPassword']"));
       uid.sendKeys("TM1234");
       driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
	}

}
