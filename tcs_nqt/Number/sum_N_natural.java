// sum of N natural number 

import java.util.Scanner;

public class sum_N_natural {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int sum=0;
            // for(int i=1;i<=n;i++){
            //        sum = sum + i;
            // }
            // System.out.println("total num "+sum);
             sum = n*(n+1)/2;
             System.out.println(sum);

        }    
}
