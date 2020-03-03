package TestNgPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderDemo{
public WebDriver driver;
	
        @DataProvider 
        public Object[][] loginData(){
        Object[][] data=new Object[2][2];
        
        data[0][0]="user01";
        data[0][1]="asdf";
        
        
        data[1][0]="user02";
        data[1][1]="TM1234";
        
        return data;
        }
        
        @Test(dataProvider="loginData")
	    public void TC_login(String uid,String pwd){
		System.setProperty("webdriver.gecko.driver","c:\\selenium\\Drivers\\geckodriver.exe");
        driver=new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.get("http://testingmasters.com/hrm/");
	
        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(uid);
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(pwd);
        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
       
	
        }
}