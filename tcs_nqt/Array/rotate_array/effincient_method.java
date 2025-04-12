package rotate_array;

import java.util.Arrays;
import java.util.Scanner;

public class effincient_method {

  public static void rotation(int arr[] , int k){
          // left rotation-positive value
          k=k%arr.length;
          // right rotation-negative value
          if(k<0){
            k=k+arr.length;
          }
          reverse(arr,0,k-1);
          reverse(arr,k,arr.length-1);
          reverse(arr,0,arr.length-1);
  }
  public static void reverse(int arr[] , int start , int end ){
        while(start<end){
           int temp = arr[start];
           arr[start]=arr[end];
           arr[end]=temp;
           start++; 
           end--;
        }
  }
    public static void main(String[] args) {
         int arr[] = {1,2,3,4,5};
         int k=5;
         rotation(arr,k);
         
         System.out.println(Arrays.toString(arr));
          

    }
}
