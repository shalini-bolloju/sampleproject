package oops;

public class calc {
int x;
int y;
void add(int x,int y)
{
	System.out.println(x+y);//x and y are local variables
	System.out.println(this.x+this.y);//this keyword is refer to instance variable
}
void sub()
{
	System.out.println(x-y);
}
public static void main(String[] args){
 calc obj1=new calc();
 obj1.add(24, 12);
}
}
