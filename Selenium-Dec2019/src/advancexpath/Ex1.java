package advancexpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1 {



	public static void main(String[] args) throws InterruptedException {
		
	   System.setProperty("webdriver.chrome.driver","c:\\selenium\\Drivers\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
       driver.get("http://testingmasters.weebly.com/webtables.html");
       driver.manage().window().maximize();
       
       String name = driver.findElement(By.xpath("//table/tbody/tr/td[2][text()='S148109']/following::td[1]")).getText();
       System.out.println(name);
       
       
     //Click on the checkboxes of the records whose Designation is Analyst.
       
       List<WebElement> analyst = driver.findElements(By.xpath("//table/thead/tr/th[text()='Designation']/parent::tr/parent::thead/following::tbody/tr/td[text()='Analyst']"));
      // List<WebElement> analyst = driver.findElements(By.xpath("//table/tbody/tr/td[text()='Analyst']"));
      int a= analyst.size();
      System.out.println(a);
      for(int i=0;i<=a-1;i++)
     {
     	String s = analyst.get(i).getText();
     	Thread.sleep(1000);
     	System.out.println(s);
     			
     	if(s.contains("Analyst"))
     	{
     			
     	 //List<WebElement> c = driver.findElements(By.xpath("//table/thead/tr/th[text()='Designation']/parent::tr/parent::thead/following::tbody/tr/td[text()='Analyst']/preceding::td[4]/input"));
     	//List<WebElement> c = driver.findElements(By.xpath("//table/tbody/tr/td[5][text()='Analyst']/preceding::td[4]/input"));
     	List<WebElement> c = driver.findElements(By.xpath("//table/tbody/tr/td[5][text()='Analyst']/following::td[3]/select/option[text()='Rejected']"));
     	Thread.sleep(1000);
     	c.get(i).click();
     			
     	}
     			
     }
 
		
		
	}

}



