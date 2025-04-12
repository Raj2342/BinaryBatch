 public class subArray_target{
           
      public static void brutforce(int arr[] , int target , int n){
        
            for(int i=0;i<n;i++){
              int sum=0;
              for(int j=i;j<n;j++){ 
                sum = sum + arr[j];
                if(sum==target){
                  for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                  }
                  System.out.println();
                }
                
                
              }
            }
        
        
        
      }
   public static void  main(String[] args){
     
        int arr[] = {3, 4, -7, 1, 3, 3, 1, -4};
        int n = arr.length;
        int target = 7;
        brutforce(arr , target , n);
     
   }
 }