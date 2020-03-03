package advancexpath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ex6 {

	public static void main(String[] args)throws InterruptedException{
		
	System.setProperty("webdriver.gecko.driver", "c:\\selenium\\Drivers\\geckodriver.exe");
	 FirefoxDriver driver=new FirefoxDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.get("http://testingmasters.weebly.com/webtables.html");
	List<WebElement> five=driver.findElements(By.xpath("//table/tbody/tr/td[7][text()<='5']/preceding-sibling::td[3]"));
	int a=five.size();
	System.out.println(a);
	for(int i=0;i<=a-1;i++)
	{
		String s=five.get(i).getText();
		System.out.println(s+"   "+"printed");
	}
	

	}

}
