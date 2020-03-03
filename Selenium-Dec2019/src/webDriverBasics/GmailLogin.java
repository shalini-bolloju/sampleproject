package webDriverBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLogin {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","c:\\selenium\\Drivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://mail.google.com/");
		
		 driver.findElement(By.id("identifierId")).sendKeys("moksha16@gmail.com");
		 driver.findElement(By.id("identifierNext")).click();
		 
	}

}
