package oops1;

public class Derived extends Test{
    void myMethod() 
	{ 
		System.out.println("GFG");
		} 
		public static void main(String[] args) { 
		Test obj=new Test();
		obj.myMethod();
		Derived obj1=new Derived();
	    obj1.myMethod();
}
}