package webDriverBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstprogram {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\Drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.dev/");
		
		String sTitle = driver.getTitle();
		System.out.println(sTitle);
		
		String sURL = driver.getCurrentUrl();
		System.out.println(sURL);
	}

}
