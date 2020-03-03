package javaBasics;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int temp=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int num=sc.nextInt();
sc.close();
for(int i=2;i<=num/2;i++)
{
 if(num%i==0)
 {
	temp++;
 }
}
if(temp==0)
	System.out.println(num+" is prime number");
else
	System.out.println(num+" is not a prime number");



	}

}
