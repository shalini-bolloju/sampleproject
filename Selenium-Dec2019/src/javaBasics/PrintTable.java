package javaBasics;

import java.util.Scanner;

public class PrintTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=1,num;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
num=sc.nextInt();
sc.close();
for(i=1;i<=10;i++)
{
	System.out.println(i+"*"+num+"="+num*i);
	
}

	}

}
