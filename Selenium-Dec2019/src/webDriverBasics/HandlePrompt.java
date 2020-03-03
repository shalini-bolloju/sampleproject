package webDriverBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlePrompt {

	public static void main(String[] args) throws InterruptedException{

		System.setProperty("webdriver.gecko.driver","c:\\selenium\\Drivers\\geckodriver.exe");
	       WebDriver driver=new FirefoxDriver();	

	    driver.get("file:///C:/Users/shalb/Desktop/confirm.html");
	    
	    driver.findElement(By.xpath("//html/body/fieldset/button")).click();
	    Alert AlertWindow=driver.switchTo().alert();
	    System.out.println(AlertWindow.getText());
	    Thread.sleep(3000);
	
	    AlertWindow.accept();
	    
	   // AlertWindow.dismiss();
	
	     driver.quit();
	}
}