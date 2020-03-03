package arrays;

public class Sortofarray {
	
	public static void main(String[] args) {
		int temp;

	int arr[]=new int[]{43,89,18,6,1,67};
     for (int i = 0; i <6; i++) 
     {
         for (int j = i + 1; j <6; j++) { 
             if (arr[i] >arr[j]) 
             {
                 temp = arr[i];
                 arr[i] = arr[j];
                 arr[j] = temp;
             }
         }
     }
     System.out.print("Array Elements in Ascending Order: ");
     for (int i = 0; i < 6 - 1; i++) 
     {
         System.out.print(arr[i] + ", ");
     }
     System.out.print(arr[6 - 1]);
	}

	}


