package TestNgPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersDemo {
	public WebDriver driver;
	
	@Test
	@Parameters({"URL","UID","PWD"})
	public void TC_login(String url,String uid,String pwd){
		System.setProperty("webdriver.gecko.driver","c:\\selenium\\Drivers\\geckodriver.exe");
        driver=new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.get(url);
	
        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(uid);
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(pwd);
        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
       
	}

	@Test
	public void TC_ApplyLeave(){
		System.out.println("Apply Leave test case is tested");
		}
	@Test
	public void TC_CancelLeave(){
		System.out.println("Cancel Leave test case is executed");
		}
}
