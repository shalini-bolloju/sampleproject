package javaBasics;

public class TypeConversionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Implicit conversion or Type conversion
    int a=34;
    double b=a;
    System.out.println(b);
    //Explicit conversion or Type Casting
    double c=20.5;
    int d=(int) c;
    System.out.println(d);
    
    char ch='C';
    int a1= ch;
    System.out.println(a1);
    
    int a2=97;
    char ch1=  (char)a2;
    System.out.println(ch1);
	}

}
