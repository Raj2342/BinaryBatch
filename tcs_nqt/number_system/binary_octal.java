//    binary---> decimal ---> octal
import java.util.Scanner;

public class binary_octal {
         public static void main(String[] args) {
               Scanner sc = new Scanner(System.in);
                 System.out.println("enter the binary no.");
                 int n = sc.nextInt();
                 int placeVal = 1;
                 int ans =0;
                 while (n!=0) {
                      int lastdigi = n%10;
                      n=n/10;
                      ans = ans + lastdigi*placeVal;
                      placeVal=2*placeVal;  
                 }
                 System.out.println("  decimal no."+ans);
                 int term;
                 int count=0;
                 int arr[] = new int[1000];
                 while (ans >0) {
                         arr[count] = ans%8;
                        ans = ans/8;
                        count++;

                 }
            //      count =3, reverse
                 for(int i=count-1;i>=0;i--){
                        System.out.print(arr[i]);
                 }
         }   
}
