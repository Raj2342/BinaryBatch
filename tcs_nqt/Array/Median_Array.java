//	Find the median of the given array

import java.util.Scanner;
import java.util.*;
public class Median_Array {
            public static void  median(int arr[] , int n){
                     Arrays.sort(arr);
                     if(n%2 !=0){
                         System.out.println(arr[n/2]);
                          
                     }
                     else{
                        // arr[i]-arr ke ander index hota hai counting from 0 ,1 ,2 3
                         double avg = (arr[n/2]+arr[(n/2)-1])/2.0;
                         System.out.println(avg);
                     }
            }
          public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the length of array");
                int n = sc.nextInt();
                int arr[] = new int[n];
                for(int i=0;i<arr.length;i++){
                        arr[i]=sc.nextInt();
                }
                median(arr,n);


                
          }  
}
