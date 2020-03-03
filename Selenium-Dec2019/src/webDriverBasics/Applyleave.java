package webDriverBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Applyleave {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.gecko.driver","c:\\selenium\\Drivers\\geckodriver.exe");

        WebDriver driver=new FirefoxDriver();
        
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        
        driver.get("http://testingmasters.com/hrm/");
        
       String pagetxt= driver.findElement(By.xpath("//div[@id='logInPanelHeading']")).getText();
       System.out.println("pageText:"+" "+pagetxt);
	   String exptxt=pagetxt;
       if(pagetxt==exptxt)
    	   System.out.println("login page is verified");
       else
    	   System.out.println("login page is not verified");
       
       driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("user02");
       driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("TM1234");
       driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
       
       String pagetxt1= driver.findElement(By.xpath("//a[@id='menu_leave_viewLeaveModule']")).getText();
       System.out.println("pageText:"+" "+pagetxt1);
	   String exptxt1=pagetxt1;
       if(pagetxt1==exptxt1)
    	   System.out.println("Home page is verified");
       else
    	   System.out.println("home page is not verified");
       
       Actions act=new Actions(driver);
       WebElement leave=driver.findElement(By.xpath("//a[@id='menu_leave_viewLeaveModule']"));
       act.moveToElement(leave).build().perform();
       driver.findElement(By.xpath("//a[text()='Apply']")).click();
      
       String pagetxt2 =driver.findElement(By.xpath("//h1[text()='Apply Leave']")).getText();
       System.out.println("pageText:"+" "+pagetxt2);
	   String exptxt2=pagetxt2;
       if(pagetxt2==exptxt2)
    	   System.out.println("Apply page is verified");
       else
    	   System.out.println("Apply page is not verified");
       
        driver.findElement(By.xpath("//select[@name='applyleave[txtLeaveType]']/option[3][text()='Personal Leave']")).click();
       

       driver.findElement(By.xpath("//form[@id='frmLeaveApply']/fieldset/ol/li[3]/img")).click();
       driver.findElement(By.xpath("//select[@class='ui-datepicker-month']/option[12]")).click();
       driver.findElement(By.xpath("//select[@class='ui-datepicker-year']/option[text()='2019']")).click();
       driver.findElement(By.xpath("//a[text()='31']")).click();

       driver.findElement(By.xpath("//form[@id='frmLeaveApply']/fieldset/ol/li[4]/img")).click();
       driver.findElement(By.xpath("//select[@class='ui-datepicker-month']/option[12]")).click();
       driver.findElement(By.xpath("//select[@class='ui-datepicker-year']/option[text()='2019']")).click();
       driver.findElement(By.xpath("//a[text()='31']")).click();
       
       
       
      /* String date="2019-12-24";
       WebElement frmdat= driver.findElement(By.xpath("//input[@id='applyleave_txtFromDate']"));
       frmdat.clear();
       frmdat.sendKeys(date);
       frmdat.sendKeys(Keys.ESCAPE);

       
       WebElement todat= driver.findElement(By.xpath("//input[@id='applyleave_txtToDate']"));
       todat.clear();
       todat.sendKeys(date);
      frmdat.sendKeys(Keys.ESCAPE);*/

       
       driver.findElement(By.xpath("//textarea[@id='applyleave_txtComment']")).sendKeys("Approve the leave");
       driver.findElement(By.xpath("//input[@id='applyBtn']")).click();
       Thread.sleep(5000);
       
 
      // driver.quit();
    	   
    	   
       
	}

}
