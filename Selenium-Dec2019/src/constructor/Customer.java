package constructor;

public class Customer {
	
	String name;
	int age;
	 static String Bankname;
	
	Customer(){
		System.out.println("Default Constructor");
	}
	//constructor... to assign data to instance variables
	Customer(String name,int age){
		this.name=name;
		this.age=age;
	}
	//static block....to assign data to static/class variables
	static{
		Bankname="HDFC bank";
	}
	void show(){
		System.out.println("name is:"+name);
		System.out.println("age is:"+age);
		System.out.println("bank name:"+Bankname);
	}

	public static void main(String[] args) {
	Customer c1=new Customer();
	c1.show();
	
	Customer c2=new Customer("asdf",35);
	c2.show();

	}

}
