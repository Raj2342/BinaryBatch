 public class unique_path{
           
      public static int  brutforce(int arr[][], int m , int n){
        
            for(int i=0;i<m;i++){
                arr[i][0]=1;
            }
            
            for(int j=0;j<n;j++){
              arr[0][j]=1;
            }
            
            for(int i=1;i<m;i++){
              for(int j=1;j<n;j++){
                arr[i][j] = arr[i][j-1] + arr[i-1][j];
              }
            }
        
          return  arr[m-1][n-1];
        
      }
      
   public static void  main(String[] args){
     
          int m = 3;
        int n = 7;
        int arr[][] = new int[m][n];
       
        
       int result = brutforce( arr , m , n);
       System.out.println(result);
     
   }
 }