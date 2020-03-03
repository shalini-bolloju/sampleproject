package oops;

public class Customer {
	String custname;
	int age;
	static String bankname="HDFC bank";
	String email;
	
	void setDetails(String cname,int cage,String cemail)
	{
	custname=cname;
	age=cage;
	email=cemail;
	}
	void getDetails(){
		System.out.println(custname);
		System.out.println(age);
		System.out.println(bankname);
		System.out.println(email);
	}
	public static void main(String[] args){
		Customer cust1=new Customer();
		cust1.setDetails("kumar",35,"asdf1@gmail.com");
		cust1.getDetails();
		
		Customer cust2=new Customer();
		cust2.setDetails("naveen",36,"cvbn@gmail.com");
		cust2.getDetails();
	}
	
}
