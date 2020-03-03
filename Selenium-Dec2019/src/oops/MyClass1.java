package oops;

 public class MyClass1 {
  static int PlusMethod(int x,int y){
		return x+y;
	}
   static  double plusMethod(double x,double y){
		return x+y;
	}
	public static void main(String[] args) {
	    //int  mynum=PlusMethod(89, 67);
		//double mynum1=plusMethod(67.56, 45.98);
		System.out.println( PlusMethod(89,67));
		System.out.println( plusMethod(67.56, 45.98));

	}

}
