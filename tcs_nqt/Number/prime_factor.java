/*
  print all prime factor of given number 
 */

import java.util.Scanner;

public class prime_factor {
            public static void main(String[] args) {
                        
                         Scanner sc = new Scanner(System.in);
                        System.out.println(" Enter the  number   ");
                       int  num = sc.nextInt(); 
                       int n = 2;
                       while (num>1)        
                       {
                        if (num%n==0) {
                              System.out.println(n+" "); 
                              num = num/n;     
                        }
                        // jo divide naa ho  ek number increment ho jaye
                        else{
                                n++;
                        }
                       }
            }
}
