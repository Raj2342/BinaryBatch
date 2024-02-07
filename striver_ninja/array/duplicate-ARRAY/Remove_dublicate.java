import java.util.Arrays;

public class Remove_dublicate {
        
         public static int  play(int arr[] , int n ){
          int[] temp = new int[arr.length];
          int  j=0;
          for(int i=0; i<arr.length-1;i++){
                      
                    if (arr[i]!=arr[i+1]) {
                          temp[j] = arr[i];
                          j++;
                         }
               
                         temp[j] = arr[arr.length-1];

               
            }
             
           
            
               // System.out.println(Arrays.toString(temp));
            
             
            // System.out.println(arr.length);

            /// remove from arrays  Zeros 
            int len=0;
            for(int k=0; k<temp.length;k++){
               if (temp[k]!=0) {
                  len++;
               }
            }

            int[] Zeros = new int[len];
            for(int k=0, s=0; k<Zeros.length; k++)
            {
                 if (temp[k] != 0) {
                     Zeros[s] = temp[k];
                     s++;
                 }
            }

            
               // System.out.print(Zeros.length );
            int store = Zeros.length;
            return store;
           
       
              
         }
    
    
    
    public static void main(String[] args) {
           int arr[] = {1,2,2,3,3,4,4,5,6};
           int n =4;
           System.out.println(play(arr, n));
          
       //     System.out.println(play(arr));
          
           
            
       }
}





//   approach-2   - smart programming 
// public class Approach_second {
        
//        public static void main(String[] args) {
              
//               int arr[] = { 1,2,2,3,3,3,4,5,5};
//               int[]  temp = new int[arr.length];
//               int j=0;
//               for(int i=0; i<arr.length-1; i++){
//                if (arr[i]!=arr[i+1]) {
//                        temp[j]= arr[i];
//                        j++;
//                }

//               }
//               temp[j]= arr[arr.length-1];
//               // print 
//               for(int i=0; i<arr.length;i++){
//                   System.out.print(temp[i]+ " ");
//               }

//        }
// }  

