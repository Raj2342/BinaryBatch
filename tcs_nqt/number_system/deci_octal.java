
import java.util.Scanner;

public class deci_octal {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter integer value ");
            int n = sc.nextInt();
            int arr[] = new int[1000];

            int count =0;
            while ( n>0) {
                arr[count] = n%8;
                n = n/8;
                count++;
            }
            for(int i=count-1;i>=0;i--){
                   System.out.print(arr[i]);
            }
            
            


        }    
}
    

