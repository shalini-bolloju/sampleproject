package TestNgPack;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_Myinfo {
	@BeforeMethod
	public void bm(){
		System.out.println("Before method executed");
	}
	@AfterMethod
	public void am(){
		System.out.println("After method executed");
	}
	@Test(priority=3,enabled=false)
	public void aTC01(){
		System.out.println("TC01 executed");
	}
	@Test(priority=2)
	public void TC02(){
		System.out.println("TC02 executed");
	}
	@Test(priority=1)
	public void TC03(){
		System.out.println("TC03 executed");
}
}
