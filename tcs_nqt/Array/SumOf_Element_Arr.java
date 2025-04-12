
import java.util.Scanner;

public class SumOf_Element_Arr {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("enter size array");
          int n = sc.nextInt();
          int arr[] = new int[n];

          for(int i=0; i<n;i++){
            arr[i]=sc.nextInt();
          }

          int sum=0;
          for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
          }
          System.out.println(sum); 

    }
}
