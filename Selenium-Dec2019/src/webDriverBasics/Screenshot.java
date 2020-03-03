package webDriverBasics;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Screenshot{

	

public static void main(String[] args) throws Exception {
		

	       System.setProperty("webdriver.gecko.driver","c:\\selenium\\Drivers\\geckodriver.exe");		
	       WebDriver driver=new FirefoxDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		   
		    driver.get("https://www.google.com");
            
		    TakesScreenshot ts=((TakesScreenshot) driver);
            File scrFile=ts.getScreenshotAs(OutputType.FILE);
	        File trgFile = new File("C:\\selenium\\Screenshot2.png");
	        FileUtils.copyFile(scrFile, trgFile);
		
	
	}

}
