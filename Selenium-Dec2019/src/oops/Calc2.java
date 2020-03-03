package oops;

public class Calc2 extends Calc1{

	void add(int x,int y){
		System.out.println("Add int, int in Calc2: " +(x+y));
	}
	void m1(){
		super.add(20, 30);
		add(23,34);
		sub(34,21);
	}
	public static void main(String[] args) {
		Calc2 obj= new Calc2();
		obj.m1();

	}

}
