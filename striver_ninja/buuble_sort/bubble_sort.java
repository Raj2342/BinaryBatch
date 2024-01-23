import java.util.Arrays;

class bubble_sort{
       
     public static void  bro(int arr[] , int n){
    
        
        for(int i=0; i<n-1;i++){
            for(int j=0; j<n-1-i; j++){
                if (arr[j]>arr[j+1]) {
                int temp = arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }

          
            



       }
    
    
    
    
    
    public static void main(String[] args) {
              int n=5;  
        int arr[] = { 41, 467, 334, 500 ,169, 724, 478, 358, 962, 464 };

         bro(arr, n);
         System.out.println(Arrays.toString(arr));
         System.out.println(arr[arr.length-1]);
      
        }
   
   
    }
