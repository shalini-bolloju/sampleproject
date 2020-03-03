package webDriverBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class CommerceRegister {

	public static void main(String[] args)throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","C:\\selenium\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://demo.nopcommerce.com/register");

		WebElement gender_female=driver.findElement(By.xpath("//input[@id='gender-female']"));
		gender_female.click();
		boolean b=gender_female.isSelected();
		if(b)
			System.out.println("gender-female radio button is selected");
		else
			System.out.println("gender-female radio button is  not selected");

		
		// driver.findElement(By.xpath("//input[@id='gender-female']")).isSelected();

		
		driver.findElement(By.xpath("//input [ @id='FirstName' and @name='FirstName' ]")).sendKeys("Anika");
		driver.findElement(By.xpath("// input[@name='LastName' or @id='LastName']")).sendKeys("Bolloju");
		
		Select sel_day=new Select(driver.findElement(By.xpath("//select[@name='DateOfBirthDay']")));
		sel_day.selectByValue("5");
		
		//driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']/option[text='June']")).click();
		
		driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']/option[7]")).click();


		/*Select sel_year=new Select(driver.findElement(By.xpath("//select[@name='DateOfBirthYear']")));
		sel_year.selectByValue("2005");
		
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("Ammu29@gmail.com");
		
		driver.findElement(By.xpath("//input[@name='Company']")).sendKeys("asdf");
		
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("123456");
		
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("123456");
		
		
		driver.findElement(By.xpath("//input[@id='register-button']")).click();
		
		//String URL="https://demo.nopcommerce.com/login";
		//driver.get(URL);
		
		driver.navigate().to("https://demo.nopcommerce.com/login");
		
         String email="Ammu29@gmail.com";
		 String  pwd="123456";
		
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(pwd);
		
		driver.findElement(By.xpath("//input[@value='Log in']")).click();*/
		
	String expstr=driver.findElement(By.xpath("//h1[text()='Register']")).getText();
	System.out.println("displayed:"+" "+expstr);
   
	String actstr=expstr;
    if(actstr==expstr)
    	System.out.println("displayed");
    else
    	System.out.println("not displayed");
    
    String att=driver.findElement(By.xpath("//input[@id='FirstName']")).getAttribute("type");
    System.out.println("attributevalue:"+" "+att);
    
   // Thread.sleep(3000);
    //driver.quit();
		
	}

}
