package oops;

public class Student {


	private String name;
	private int id;
	
	public void setName(String name){
	 this.name=name;	
	}
	public String getName(){
		return name;
	}
	public void setId(int id){
		this.id=id;
	}
	public int getId(){
		return id;
	}
	public static void main(String[] args){
		Student s1=new Student();
		s1.setName("abcd");
		System.out.println(s1.getName());
		s1.setId(1234);
		System.out.println(s1.getId());
	}
}
