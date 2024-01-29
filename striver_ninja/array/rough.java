public class rough {
        
       public static void main(String[] args) {
           
           int arr[] = {0, 5, 6, 0, 0, 2, 5};
            int len=0;
           for(int i=0; i<arr.length; i++){
            if (arr[i] != 0) {
                 len++; 
                
            }
           }
        

            int newarr[] = new   int[len];
            for(int i=0, j=0; i<arr.length;i++){
                if (arr[i] != 0) {
                    newarr[j] = arr[i];
                    j++;
                }
            }
            
            for(int k=0; k<newarr.length; k++){
                System.out.print(newarr[k] + " ");
            }
       }
}
