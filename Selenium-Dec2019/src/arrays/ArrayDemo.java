package arrays;

import java.util.Scanner;

public class ArrayDemo {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		/*int[] num=new int[3];
		num[0]=10;
		num[1]=20;
		num[2]=30;
		System.out.println(num[2]);*/
		
       /* int[] num={10,20,30};
        System.out.println(num[2]);*/
		
		//Read data at runtime and display the data
		Scanner sc =new Scanner(System.in);
		System.out.println("enter array size");
		int n=sc.nextInt();
		
		String[] student =new String[n];
		System.out.println("enter the names");
		for(int i=0;i<student.length;i++)
		{
			student[i]=sc.next();
		}
		System.out.println("Display Names");
		for(int i=0;i<student.length;i++)
		{
			System.out.println(student[i]);
		}
	}
	

}
