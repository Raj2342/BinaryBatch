import java.util.Scanner;

public class GCD {
            public static void main(String[] args) {
                        
                        Scanner sc = new Scanner(System.in);
                        System.out.println("Enter the first num ");
                        int n1 = sc.nextInt();
                        System.out.println("Enter the second num ");
                        int n2 = sc.nextInt();

                        int original1 = n1;
                        int original2 = n2;

                        while (n1%n2 != 0) {
                              int rem = n1%n2;
                              n1 = n2;
                              n2 = rem;
                        }
                        int gcd = n2;
                        int  lcm = (original1*original2)/gcd;
                        System.out.println(gcd);
                        System.out.println(lcm);

                       

          
            }
}
