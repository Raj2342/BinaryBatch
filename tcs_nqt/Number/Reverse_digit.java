import java.util.Scanner;

public class Reverse_digit {
            public static void main(String[] args) {
                  Scanner sc = new Scanner(System.in);
            int n = sc.nextInt(); // 3456
             int reverse =0;
             
             while (n>0) {
                  int  lastdigi = n%10;
                   reverse = reverse*10+lastdigi;
                  n = n/10;     
             }
             System.out.println(reverse);

            }
}
