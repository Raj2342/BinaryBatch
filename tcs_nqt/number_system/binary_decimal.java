// binary to decimal convert 

import java.util.Scanner;

public class binary_decimal { 
           public static void main(String[] args) {
                 Scanner sc = new Scanner(System.in);
                 System.out.println("enter the binary no.");
                 int n = sc.nextInt(); 
                int  pv=1;  // place value
                int ans=0;
                while (n!=0) {
                    int   lastdig = n%10; 
                    n = n/10;
                   
                    ans = ans + pv*lastdig; 
                    pv = 2*pv;
                }
                System.out.println(ans);
           } 
}
