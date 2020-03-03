package oops;

public class ReturnMethodData {
	int add(int x,int y)
	{
		return(x+y);
	}
public static void main(String[] args){
	ReturnMethodData obj=new ReturnMethodData();
	System.out.println(obj.add(10,20));
	int output=obj.add(20, 10);
	System.out.println("output is: "+ output);
}
}
