package myinfominiframe;

public class Testcases_myinfo extends HRMuserlib{

	public static void TC01_myinfo(){
		
		//step1: Launch Application
		launchApp();
		
		//step2: Login as team member
		LoginApp();
		
		//step3: navigate to the myinfo
		navmyinfo();
		
		//step4: Add the Dependent
		Adddependent();
		
		//step5: delete the Dependent
		deleteDependent();
	}
}
