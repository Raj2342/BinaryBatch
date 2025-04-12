import  java.util.Scanner;

import javax.swing.event.AncestorEvent;
public class binary_hexdecimal {
       public static void main(String[] args) {
            
            // binary --> decimal 
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter binary no.");
            int n = sc.nextInt();
            int placeVal=1;
            int lastdigi;
            int ans=0;
            while (n != 0) {
                lastdigi = n%10;
                n= n/10;
                ans =  ans + lastdigi*placeVal;
                placeVal = 2*placeVal;   


            }
            System.out.println("binary no."+ans);

            // decimal --->  hexdecimal 
            int term;
            String s = " ";
            char arr2[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
            while (ans>0) {
                  term = ans%16;
                  s= arr2[term]+s;
                  ans = ans/16;
                  
            }
            
                        System.out.println(s);
          


       }     
}
