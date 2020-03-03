package oops;

public class MyClass {

	static void CheckAge(int age){
		if(age<18)
		{
			System.out.println("Acesses is denied");
		}
		else
		{
			System.out.println("Acesses is granted");
		}
	}
	
	public static void main(String[] args) {
	CheckAge(14);

	}

}
