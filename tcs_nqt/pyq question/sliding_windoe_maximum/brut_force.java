import java.util.Scanner;
import java.util.*;
  // [ 2,3,4,5,6,7]
public class brut_force {

            public static List<Integer> MaxElementWindow(int arr[] , int k , int size){
                                List<Integer> result = new ArrayList<>();
                                int max=0;
                               for(int i=0;i<=size-k;i++){
                                     max = arr[i];
                                    for(int j=1;j<k;j++){
                                      // we assume subarray's first element is always bigger
                                              if(arr[i+j]>max){
                                                 max=arr[i+j];
                                              }  
                                    }
                                    result.add(max);
                               }
                              return result;
            }

            public static void main(String[] args){
                        
                         Scanner sc = new Scanner(System.in);
                         int size = sc.nextInt();
                         int arr[] = new int[size];
                         for(int i=0;i<size;i++){
                                  arr[i]=sc.nextInt();
                         }  
                         
                         int window_slide_k = 3;

                List<Integer> ans=    MaxElementWindow(arr,window_slide_k , size);
                System.out.println(ans);
            }
}