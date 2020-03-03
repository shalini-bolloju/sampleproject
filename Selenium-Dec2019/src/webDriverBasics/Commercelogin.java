package webDriverBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Commercelogin {

  static String email="shal.bolloju@gmail.com";
  static String  pwd="123456";

	public static void main(String[] args)throws InterruptedException {
	
		System.setProperty("webdriver.gecko.driver","C:\\selenium\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://demo.nopcommerce.com/login");
		
	
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		
		driver.findElement(By.name("Log in")).click();
	}

}
