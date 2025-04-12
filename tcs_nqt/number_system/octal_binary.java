import java.util.Scanner;

public class octal_binary {
      public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
                 System.out.println("enter the octal no.");
                 int n = sc.nextInt();
                 int arr[] = new int[1000];
                 int rem;
                 int count=0;
                 while (n>0) {
                       rem = n%2;
                       arr[count] = rem;
                        n= n/2;
                        count++;
                 }

                 for(int i=count-1;i>=0;i--){
                        System.out.print(arr[i]);
                 }
      }      
}
