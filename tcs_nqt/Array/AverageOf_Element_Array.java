//Average of all elements in an array

import java.util.Scanner;

public class AverageOf_Element_Array {
            public static void average(int[] arr){
                        int ans =0;
                        for(int i=0;i<arr.length;i++){
                                    ans = ans + arr[i];
                        }
                        System.out.println("sum of array");
                        System.out.println(ans);
                        System.out.println("average of array");
                        int avg= ans/arr.length;
                        System.out.println(avg);

            }
            public static void main(String[] args) {
                       Scanner sc = new Scanner(System.in);
                       System.out.println("ENTER LENGTH OF ARRAY");
                       int n = sc.nextInt();
                       int arr[] = new int[n];
                       for(int i=0;i<arr.length;i++){
                           arr[i]=sc.nextInt();
                       }
                        average(arr);
            }
}
