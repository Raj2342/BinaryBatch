import java.util.Scanner;

public class quadratic_equation {

            public static void quadratic(int a, int b , int c){
                double r1, r2 ,x,y =0;
            //        check disrmenant
               int D = b*b-4*a*c;
               if (D==0) {
                     System.out.println("real and equal roots");
                   r1 = -b/2*a;
                   r2 = -b/2*a;
                   System.out.println("roots r1 :"+ r1+ " AND "+"roots r2 :"+r2);

               }
               else if (D>0) {
                     System.out.println("real and distint roots"); 
                     r1= (-b+Math.sqrt(D))/2*a;
                     r2 = (-b+Math.sqrt(D))/2/a;
                     System.out.println("roots r1: "+ r1+"AND "+ "roots r2: "+r2);
               }
               else if (D<0) {
                      System.out.println(" distint and imaginary roots"); 
                      x = -b/2*a ; 
                      y =  (Math.sqrt(-D))/2*a;
                      System.out.println("roots r1 :"+ x + "+"+ "i"+y);
                      System.out.println("roots r1 :"+ x + "-"+ "i"+y); 
                       
               }

                        
            }
            public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
         System.out.println("Enter a");
        int a = sc.nextInt();
        System.out.println("Enter b");
        int b = sc.nextInt();
        System.out.println("Enter c");
        int c = sc.nextInt();

        quadratic(a,b,c);




            }
}
