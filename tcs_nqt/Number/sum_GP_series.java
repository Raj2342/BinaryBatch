import java.util.Scanner;

public class sum_GP_series {

            public static void  GP(int N , float a , float r){
                  double sum =0;
                if (r<1) {

                    sum = a*(1-Math.pow(r,N))/(1-r);
                  }
                  else if(r>1){
                      sum = a*(Math.pow(r, N)-1)/(r-1);
                  }

                  
                    System.out.println(sum);
                }
            public static void main(String[] args) {
                         Scanner sc = new Scanner(System.in);
                        System.out.println(" Enter the number of terms in the series (N)  ");
                       int N = sc.nextInt();   
                       System.out.println(" first  num-a"); 
                       float a = sc.nextFloat(); 
                       System.out.println(" diffrence-r "); 
                       float r = sc.nextFloat(); 
                       GP(N,a,r);
            }
}
