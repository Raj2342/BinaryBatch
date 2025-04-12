package map;
import java.util.HashMap;

public class put_getOrDefault {
    public static void main(String[] args){

             int arr[] = { 2,4,2,4,2,4};
             int n= arr.length;
             bro(arr,n);
    }

    public static void bro(int arr[] , int n){
   
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int num: arr){
           freq.put(num, freq.getOrDefault(num,0 )+ 1); // {2=3, 4=3}
        }
        System.out.println(freq);


    }
}