package webDriverBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Myinfo {
         
	    public static WebDriver driver;
	    
		public static void launchApp(){
		System.setProperty("webdriver.gecko.driver","c:\\selenium\\Drivers\\geckodriver.exe");

		    driver=new FirefoxDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	        
	        driver.get("http://testingmasters.com/hrm/");
		}
	        public static void login(){

	        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("user02");
	        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("TM1234");
	        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	        }
	        public static void  AddDependent(){
	        	
	        driver.findElement(By.xpath("//a[@id='menu_pim_viewMyDetails']/b")).click();
	        driver.findElement(By.xpath("//ul[@id='sidenav']/li[4]/a")).click();
	        driver.findElement(By.xpath("//input[@ id='btnAddDependent']")).click();

	        driver.findElement(By.xpath("//input[@id='dependent_name']")).sendKeys("santhosh");
			driver.findElement(By.xpath("//select[@id='dependent_relationshipType']/option[2]")).click();

			 String date="2015-01-29";
		     WebElement dob= driver.findElement(By.xpath("//input[@id='dependent_dateOfBirth']"));
		     dob.clear();
		     dob.sendKeys(date);
		     dob.sendKeys(Keys.ESCAPE);

		    driver.findElement(By.xpath("//input[@id='btnSaveDependent']")).click();
		    
		 
		    int rowcount=driver.findElements(By.xpath("//table[@id='dependent_list']/tbody/tr")).size();
		    System.out.println(rowcount);
		    boolean b=false;
		    for(int i=1; i<=rowcount;i++)
		    {
		    	    String childname=driver.findElement(By.xpath("//table[@id='dependent_list']/tbody/tr["+i+"]/td[2]")).getText();
		    	    String childdob=driver.findElement(By.xpath("//table[@id='dependent_list']/tbody/tr["+i+"]/td[4]")).getText();
		    	    if((childname.contains("santhosh"))&&(childdob.contains("2015-01-29")))
				    b=true;
		    	    
		     }
		  	if(b)
		       System.out.println("dependent is added");
		     else
		       System.out.println("dependent is not added");
		    
	        }
	        
	        public static void deleteDependent(){
		       
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
	        }
	        
	         public static void main(String[] args) {
             
	        	 launchApp(); 
	        	 
	        	 login();
	        	 
	        	 AddDependent();
	        	 
	        	 deleteDependent();
	        	 
	}
	

}
