/*Remove duplicates from a sorted array
Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
*/
import java.util.Arrays;

public class Remove_duplicate_sorted_array {
            public static int duplicate(int[] arr){
                        int count=0;
                        for(int i=0;i<arr.length;i++){
                                    if(i<arr.length-1 && arr[i]==arr[i+1]){
                                                continue;
                                    }
                                    else{
                                           arr[count]=arr[i];
                                           count++;
                                    }
                        }
                        return count;
            }
            public static void main(String[] args) {
                        int arr[]= {0,0,1,1,1,2,2,3,3,4};
                        
                        System.out.println(duplicate(arr));
            }
}
