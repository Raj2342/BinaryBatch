import java.util.Scanner;

public class power_of_num {

            public static int power(int N, int a){
                      //N^a
                        int val = 1;
                        for( int i=1;i<=a;i++){
                             val = val*N;
                        
                        }
                        return val;

            }
            public static void main(String[] args) {
                                            Scanner sc = new Scanner(System.in);
                        System.out.println("first Number ");
                       int N = sc.nextInt();   
                       System.out.println("second num"); 
                       int a = sc.nextInt();
                     System.out.println(power(N,a)); 
            }
}
