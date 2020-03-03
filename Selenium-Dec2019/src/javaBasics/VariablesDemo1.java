package javaBasics;

import java.util.Scanner;

public class VariablesDemo1 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     
     System.out.println("enter age:");
     int age = sc.nextInt();
     System.out.println(age);
     
     System.out.println("Enter name:");
     String name = sc.next(); 
     System.out.println(name);
     sc.close();
	}

}
