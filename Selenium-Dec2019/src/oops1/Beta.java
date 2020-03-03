package oops1;

public class Beta extends Alpha {
	 public Beta()  { 
		 System.out.println("beta ");  } 
	 void go()  {   
		 type = "b ";    
		 System.out.println(this.type + super.type);   
	 }
	 public static void main(String[] args)   {      
		  new  Beta().go();
		 }
	 } 


