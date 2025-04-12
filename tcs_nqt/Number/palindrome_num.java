import java.util.Scanner;

public class  palindrome_num{
            public static void main(String[] args) {
                       Scanner sc = new Scanner(System.in);
                       int n = sc.nextInt(); // n = 121
                       int temp = n;
                       int  sum=0;
                       while(n>0){
                         int  rem =  n %10;
                         // we are using this formula becoz for making tens and hundered , it is not array
                         // or other way we say  reverse formula  
                          sum = (sum*10)+rem;
                         n = n/10;
                       }
                       System.out.println("reverse value "+sum);

                       if (temp == sum) {
                        System.out.println("palindrome number ");
                       }
                       else{
                        System.out.println("Not Palindrome");
                       }

            }
}