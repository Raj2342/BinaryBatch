import java.util.Arrays;

public class Remove_dublicate {
        
         public static int  play(int arr[] ){
          int[] temp = new int[arr.length];
          int  j=0;
          for(int i=0; i<arr.length-1;i++){
                      
                    if (arr[i]!=arr[i+1]) {
                          temp[j] = arr[i];
                          j++;
                         }
               
                         temp[j] = arr[arr.length-1];

               
            }
          //   System.out.println(Arrays.toString(temp));
          return  temp[temp.length-3];
              
         }
    
    
    
    public static void main(String[] args) {
           int arr[] = {1,2,2,3,4,5,5};
          
           System.out.println(play(arr));
          
           
            
       }
}
