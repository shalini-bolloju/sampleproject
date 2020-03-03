package oops;

public class BasicCalc {

	int val1;
	int val2;
	public int add(){
		return(val1+val2);
		}
	public int sub(){
		return(val1-val2);
	}
	public int mul(){
		return(val1*val2);
	}
	public int div(){
		return(val1/val2);
	}
	public static void main(String[]args){
		BasicCalc obj1=new BasicCalc();
		obj1.val1=20;
		obj1.val2=30;
		System.out.println(obj1.add());
		int a=obj1.sub();
		System.out.println("sub of val1 and val2" + a);
		
	}
	
}
