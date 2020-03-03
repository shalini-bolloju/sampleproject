package oops;

public class Basicc1 {
	//method overloading
	void add(int x,int y){
		System.out.println("Add of int is: " +(x+y));
	}
	    void add(double x,double y){
		System.out.println("add of double is: " +(x+y));
	}
	void add(int x,double y){
		System.out.println("add of is: " +(x+y));
	}
	public static void main(String[] args) {
		Basicc1 obj=new Basicc1();
		obj.add(3, 7);
        obj.add(2.4,4.5);
        obj.add(5, 3.6);
	}

}
