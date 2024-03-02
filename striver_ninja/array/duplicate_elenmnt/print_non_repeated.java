import java.util.Arrays;

public class print_non_repeated {
        
     public static void main(String[] args) {
        
            int arr[] = {5,3,4,5,2,3,4};
            int result =  arr[0];
            for(int i=1; i<arr.length; i++)
            {
                result = result^arr[i];
            }
            System.out.println(result);
          
      }
}
