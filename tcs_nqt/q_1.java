 /*A chocolate factory is packing chocolates into the packets. 
The chocolate packets here represent an array  of N number of 
integer values. The task is to find the empty packets(0) of
 chocolate and push it to the end of the conveyor belt(array).
 */
import java.util.Arrays;
import java.util.Scanner;

 public class q_1{
            public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("enter  size of array ");
         int n = sc.nextInt();

         System.out.println("Enter the array ");
          int arr[] = new int[n]; 
             for(int i=0;i<n;i++){
               arr[i]= sc.nextInt();
               
             } 
             int count =0; 
             for(int i=0; i<n;i++){
                if (arr[i] != 0) {
                    arr[count]=arr[i];
                    count++;  
                }
             }

             for(int i=count;i<n;i++){
               arr[i]=0;
             }
             
             for(int i=0;i<n;i++){
               System.out.print(arr[i]+" ");
             }
             
            }
 }