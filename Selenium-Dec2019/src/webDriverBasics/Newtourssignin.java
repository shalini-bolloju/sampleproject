package webDriverBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Newtourssignin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\Drivers\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        
        driver.get("http://www.newtours.demoaut.com");
        
        driver.findElement(By.name("userName")).sendKeys("mercury");
        driver.findElement(By.name("password")).sendKeys("mercury");
        driver.findElement(By.name("login")).click();
        
        driver.findElement(By.name("tripType")).click();
        
        Select passengers = new Select(driver.findElement(By.name("passCount")));
        passengers.selectByVisibleText("2");
        Select departure = new Select(driver.findElement(By.name("fromPort")));
        departure.selectByVisibleText("Paris");
        Select sel_month = new Select(driver.findElement(By.name("fromMonth")));
        sel_month.selectByVisibleText("August");
        Select sel_day = new Select(driver.findElement(By.name("fromDay")));
        sel_day.selectByVisibleText("15");
        
        Select arriving = new Select(driver.findElement(By.name("toPort")));
        arriving.selectByVisibleText("New York");
        Select sel_month1 = new Select(driver.findElement(By.name("toMonth")));
        sel_month1.selectByVisibleText("August");
        Select sel_day1 = new Select(driver.findElement(By.name("toDay")));
        sel_day1.selectByVisibleText("18");
       
        driver.findElement(By.name("servClass")).click();
        
        Select airlines = new Select(driver.findElement(By.name("airline")));
        airlines.selectByVisibleText("Unified Airlines");
        
        driver.findElement(By.name("findFlights")).click();
        
            
	}

}