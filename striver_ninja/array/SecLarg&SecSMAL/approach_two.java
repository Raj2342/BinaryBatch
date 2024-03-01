// second large elemnt and second small element 

import java.util.Arrays;

public class approach_two {
    public static int sort(int arr[] , int n ){
              
       Arrays.sort(arr);
      
        // return new int[] {arr[n-2] , arr[1]};
         return arr[n-2];
        //  return arr[1]; 
              
    }
   
     public static void main(String[] args) {
           int arr[] = { 8,4,6,3,7};
               int n =5;
            //  System.out.println(Arrays.toString(sort(arr, n)));  
        
               System.out.println(sort(arr, n));
            //    System.out.println(" SECOND SMALLEST" + Arrays.toString(arr));
     }
}
