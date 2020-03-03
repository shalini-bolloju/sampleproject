package webDriverBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Myinfo1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","c:\\selenium\\Drivers\\geckodriver.exe");

		 WebDriver driver=new FirefoxDriver();
	        
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	        
	        
	        driver.get("http://testingmasters.com/hrm/");
	        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("user02");
	        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("TM1234");
	        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	        
	        driver.navigate().to("https://testingmasters.com/hrm/symfony/web/index.php/pim/viewMyDetails");
	        
	        driver.navigate().to("https://testingmasters.com/hrm/symfony/web/index.php/pim/viewDependents/empNumber/5");
	        
	        
	        int rowCount=driver.findElements(By.xpath("//table[@id='dependent_list']/tbody/tr")).size();
	        boolean btag=false;
	        for(int i=1;i<=rowCount;i++)
	        {
	        String childname1=driver.findElement(By.xpath("//table[@id='dependent_list']/tbody/tr["+i+"]/td[2]")).getText();
		    String childdob1=driver.findElement(By.xpath("//table[@id='dependent_list']/tbody/tr["+i+"]/td[4]")).getText();
			if((childname1.equals("santhosh"))&&(childdob1.contains("2015-01-29")))
			{
                driver.findElement(By.xpath("//table[@id='dependent_list']/tbody/tr["+i+"]/td[1]")).click();
                driver.findElement(By.xpath("//input[@ id='delDependentBtn']")).click();
                btag=true;
                break;
	        } 
	        }
	         if(btag)
            System.out.println("dependent is found and deleted");
	        else
            	System.out.println("dependent is not found");
	         
	         driver.quit();
		    
	}     

	}


