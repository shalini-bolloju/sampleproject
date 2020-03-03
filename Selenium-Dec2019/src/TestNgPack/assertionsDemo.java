package TestNgPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class assertionsDemo {

	public WebDriver driver;
	
	//TC01 launchApp
	@Test
	public void TC01_launchApp(){
		System.setProperty("webdriver.gecko.driver","c:\\selenium\\Drivers\\geckodriver.exe");
        driver=new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.get("http://testingmasters.com/hrm/");
        
        System.out.println("TC01 is executed");
	}
	 
	//TC02 login
     @Test
     public void TC02_login(){
	    driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("user02");
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("TM1234");
        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
       
        //Soft Assert
        String Acttitle= driver.findElement(By.xpath("//a[@id='menu_leave_viewLeaveModule']/b")).getText();
        String Exptitle="Leave";
        SoftAssert sassert=new SoftAssert();
        sassert.assertEquals(Acttitle, Exptitle,"Orange HRM is not displayed");
        
        
    	//hard assert
       /* String Acttitle= driver.findElement(By.xpath("//a[@id='menu_leave_viewLeaveModule']/b")).getText();
        String Exptitle="Leave";
        Assert.assertEquals(Acttitle,Exptitle );*/
        
        
        System.out.println("TC02 is executed");
        sassert.assertAll();
	}
	
}
