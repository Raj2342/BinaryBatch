//Largest Element in the Array
//  ## sortcut way : 
//   public static void main(String[] args) {
//        int arr1[] = { 2,3,4,5,6};
//        System.out.println(sort(arr1));
//        int arr2[] = {4,2,6,8,7,10 };
//        System.out.println(sort(arr2));
       
// }
//     static int sort(int arr[]){
//          Arrays.sort(arr);
//          return arr[arr.length-1];
//     }


import java.util.Arrays;

public class Large_ele {
        
         
       public  static int  crack(int arr[] , int n ){
               for(int i=0; i<arr.length;i++){
                for(int j=0; j<arr.length-i-1 ; j++){
                    // if(arr[j]> arr[j+1])- acending order
                    // if(arr[j]< arr[j+1]) - decending order 
                     if(arr[j]> arr[j+1]){
                        int temp = arr[j+1];
                         arr[j+1] = arr[j];
                         arr[j]= temp;
                     }
                       
                }
               }
               return    arr[arr.length-1] ;
               
            //    System.out.println(arr[ arr.length-1]); // without return , void case

       }
    
    
    
    
    public static void main(String[] args) {
             
        
        int arr[] = {5, 10, 20, 15};
        int n=6;
           
        System.out.println(crack(arr , n));
       
       
        // int  si = arr.length;
        //      crack(arr);
        //      System.out.println(Arrays.toString(arr));
        //      System.out.println(arr[si-1]);
         }
}
