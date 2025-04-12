// maximum and minimum number in a digit
import java.io.*;
import java.util.Scanner;

public class max_min_digit {
          public static void main(String[] args) {
               Scanner sc = new Scanner(System.in);
            int n = sc.nextInt(); // 3456
            int mini = Integer.MAX_VALUE;
            int maxi =Integer.MIN_VALUE;
              while (n>0) {
               int ltdigi = n%10;
               maxi = Math.max(ltdigi, maxi);
               mini = Math.min(ltdigi, mini);
               n = n/10;
              }
              System.out.println(maxi+ " "+ mini);
          }  
}
