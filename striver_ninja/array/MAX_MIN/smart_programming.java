import java.util.Arrays;

public class smart_programming {
    
      public static void main(String[] args) {
            int arr[] = { 10,6,7,9,3,5};
            // int max = arr[0];
            int min = arr[0];

            for(int i=0; i<arr.length;i++){
              if (arr[i] < min) {
                    min = arr[i];
                  //   max = arr[i];

              }
            }
            System.out.println(min);
          



      }
}
