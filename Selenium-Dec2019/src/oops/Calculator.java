package oops;

public class Calculator {
 public int x=8;
 public int y=6;
	public void add()
	{
		System.out.println(x+y);
	}	
    public void sub()
    {
    	System.out.println(x-y);
	}
    public void mul()
    {
    	System.out.println(x*y);
    }
    public static void main(String[] args) {
    	System.out.println("Hi");
    	Calculator obj=new Calculator();
    	obj.add();
    	obj.mul();
    	obj.sub();
    }
}