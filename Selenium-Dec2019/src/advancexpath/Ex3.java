package advancexpath;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ex3 {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","c:\\selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	       driver.get("http://testingmasters.weebly.com/webtables.html");
	       driver.manage().window().maximize();
	       
	     //Click on the checkboxes of the records whose username is Vinod and Designation is analyst.
	       
			List<WebElement> vinod = driver.findElements(By.xpath("//table/thead/tr/th[text()='Designation']/parent::tr/parent::thead/following::tbody/tr/td[text()='Analyst']/preceding::td[2][text()='Vinod']"));
			int a= vinod.size();
			System.out.println(a);
			for(int i=0;i<=a-1;i++)
			{
				String s = vinod.get(i).getText();
				System.out.println(s+""+i);
				
				if(s.contentEquals("Vinod"))
				{
					List<WebElement> id = driver.findElements(By.xpath("//table/thead/tr/th[text()='Designation']/parent::tr/parent::thead/following::tbody/tr/td[text()='Analyst']/preceding::td[2][text()='Vinod']/preceding::td[2]/input"));
					id.get(i).click();
					
				}
				
			}
			
			
		}
}
