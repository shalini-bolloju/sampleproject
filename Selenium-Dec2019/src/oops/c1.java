package oops;

   public class c1 {

	private void add(){
		System.out.println("add method in c1");
	}
	void sub(){
		System.out.println("sub method in c1");
	}
	public void mul(){
		System.out.println("mul method in c1");
	}
	protected void div(){
		System.out.println("div method ic c1");
	}
	public static void main(String[] args){
		c1 obj=new c1();
		obj.add();
		obj.sub();
		obj.mul();
		obj.div();
	}
}
