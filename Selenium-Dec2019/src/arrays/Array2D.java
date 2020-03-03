package arrays;

public class Array2D {

	public static void main(String[] args) {
      int[][]  population={{234,567,678,123,897},
    		                {123,432,631,452},
    		                { 912,639,452,710} };
      
      System.out.println("population is:"+population);
      System.out.println("population[0] is"+population[1].length);
      
      System.out.println("population[0][1] is:"+population[0][1]);
      System.out.println();
      
      for(int i=0;i<population.length;i++){
    	  for(int j=0;j<population[i].length;j++){
    		  System.out.print(population[i][j]+"  ");
      }
      
      System.out.println();
      }
      }
      

}
