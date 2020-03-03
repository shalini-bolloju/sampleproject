package strings;

import java.util.Scanner;

public class Strings {

	public static void main(String[] args) {
   // String s="Anil chand";
   // String Str=new String("Anil");
    
   /* int i=s.length();
    System.out.print(i);

    String[] temp=s.split(" ");
    for(int j=0;j<temp.length;j++)
    {
    System.out.println(temp[j]);
	}
     String obj=s.replace("chand", "sunil");
     System.out.println(obj);
     
     String obt=s.substring(0,4);
     System.out.println(obt);
     
     String obj5=s.toLowerCase();
     System.out.println(obj5);*/
    
    System.out.println("Enter a string");
    Scanner sc=new Scanner(System.in);
    
    String ReverseStr="";
    String OriginalStr=sc.nextLine();
    sc.close();
    
    for( int i=OriginalStr.length()-1;i>=0;i--){
    	ReverseStr=ReverseStr+OriginalStr.charAt(i);
    }
    if(OriginalStr.equals(ReverseStr)){
    	System.out.println(OriginalStr +" is a palindrome");
    }
    else
    {
    	System.out.println(OriginalStr +""
    			+ "is not palindrome");
    }
    	
    	
    }
     
     
	}
