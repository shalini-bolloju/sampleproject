package advancexpath;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ex5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c:\\selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("http://testingmasters.weebly.com/webtables.html");
	    driver.manage().window().maximize();
	    
		//Click on checkboxes of first five records or Click on checkboxes of last 4 records.
	    
		List<WebElement> analyst = driver.findElements(By.xpath("//table/tbody/tr/td[2][contains(text(),'08')]/following::tr"));
		int a= analyst.size();
		System.out.println(a);
		for(int i=0;i<=a-1;i++)
		{
			
		List<WebElement> id = driver.findElements(By.xpath("//table/tbody/tr/td[2][contains(text(),'08')]/following::tr/td[2]/preceding-sibling::td[1]/input"));
		id.get(i).click();
			
		}
	

	}

}
