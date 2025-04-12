import java.util.Scanner;

public class Greatest_three_num {
         public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter first num");
                    int a = sc.nextInt();
                    System.out.println("enter second  num");
                    int b = sc.nextInt();
                    System.out.println("enter third num");
                    int c = sc.nextInt();
                    
                if (a>b && a>c) {
                     System.out.println(a+ " a");   
                }
                else if (b>a && b>c) {
                        System.out.println(b+ " b");
                }
                else if (c>a && c>b) {
                        System.out.println(c+"c");
                }
         }   
}
