package oops;

public class c2 {
   public static void main(String[] args){
	   c1 obj=new c1();
	 // obj.add(); private cannot be accessed
		obj.sub();//default
		obj.mul();//public 
		obj.div();//protected
   }
}
