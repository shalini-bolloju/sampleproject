package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringBuffered {

	public static void main(String[] args) throws IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	System.out.println("enter a string");
	String str=br.readLine();
	
	String temp=str;
	StringBuffer sb=new StringBuffer(str);
    sb.reverse();
    
    str=sb.toString();
    if(temp.equals(str)){
    System.out.println("palindrome");
	}
    else{
    	System.out.println("Not Palindrome");
    }
	}

}
