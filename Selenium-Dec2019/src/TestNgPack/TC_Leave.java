package TestNgPack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_Leave {

	@BeforeMethod
	public void bm(){
		System.out.println("Before method executed");
	}
	@AfterMethod
	public void am(){
		System.out.println("After method executed");
	}
	@BeforeClass
	public void bc(){
		System.out.println("Before class executed");
	}
	@AfterClass
	public void ac(){
		System.out.println("After class executed");
	}
	@Test
	public void TC01(){
		System.out.println("TC01 executed");
	}
	@Test
	public void TC02(){
		System.out.println("TC02 executed");
}
}