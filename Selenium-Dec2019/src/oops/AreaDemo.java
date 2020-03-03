package oops;

public class AreaDemo {
    int square (int a){
	return a*a	; 
	}
    double triangle(float b,float h){
    	return 0.5*b*h;
    }
    int parallelogram (int b,int h){
    	return b*h;
    }
    int rectangle(int w,int h) {
    	return w*h;
    }
	public static void main(String[] args) {
		AreaDemo obj1=new AreaDemo();
		obj1.square(4);
		obj1.triangle(5, 7);
		obj1.parallelogram(4, 9);
		obj1.rectangle(4, 6);
		int x=obj1.square(4);
		System.out.println("area of square :" +" " + x);
		System.out.println("Area of triangle :" +" "+obj1.triangle(5, 7));
		System.out.println("Area of parallelogram :" +" "+ obj1.parallelogram(4, 9));
		System.out.println("Area of rectangle :" + " "+obj1.rectangle(4, 6));
	}
	
	

}
