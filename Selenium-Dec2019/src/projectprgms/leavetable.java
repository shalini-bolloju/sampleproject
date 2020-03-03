package projectprgms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class leavetable {

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
        

        String todate="2020-12-31";
        WebElement todat= driver.findElement(By.xpath("//input[@id='calToDate']"));
        todat.clear();
        todat.sendKeys(todate);
        todat.sendKeys(Keys.ESCAPE);
	
        WebElement allcheckbox =driver.findElement(By.xpath("//input[@id='leaveList_chkSearchFilter_checkboxgroup_allcheck']"));
	    boolean f=allcheckbox.isSelected();
	     if(f=true)
	    	   System.out.println("check box is selected");
	      else
	    	   System.out.println("checkbox is not selected");
	     int rowcount5=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr")).size();
		 System.out.println(rowcount5);
		 String row6=driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr")).getText();
		 if(row6.contains("No Records Found"))
	     {
	    	 System.out.println("Records not found");
	    
	     }	        
	        else
	        {	 
		 boolean c=true;
		 for(int i=1; i<=rowcount5;i++)
		    {
	     String status= driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+i+"]/td[6]")).getText();
         if(!(status.contains("Cancelled"))&&!(status.contains("Rejected"))&&!(status.contains("Pending Approval"))&&!(status.contains("Scheduled"))&&!(status.contains("Taken")))
            c=false;
         break;
		    }
         if(c)
  	       System.out.println("status  is verified");
  	     else
  	       System.out.println("status is not verified");
		Thread.sleep(2000);
		allcheckbox.click();
	        }
          
		 //To check the status of Cancelled			
	     driver.findElement(By.xpath("//input[@id='leaveList_chkSearchFilter_0']")).click();
		 driver.findElement(By.xpath("//input[@id='btnSearch']")).click();
         int rowcount=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr")).size();
		 System.out.println(rowcount);
		 boolean a=true;
		 for(int i=1; i<=rowcount;i++)
		    {
	     String status= driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+i+"]/td[6]")).getText();
         if(!(status.contains("Cancelled")))
        	 a=false;
         break;
		    }
         if(a)
  	       System.out.println("status  is verified");
  	     else
  	       System.out.println("status is not verified");
         Thread.sleep(2000);
         
         //To check the status of rejected
         
         driver.findElement(By.xpath("//input[@id='leaveList_chkSearchFilter_0']")).click();
         driver.findElement(By.xpath("//label[text()='Rejected']/following-sibling::input")).click();
		 driver.findElement(By.xpath("//input[@id='btnSearch']")).click();
         int rowcount1=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr")).size();
	     System.out.println(rowcount1);
	     String row=driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr")).getText();
	     System.out.println(row);
	     if(row.contains("No Records Found"))
	     {
	    	 System.out.println("Records not found");
	    
	     }	        
	        else
	        {	 
			 boolean c=true;
			 for(int i=1; i<=rowcount1;i++)
			    {
		     String status= driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+i+"]/td[6]")).getText();
	         if(!(status.contains("Rejected")))
	        	 c=false;
	         break;
			    }
	         if(c)
	  	       System.out.println("status  is verified");
	  	     else
	  	       System.out.println("status is not verified");
	         Thread.sleep(2000);
	        }  
	      
	     //To check the status of pending approval
	     
	     driver.findElement(By.xpath("//label[text()='Rejected']/following-sibling::input")).click();
	     driver.findElement(By.xpath("//label[text()='Pending Approval']/following-sibling::input")).click();
		 driver.findElement(By.xpath("//input[@id='btnSearch']")).click();
		 driver.findElement(By.xpath("//input[@id='btnSearch']")).click();
		 int rowcount2=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr")).size();
		 System.out.println(rowcount2);
	     String row1=driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr")).getText();
	     if(row1.contains("No Records Found"))
	     {
	    	 System.out.println("Records not found");
	    
	     }	        
	        else
	        {	 
			 boolean c=true;
			 for(int i=1; i<=rowcount2;i++)
			    {
		     String status= driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+i+"]/td[6]")).getText();
	         if(!(status.contains("Pending Approval")))
	        	 c=false;
	         break;
			    }
	         if(c)
	  	       System.out.println("status  is verified");
	  	     else
	  	       System.out.println("status is not verified");
	         Thread.sleep(2000);
	        }  
         
	      //To check the status  of Scheduled
	     driver.findElement(By.xpath("//label[text()='Pending Approval']/following-sibling::input")).click();
	     driver.findElement(By.xpath("//label[text()='Scheduled']/following-sibling::input")).click();
		 driver.findElement(By.xpath("//input[@id='btnSearch']")).click();
		 int rowcount3=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr")).size();
	     System.out.println(rowcount3);
	     String row2=driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr")).getText();
	     System.out.println(row2);
	     if(row2.contains("No Records Found"))
	     {
	    	 System.out.println("Records not found");
	    
	     }	        
	        else
	        {	 
			 boolean c=true;
			 for(int i=1; i<=rowcount3;i++)
			    {
		     String status= driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+i+"]/td[6]")).getText();
	         if(!(status.contains("Scheduled")))
	        	 c=false;
	         break;
			    }
	         if(c)
	  	       System.out.println("status  is verified");
	  	     else
	  	       System.out.println("status is not verified");
	         Thread.sleep(2000);
	        }  
          
	     //To check the status of Taken
	     driver.findElement(By.xpath("//label[text()='Scheduled']/following-sibling::input")).click();
	     driver.findElement(By.xpath("//label[text()='Taken']/following-sibling::input")).click();
		 driver.findElement(By.xpath("//input[@id='btnSearch']")).click();
		 int rowcount4=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr")).size();
	     System.out.println(rowcount4);
	     String row3=driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr")).getText();
	     if(row3.contains("No Records Found"))
	     {
	    	 System.out.println("Records not found");
	    
	     }	        
	        else
	        {	 
			 boolean c=true;
			 for(int i=1; i<=rowcount4;i++)
			    {
		     String status= driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+i+"]/td[6]")).getText();
	         if(!(status.contains("Taken")))
	        	 c=false;
	         break;
			    }
	         if(c)
	  	       System.out.println("status  is verified");
	  	     else
	  	       System.out.println("status is not verified");
	         Thread.sleep(2000);
	        }  
	}


}
