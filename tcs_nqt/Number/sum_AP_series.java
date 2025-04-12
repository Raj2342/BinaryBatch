import java.util.Scanner;

public class sum_AP_series {

        public static void  AP(int N , int a , int d){
                double sum = (N/2)*(2*a + (N-1)*d);
           
            System.out.println(sum);
        }
            public static void main(String[] args) {
                        Scanner sc = new Scanner(System.in);
                        System.out.println(" series  ");
                       int N = sc.nextInt();   
                       System.out.println(" first  num"); 
                       int a = sc.nextInt(); 
                       System.out.println(" diffrence "); 
                       int d = sc.nextInt(); 
                       AP(N,a,d);

            }
}
