package arrays;

import java.util.Scanner;

@SuppressWarnings("unused")
public class Array2 {

	public static void main(String[] args) {
	
		//int[][] num=new int[2][2];
		
	/*	num[0][0]=10;
		num[0][1]=20;
		num[1][0]=30;
		num[1][1]=40;
    System.out.println(num[1][1]);*/
		
		/*Scanner sc=new Scanner(System.in);
		int[][] num=new int[2][3];
		System.out.println("enter the data");
		for(int i=0;i<2;i++){
			for(int j=0;j<3;j++){
			num[i][j]=sc.nextInt();
			}
		}
		System.out.println("Display Data");
		for(int i=0;i<2;i++)
			for(int j=0;j<3;j++)
				System.out.println(num[i][j]);*/
		
		int[][] num={
				{10,20,30},
				{30,40,50}
	              };
		System.out.println(num[1][2]);
		
	}

}
