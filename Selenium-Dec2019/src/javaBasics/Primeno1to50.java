package javaBasics;

public class Primeno1to50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int num=1;num<=50;num++)
		{
			int temp=0;
		for(int i=2;i<=num/2;i++)
		{
		 if(num%i==0)
		 {
			temp++;
		 }
		}
		if(temp==0)
			System.out.println(num);
		}
	}

}
