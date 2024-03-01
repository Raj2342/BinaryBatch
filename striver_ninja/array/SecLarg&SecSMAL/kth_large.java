// give kth = 4 index large elemrnt 
// // it  sholud descending order array 



import java.lang.reflect.Array;
import java.util.Arrays;

public class kth_large {
      
    public static void play(int a[] , int kth){
        for(int i=0; i<a.length-1;i++){
            for(int j=0; j<a.length-1-i; j++){
                if (a[j]<a[j+1]) {
                  int temp = a[j+1];
                  a[j+1] = a[j];
                  a[j] = temp;
                }

            } 
          // resolve problem  : if condition write  outoff  loop and nested loop      
                if (i==kth-1) {
                   System.out.println(a[i]);
                    break;
                }
            
            
        }

       
        

    }
   
   
   
    public static void main(String[] args) {
          
        int a[] = { 9,5,6,7,3,5};
        int kth = 4;
         play(a, kth);
         System.out.println(Arrays.toString(a));
    }
}
