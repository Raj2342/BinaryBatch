import java.util.Scanner;

public  class  febonaccio
{
      public static void main(String[] args) {
               
              Scanner sc = new Scanner(System.in);
              System.out.println("Enter nth no. of febonacci series ");
              int nth = sc.nextInt();

              int a = -1 ;
              int b = 1;
              for(int i=0; i<=nth;i++){
                   int c = a+b ;
                   System.out.println(c);
                   a= b ;
                   b= c;
               }



      }
}