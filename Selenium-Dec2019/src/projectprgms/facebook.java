package projectprgms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","c:\\selenium\\Drivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");

		String pagetxt= driver.findElement(By.xpath("//span[text()='Create an account']")).getText();
       System.out.println("pageText:"+" "+pagetxt);
	   String exptxt=pagetxt;
       if(pagetxt==exptxt)
    	   System.out.println("login page is verified");
       else
    	   System.out.println("login page is not verified");		
		
       WebElement fn= driver.findElement(By.xpath("//input[@name='firstname']"));
        boolean b=fn.isDisplayed();
        if(b=true)
        	System.out.println("frist name text box is displayed");
        else
        	System.out.println("frist name text box is not displayed");
		
        WebElement sn= driver.findElement(By.xpath("//input[@name='lastname']"));
        boolean a=sn.isDisplayed();
        if(a=true)
        	System.out.println("sur name text box is displayed");
        else
        	System.out.println("sur name text box is not displayed");
       
        WebElement mob= driver.findElement(By.xpath("//input[@name='reg_email__']"));
        boolean c=mob.isDisplayed();
        if(c=true)
        	System.out.println("mobile no text box is displayed");
        else
        	System.out.println("mobile no text box is not displayed");
		
        WebElement pwd= driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
        boolean e=pwd.isDisplayed();
        if(e=true)
        	System.out.println("password text box is displayed");
        else
        	System.out.println("password text box is not displayed");
		
        WebElement day= driver.findElement(By.xpath("//select[@name='birthday_day']"));
        boolean date=day.isDisplayed();
        if(date=true)
        	System.out.println("bithday day select box is displayed");
        else
        	System.out.println("birthday day select box is not displayed");
		
        WebElement month=driver.findElement(By.xpath("//select[@name='birthday_month']"));
        boolean m=month.isDisplayed();
        if(m=true)
        	System.out.println("birthday month select box is displayed");
        else
        	System.out.println("birthday month select box is not displayed");
        
        WebElement year=driver.findElement(By.xpath("//select[@name='birthday_year']"));
        boolean y=year.isDisplayed();
        if(y=true)
        	System.out.println("birthday year select box is displayed");
        else
        	System.out.println("birthday year select box is not displayed");
       
        WebElement female=driver.findElement(By.xpath("//label[text()='Female']/preceding-sibling::input"));
        boolean r1=female.isDisplayed();
        if(r1=true)
        	System.out.println("female radio button is displayed");
        else
        	System.out.println("female radio button is not displayed");
       
        WebElement male=driver.findElement(By.xpath("//label[text()='Male']/preceding-sibling::input"));
        boolean r2=male.isDisplayed();
        if(r2=true)
        	System.out.println("male radio button is displayed");
        else
        	System.out.println("male radio button is not displayed");
        
        WebElement custom=driver.findElement(By.xpath("//label[text()='Custom']/preceding-sibling::input"));
        boolean r3=custom.isDisplayed();
        if(r3=true)
        	System.out.println("custom radio button is displayed");
        else
        	System.out.println("custom radio button is not displayed");
        
	    WebElement signup=driver.findElement(By.xpath("//button[@name='websubmit']"));
        boolean su=signup.isDisplayed();
        if(su=true)
    	    System.out.println("signup button is displayed");
        else
    	    System.out.println("signup button is not displayed");
	} 

}
