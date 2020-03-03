package TestNgPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderEx {

	 WebDriver driver=null;
	
        @BeforeClass
	    public void LaunchApp(){
		System.setProperty("webdriver.gecko.driver","c:\\selenium\\Drivers\\geckodriver.exe");
        driver=new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.get("https://www.google.com/");
        }
		
		@Test(dataProvider="readdata")
		public void TC_GoogleSearch(String user,String searchKey) throws InterruptedException{
			
			WebElement searchText=driver.findElement(By.xpath("//input[@name='q']"));
			searchText.sendKeys(searchKey);	
			Thread.sleep(3000);
			String testValue=searchText.getAttribute("value");
			
			searchText.clear();
			
			Assert.assertTrue(testValue.contentEquals(searchKey), "mismatch");
		}
		@DataProvider(name="readdata")
		   public Object[][] getDataFromdataProvider(){
			   return new Object[][]{
					             
				   {"tmasters1","India"},
				   {"tmasters2","USA"},
				   {"tmasters3","UK"}};
				   
				   
		   }
	   
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

