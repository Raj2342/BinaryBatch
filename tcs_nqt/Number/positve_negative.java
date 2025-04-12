import java.util.Scanner;

public class positve_negative {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
                       int n = sc.nextInt();
             if (n==0) {
                  System.out.println("neither positive  nor  negative ");      
             }
             if(n>0){
                        System.out.println("it is positive number ");
             }
             else if (n<0) {
                        System.out.println("it is negative number ");
             }
        }    
}
