package javaBasics;
import java.util.Scanner;

public class EvenOddno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		i=sc.nextInt();
		sc.close();
		if(i%2==0)
		{
			System.out.println("number is Even");
		}
		else
		{
			System.out.println("number is odd");
		}
	}
	

}
