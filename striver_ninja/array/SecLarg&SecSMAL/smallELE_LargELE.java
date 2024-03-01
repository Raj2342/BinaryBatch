import java.util.Arrays;

public class smallELE_LargELE {
       
       
    public static void  Smallest(int arr[] , int n ){
              
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                  if (arr[j]<arr[j+1]) {
                      int temp = arr[j+1];
                      arr[j+1]=arr[j];
                      arr[j]=temp;
                  }
            }
        }
               //   print array in normal way 
        // for(int i=0; i<n-1; i++){
        //     System.out.print(arr[i] +" ");
        // }
        // print array 
        System.out.println(arr[ arr.length-2]); 
              
    }


    public static void  Largest(int arr[] , int n ){
              
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                  if (arr[j]>arr[j+1]) {
                      int temp = arr[j+1];
                      arr[j+1]=arr[j];
                      arr[j]=temp;
                  }
            }
        }
           
    //   print array in normal way 
        // for(int i=0; i<n-1; i++){
        //     System.out.print(arr[i] +" ");
        // }
        // print in  array 
        System.out.println(arr[ arr.length-2]); 
              
    }
    
    
    
    
    
    public static void main(String[] args) {
                
               int arr[] = { 8,4,6,3,7};
               int n =5;
               Smallest(arr, n);
            //    System.out.println(" SECOND SMALLEST" + Arrays.toString(arr));
               Largest(arr, n);
            //    System.out.println(" SECOND LARGEST" + Arrays.toString(arr));

            // System.out.println(Smallest(arr,n));
               
            //    System.out.println(arr[ arr.length-2]);
            //    System.out.println(arr[1]);
        }

    
}
