package oops;

public class AdvaCalc1 extends Basicc1{
 //method overriding
	void add(int x,int y){
		System.out.println("Add of int,int in AdvanceCalc is: " +(x+y));
	}
	 private void mul(int x,int y){
		System.out.println("mul of int,int in AdvanceCalc is: " +(x*y));
	}
	void div(int x,int y){
		System.out.println("Div of int,int in AdvanceCalc is: " +(x/y));
	}
	public static void main(String[] args) {
		AdvaCalc1 obj1=new AdvaCalc1();
		obj1.add(25, 24);
		obj1.mul(6,7);
		obj1.div(6,3);

		Basicc1 obj2=new Basicc1();
		obj2.add(4, 5);//method over riding
	}

}
