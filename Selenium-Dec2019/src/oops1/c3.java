package oops1;
import oops.c1;
public class c3 extends c1 {

	  public static void main(String[] args){
		  c1 obj=new c1();
		  //obj.add(); private cannot be accessed
		  //obj.sub();default cannot be accessed
			obj.mul();
		  //obj.div();protected cannot be accessed
			
			c3 obj1=new c3();
			obj1.div();
	  }
}
