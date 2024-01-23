import java.util.Arrays;





class Raj {

     public  static int SechigestNum( int arr[] , int num){
            for(int i=0; i<arr.length-1; i++){
                for(int j=0; j<arr.length-i-1;j++){
                    if (arr[j]>arr[j+1]) {
                           int temp = arr[j+1];
                           arr[j] = temp;
                           arr[j+1]= arr[j];
                    }
                }
            }
            return arr[arr.length-2] ;
            
     }

     public static int   SecLowest(int arr[] , int num){
            for(int i=0; i<arr.length-1; i++){
                for(int j=0; j<arr.length-i-1;j++){
                    if (arr[j]>arr[j+1]) {
                           int temp = arr[j+1];
                           arr[j+1]= arr[j];
                           arr[j] = temp;
                          
                    }
                }
            }
               
           return arr[1]; 
            
     }
             
            
     }






public class ApproacONE {
 public static void main(String[] args) {
    
    int arr[] = { 3, 4 ,5 ,2};
    int num=4;

     Raj  obj = new Raj();
    //  obj.SecLowest(arr , num);
    //  System.out.println(Arrays.toString(arr));
     System.out.println(obj.SecLowest(arr,num));


     System.out.println(obj.SechigestNum(arr, num));
    //  SecLowest(arr,num);
    //  System.out.println(obj.SecLowest(arr,n));


}
           
    
   


}
