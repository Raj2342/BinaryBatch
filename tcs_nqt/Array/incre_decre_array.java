/*Rearrange array in increasing-decreasing order
Example 1:
Input: 8 7 1 6 5 9
Output: 1 5 6 9 8 7
Explanation: First three elements are in the ascending order and next three elements are in the descending order.

Example 2:
Input: 4 2 8 6 15 5 9 20
Output: 2 4 5 6 20 15 9 8
*/

import java.util.Arrays;

public class incre_decre_array {
            public static void main(String[] args) {
                        int arr[] = {8,7,1,6,5,9};
                        int n = arr.length;
                        Arrays.sort(arr);
                        // divide array into two part 
                        //for loop for  start 0 to middle
                        for(int i=0;i<n/2;i++){
                                    System.out.print(arr[i]+" ");
                        }
                        // for loop for last to middle
                        for(int i=n-1;i>=n/2;i--){
                                    System.out.print(arr[i]+ " ");
                        }

                        
                        
            }
}
