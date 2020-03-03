package oops;

public class AdvCalc extends BasicCalc {

	public int sub(){
		return(val1-val2);
	}
	public static void main(String[] args) {
    AdvCalc obj2=new AdvCalc();
    obj2.val1=56;
    obj2.val2=23;
    System.out.println(obj2.add());
    int a=obj2.sub();
    System.out.println("sub "+a);
	}

}
