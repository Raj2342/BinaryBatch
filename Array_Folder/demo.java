import java.util.*;
public class demo {

 

    public static void main(String[] args) {
       int arr[] = { 1,1,2,2,3,3,3} ;
         int temp [] = new int[4];
         int rd =1;
        //  temp[rd] = 0;
         for(int i : arr){
            if (temp[rd] != i){
              rd++;
              temp[rd] = i;
            }
         }

         System.out.println(Arrays.toString(temp));
    }


}