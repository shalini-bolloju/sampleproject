package advancexpath;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2 {

	public static void main(String[] args) {
	
		   System.setProperty("webdriver.chrome.driver","c:\\selenium\\Drivers\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
	       driver.get("http://testingmasters.weebly.com/webtables.html");
	       driver.manage().window().maximize();
		
		//Print the employee ID's of the candidates whose designation is Analyst.
	       
			List<WebElement> analyst = driver.findElements(By.xpath("//table/thead/tr/th[text()='Designation']/parent::tr/parent::thead/following::tbody/tr/td[text()='Analyst']"));
			int a= analyst.size();
			System.out.println(a);
			for(int i=0;i<=a-1;i++)
			{
				String s = analyst.get(i).getText();
				
				if(s.contentEquals("Analyst"))
				{
					List<WebElement> id = driver.findElements(By.xpath("//table/thead/tr/th[text()='Designation']/ancestor::table/tbody/tr/td[text()='Analyst']/preceding-sibling::td[3]"));
					String str =id.get(i).getText();
					System.out.println(str);
					
				}
				else
				{
					System.out.println("Not printed");
				}
				
			}

	}

}

