package webDriverBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Nopcommerceregistration{

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\Drivers\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
       
        driver.get("https://demo.nopcommerce.com/register");
        
          driver.findElement(By.id("gender-male")).click();
          driver.findElement(By.id("FirstName")).sendKeys("Testing");
        //  driver.findElement(By.id("LastName")).sendKeys("Masters");
          WebElement lastname = driver.findElement(By.id("LastName"));
          lastname.sendKeys("Masters");
          
          Select sel_day = new Select(driver.findElement(By.name("DateOfBirthDay")));
          sel_day.selectByVisibleText("15");

          Select sel_month = new Select(driver.findElement(By.name("DateOfBirthMonth")));
          sel_month.selectByVisibleText("June");
         
          Select sel_year= new Select(driver.findElement(By.name("DateOfBirthYear")));
          sel_year.selectByVisibleText("2005");
         
          driver.findElement(By.id("Email")).sendKeys("TM.1234@gmail.com");
          driver.findElement(By.id("Company")).sendKeys("TestingMasters");
          driver.findElement(By.id("Password")).sendKeys("TM1234");
          driver.findElement(By.id("ConfirmPassword")).sendKeys("TM1234");
          driver.findElement(By.id("register-button")).click();
	}

}