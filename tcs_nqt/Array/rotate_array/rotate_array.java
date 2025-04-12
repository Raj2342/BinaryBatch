package rotate_array;
import java.util.Arrays;
import java.util.Scanner;

public class rotate_array {

  public static void rotation(int arr[] , int k){
          // left rotation-positive value
          k=k%arr.length;
          // right rotation-negative value
          if(k<0){
            k=k+arr.length;
          }

          for(int i=1;i<=k;i++){
            shift(arr);
          }
  }
  public static void shift(int arr[]){
    int temp = arr[0];
    for(int i=1;i<arr.length;i++){
               arr[i-1]=arr[i];
    }
    arr[arr.length-1]=temp;
  }
    public static void main(String[] args) {
         int arr[] = {1,2,3,4,5};
         int k=5;
         rotation(arr,k);
         
         System.out.println(Arrays.toString(arr));
          

    }
}
