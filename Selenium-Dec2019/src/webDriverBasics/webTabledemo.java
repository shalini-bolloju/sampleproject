package webDriverBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class webTabledemo {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","c:\\selenium\\Drivers\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://testingmasters.com/hrm/");
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("user02");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("TM1234");
		
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		Actions act=new Actions(driver);
		WebElement leave=driver.findElement(By.xpath("//a[@id='menu_leave_viewLeaveModule']"));
	    act.moveToElement(leave).build().perform();

		driver.findElement(By.xpath("//a[@id='menu_leave_viewMyLeaveList']")).click();
		
        int colcount= driver.findElements(By.xpath("//table[@id='resultTable']/thead/tr/th")).size();
        System.out.println(colcount);
        
        String celltext= driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[1]/td[3]")).getText();
        System.out.println("cell text is:"+ celltext);
        
        Thread.sleep(3000);
        driver.quit();
	}

}
