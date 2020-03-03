package javaBasics;
import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a,b,c;
     double d;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number a=");
     a=sc.nextInt();
     
     System.out.println("Enter the number b=");
     b=sc.nextInt();
     
     System.out.println("Enter the  number c=");
     c=sc.nextInt();
     
     sc.close();
     d= (double) (a+b)/c;
     System.out.println("the value of d is "+ d);
     
	}

}
