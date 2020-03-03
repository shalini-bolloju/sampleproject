package webDriverBasics;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class HRMLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\Drivers\\chromedriver.exe");
        ChromeDriver driver =new ChromeDriver();
        
		driver.get("https://testingmasters.com/hrm/");
		
		driver.findElement(By.id("txtUsername")).sendKeys("user02");
		driver.findElement(By.id("txtPassword")).sendKeys("TM1234");
		driver.findElement(By.id("btnLogin")).click();
	}

}
