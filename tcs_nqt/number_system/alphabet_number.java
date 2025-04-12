import java.util.Scanner;

public class alphabet_number {
      public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
                 System.out.println("enter the octal no.");
                 int n = sc.nextInt();
                 int  count =0;
                 char c = ' ';
                 char arr[] = {
                        '0','A','B','C','D','E','F','G','H','I',
                        'J','K','L','M','N','O','P','Q','R',
                        'S','T','U','V','W','X','Y','Z'
                 };
                  char  val =arr[n];
                  System.out.println(val);
                 



      }      
}
