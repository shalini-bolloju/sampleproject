package projectprgms;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class header {

	public static void main(String[] args) throws InterruptedException{
	
		System.setProperty("webdriver.gecko.driver","c:\\selenium\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("http://testingmasters.com/hrm/");
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("user02");
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("TM1234");
        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
        
      
        WebElement leave=driver.findElement(By.xpath("//a[@id='menu_leave_viewLeaveModule']"));
        leave.click();
       // driver.findElement(By.xpath("//a[@id='menu_leave_Reports']")).click();
        Actions act=new Actions(driver);
        WebElement reports=driver.findElement(By.xpath("//a[@id='menu_leave_Reports']"));
        act.moveToElement(reports).build().perform();
        reports.click();
        driver.findElement(By.xpath("//a[@id='menu_leave_viewMyLeaveBalanceReport']")).click();
        
        List<WebElement> htext=driver.findElements(By.xpath("//table/thead/tr[2]/th"));
        int a=htext.size();
        System.out.println(a);
       
        boolean b=false;
        for(int i=0;i<=a-1;i++)
        {
        	String s = htext.get(i).getText();
        	Thread.sleep(1000);
            System.out.println(s);
                   if((s.contains("Leave Type"))&&(s.contains("Leave Entitlements (Days)"))&&(s.contains("Leave Pending Approval (Days)"))&&(s.contains("Leave Scheduled (Days)"))&&(s.contains("Leave Taken (Days)"))&&(s.contains("Leave Balance (Days)")));
                   b=true;
                  
        }
                     if(b)
                     {
                         System.out.println("Header is verified");
                     }
                      else
                      {
                	   System.out.println("Header is not verified");
                      }
        
	}

}
