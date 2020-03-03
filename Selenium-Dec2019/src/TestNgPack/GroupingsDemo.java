package TestNgPack;

import org.testng.annotations.Test;

public class GroupingsDemo {

	@Test(groups={"include-group"})
	public void Testone(){
		System.out.println("This is an sanity testing");
	}

    @Test(groups={"exclude-group"})
    public void Testtwo(){
    	System.out.println("This is an Regression testing");
    }
   
    @Test(groups={"include-group","exclude-group"})
    public void Testthree(){
         System.out.println("This is is an sanity and Regression testing");	
    }
    
    
 }


