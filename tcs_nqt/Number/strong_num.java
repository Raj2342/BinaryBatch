import java.util.Scanner;

public class strong_num {

            public static int fac(int n){
            // multiplication from 1 to n
                        int f=1;
                        for(int i=1;i<=n;i++){
                                    f=f*i;
                        }
                        return f;
            }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
                        System.out.println(" Enter the  number  ");
                       int  n = sc.nextInt(); 
                       int temp = n;
                       int sum =0;
                       while (n!=0) {
                          int d = n%10;
                          sum = sum + fac(d);
                          n=n/10;
                       }
                       if (temp==sum) {
                        System.out.println("strong number ");
                       }
                       else{
                        System.out.println("Not strong num");
                       }

        }    
}
