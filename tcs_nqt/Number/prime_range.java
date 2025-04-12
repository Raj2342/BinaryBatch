import java.util.Scanner;

public class prime_range {
        
  public static void prime(int a , int b){
    int i,j;
          for( i=a;i<=b;i++){
               
             for( j=2;j<=i;j++){
                 if (i%j==0) {
                    break;
                 }
                 
             }
             // divide by itself 
             if (i==j) {
              System.out.print(j+" ");
             }
          }
  }
            
         public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter first num");
           int a = sc.nextInt();
           int b = sc. nextInt();
           prime(a,b);
         
            

         }   
}
