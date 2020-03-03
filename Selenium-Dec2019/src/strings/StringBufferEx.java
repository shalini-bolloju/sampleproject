package strings;

public class StringBufferEx{
		public static void main(String[] args) {
		
		
		StringBuffer sb=new StringBuffer("Testing");
		sb.append("Masters");
		System.out.println(sb);
		
		String str="Testing";
		String s=str.concat("Masters");
		System.out.println(str);
		System.out.println(s);
		}

}
