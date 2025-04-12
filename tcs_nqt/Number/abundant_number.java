import java.util.Scanner;

public class abundant_number {

            public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number ");
            int n = sc.nextInt();
            int clone = n;
             int  sum =0;
            for(int i=1; i<n;i++){
             
                        if (n%i ==0) {
                            sum = sum +i;        
                        }
            }
            System.out.println("sum of divisior "+ sum);

            if (sum>clone) {
                    System.out.println("it is abundant number ");    
            }
            else
             System.out.println("it is not abundant number");
            
            }
}