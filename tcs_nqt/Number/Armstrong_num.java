import java.util.Scanner;

public class Armstrong_num {
            public static void main(String[] args) {
                        Scanner sc = new Scanner(System.in);
                        System.out.println("Enter Number ");
                       int n = sc.nextInt();
                       int fake = n;
                       int store=0;
                       int resul=0;
                       while (n>0) {
                        int term = n%10;
                        resul =  resul +term*term*term;
                        n = n/10;
                        
                       }
                       if (resul== fake) {
                        System.out.println("armstrong ");
                       }
                       else{
                        System.out.println("not armstrong ");
                       }
            }
}
