package oops;

public class Calculator1 {
	public int x;//instance variable
	public int y;//instance variable
	 
	//instance or non static method
	public void add()
	{
		System.out.println(x+y);
	}
	//instance or non static method
	public void sub()
	{
		System.out.println(x-y);
	}
	//class or static method
	public static void main(String[] args){
	Calculator1 obj1=new Calculator1();//create instance for class-Calculator
	obj1.add();//call instance for class
	obj1.x=10;//assign data to instance variables 
	obj1.y=20;
	obj1.add();
	obj1.sub();
	
	Calculator1 obj2=new Calculator1();//create instance for class-Calculator
	obj2.x=25;obj2.y=12;
	obj2.add();//call instance for class
	obj2.sub();
	}
}
