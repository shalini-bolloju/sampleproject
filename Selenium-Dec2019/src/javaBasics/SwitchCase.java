package javaBasics;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  @SuppressWarnings("resource")
Scanner  sc =new Scanner(System.in);
  System.out.println("enter the number between 1-7");
  int day=sc.nextInt();
switch(day)
{
case 1:
	System.out.println("Today is Sunday");
	break;
case 2:
	System.out.println("Today is Monday");
	break;
case 3:
	System.out.println("Today is Tuesday");
	break;
case 4:
	System.out.println("Today is Wednesday");
	break;
case 5:
	System.out.println("Today is Thrusday");
	break;
case 6:
	System.out.println("Today is Friday");
	break;
case 7:
	System.out.println("Today is Saturday");
	break;
default:
	System.out.println("Invalid input, try again");
	break;
}
	}

}
