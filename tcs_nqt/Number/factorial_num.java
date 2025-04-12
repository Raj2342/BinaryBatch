import java.util.Scanner;
/* 
int n =5;
int ans=1;
for(int i=1;i<=n;i++){
     ans = ans*i;
}
System.out.println(ans);
*/


/*   import java.util.Scanner;
import java.util.*;
import java.math.*;
public class broRough {   
         public static void main(String[] args) {
           int n = 12;
           int sum =0;
           BigInteger ans=  BigInteger.ONE; 
           for(int i=1;i<=n;i++){
              ans = ans.multiply(BigInteger.valueOf(i));
           }
           System.out.println(ans);
         }   
}
 */

public class factorial_num {

        public static int  factorial(int n){
             if (n<=1) {
                   return n;     
             }
             else
            return  n*factorial(n-1);
        }
       public static void main(String[] args) {
              
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number ");
            int n = sc.nextInt(); //4
             System.out.println(factorial(n));
             

       }     
}
