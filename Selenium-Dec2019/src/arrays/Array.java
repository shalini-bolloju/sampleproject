package arrays;

public class Array {

	public static void main(String[] args) {
		//int[] countrypopulation=new int[5];
		int[] countrypopulation={567,890,765,834,945};
		//countrypopulation =new int[5];
     System.out.println("Country population:"+countrypopulation);
     
    // System.out.println("countrypopulation[0]:"+ countrypopulation[0]);
    // System.out.println("countrypopulation[1]:"+ countrypopulation[1]);
     
     for(int i=0;i<countrypopulation.length;i++){
    	 System.out.println("countrypopulation[i]:"+ countrypopulation[i]);
     }
     countrypopulation[0]=345;
     countrypopulation[1]=678;
     countrypopulation[2]=985;
     countrypopulation[3]=845;
     countrypopulation[4]=590;
     System.out.println();
     System.out.println("Reading after writing operation");
     
    /* for(int i=0;i<countrypopulation.length;i++){
    	System.out.println("countrypopulation[i]:"+ countrypopulation[i]);*/
    	int count=0;
    	for(int elm:countrypopulation){
    		count=count+elm;
    		System.out.println(elm);
    	}
    		System.out.println("total countrypopulation is:"+count);
    	
     
	}

}
