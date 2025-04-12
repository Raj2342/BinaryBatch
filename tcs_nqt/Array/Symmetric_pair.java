// Find all symmetric pairs in array
import java.util.*;
public class Symmetric_pair{
             
            public static void solve(int arr[][]){
                        Map<Integer,Integer> hm = new HashMap<>();
                        for(int nums[] : arr){
                                    int first = nums[0];
                                    int second = nums[1];
                                    if (!hm.containsKey(second)) {
                                                hm.put(first, second);
                                                
                                    }
                                    else{
                                                System.out.println("("+first+", "+second+ ")");
                                    }
                        }

            }
            public static void main(String[] args) {
                       int  arr[][] = {
                         {1,2},{2,1},{3,4},{4,5},{5,4}
                       } ;
                       solve(arr);
            }
}