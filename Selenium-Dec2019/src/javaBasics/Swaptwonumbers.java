package javaBasics;
import java.util.Scanner;
public class Swaptwonumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  /*  int a=100;
      int b=200;
      int c;*/
		int a,b;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number a:");
		a= sc.nextInt();
		
		System.out.println("Enter the number b:");
		b=sc.nextInt();
		sc.close();
		 a=a+b;
		 b=a-b;
		 a=a-b;
		
     /*c=a;
      *a=b;
       b=c;*/
		
        System.out.println("a="+a);
        System.out.println("b="+b);
	}

}
