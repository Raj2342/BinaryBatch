
import java.util.Scanner;

public class deci_hexadecimal {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter integer value ");
            int n = sc.nextInt();
             String s = " ";
             char dig[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
             int r;   
            while ( n>0) {
                r = n%16;
                s=dig[r]+s;
                n = n/16;
                
            }
            System.out.println(s);
            
            


        }    
}
    


