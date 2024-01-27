import java.util.Arrays;

public class half_sort_ar {
       
    public static void  Smallest(int arr[] , int n ){
        // int k = Math.floorDiv(n,2);
        int count = 0;
        
        for(int i=0; i<n-1; i++){
            if (count > 0){
            for(int j=0; j<n-i-1; j++){
                  if (arr[j]<arr[j+1]) {
                      int temp = arr[j+1];
                      arr[j+1]=arr[j];
                      arr[j]=temp;
                      
                  }
            }
            

        }
        count = count + 1;
        System.out.print(count);
    }

   
            
        

        // System.out.println(arr[ arr.length-2]); 
               //   print array in normal way 
            //    for(int i=0; i<n-1; i++){
            //     System.out.print(arr[i] +" ");
            // }
            

    }

    


        public static void main(String[] args) {
            int arr[] = { 12,9,5,8,10};
            int n =5;
            Smallest(arr,n);
            System.out.println(Arrays.toString(arr));
               
       }
}
