package advancexpath;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ex4 {
	
	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","c:\\selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	       driver.get("http://testingmasters.weebly.com/webtables.html");
	       driver.manage().window().maximize();
	       
	        //Click on checkboxes whose email id starts with 'demo'.
	       
			List<WebElement> analyst = driver.findElements(By.xpath("//table/tbody/tr/td[4][starts-with(text(),'demo')]"));
			
			//   For Analyst = //table/thead/tr/th[text()='Designation']/parent::tr/parent::thead/following::tbody/tr/td[text()='Analyst']/preceding-sibling::td[1][starts-with(text(),'demo')]
			int a= analyst.size();
			for(int i=0;i<=a-1;i++)
			{
				Thread.sleep(1000);
				String s = analyst.get(i).getText();
				System.out.println(s);
				Thread.sleep(1000);
				List<WebElement> id = driver.findElements(By.xpath("//table/tbody/tr/td[4][starts-with(text(),'demo')]/preceding-sibling::td[3]/input"));
				Thread.sleep(2000);
				id.get(i).click();
				
			
			}
	}

}
