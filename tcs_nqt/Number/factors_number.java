import java.util.Scanner;

public class factors_number {
      public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number ");
            int n = sc.nextInt();
            for(int i=1; i<=n;i++){
              if (n%i == 0) {
            // i never larger than n 
                     System.out.print(i+" ");   
              }
            }
             
      }      
}
