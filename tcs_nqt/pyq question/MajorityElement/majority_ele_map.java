package map;
import java.util.*;
public class majority_ele_map {
              public static void major(int arr[], int n){
                        HashMap<Integer,Integer> hp = new HashMap<>();
                        for(int num : arr){
                          hp.put(num, hp.getOrDefault(num,0)+1);
                        }
                    /*keyset() help to get only key part no value part 
                          key| value
                          2     3
                          4     3

                    */
                  
                        for(int key: hp.keySet()){
                        if(hp.get(key)>=n/2){ 
                                    System.out.println(key);

                        }

                        }

              }
            public static void main(String[] args) {
                        int arr[] = { 2,4,2,4,2,4};
                        int n = arr.length;
                      major(arr ,n); 

            }
            
            
}
