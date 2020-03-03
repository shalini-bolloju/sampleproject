package webDriverBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Myleave {

		public static void main(String[] args) throws InterruptedException{
			System.setProperty("webdriver.gecko.driver","c:\\selenium\\Drivers\\geckodriver.exe");

	        WebDriver driver=new FirefoxDriver();
	        
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	        
	        driver.get("http://testingmasters.com/hrm/");
	        
	        
	        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("user02");
	        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("TM1234");
	        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	        
	        Actions act=new Actions(driver);
	        WebElement leave=driver.findElement(By.xpath("//a[@id='menu_leave_viewLeaveModule']"));
	        act.moveToElement(leave).build().perform();
	        driver.findElement(By.xpath("//a[@id='menu_leave_viewMyLeaveList']")).click();
	        
	        String fromdate="2019-10-01";
	        WebElement frmdat = driver.findElement(By.xpath("//input[@id='calFromDate']"));
	        frmdat.clear();
	        frmdat.sendKeys(fromdate);
	        frmdat.sendKeys(Keys.ESCAPE);
	        

	        String todate="2019-12-31";
            WebElement todat= driver.findElement(By.xpath("//input[@id='calToDate']"));
	        todat.clear();
	        todat.sendKeys(todate);
	        todat.sendKeys(Keys.ESCAPE);
	        
	       WebElement allcheckbox =driver.findElement(By.xpath("//input[@id='leaveList_chkSearchFilter_checkboxgroup_allcheck']"));
	       boolean b=allcheckbox.isSelected();
	       if(b)
	    	   System.out.println("check boxes is selected");
	       else
	    	   System.out.println("checkboxes is not selected");
		   Thread.sleep(2000);
		   allcheckbox.click();
		    
		   Thread.sleep(2000);
	        
	       driver.findElement(By.xpath("//input[@id='leaveList_chkSearchFilter_checkboxgroup_allcheck']")).click();

	        driver.findElement(By.xpath("//input[@id='btnSearch']")).click();

		}
		
}
