// sum of number in a given range  

import java.util.Scanner;

public class sum_num_range {
            public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number ");
            System.out.println("give lowest number ");
            int n1 = sc.nextInt();
            System.out.println("give higest number ");
            int n2 = sc.nextInt();
            int result =0;
            
            for(int i=n1; i<=n2;i++){
                  result = result+i;
            }
            System.out.println(result);



            }
}
