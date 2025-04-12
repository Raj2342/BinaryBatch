
/*Joseph is learning digital logic subject which will be for his next semester. He usually tries to solve unit assignment problems before the lecture.
 Today he got one tricky question. The problem statement is “A positive integer has been given as an input.
Convert decimal value to binary representation.
 Toggle all bits of it after the most significant bit including the most significant bit. 
 Print the positive integer value after toggling all bits”.
*/

import java.util.Scanner;

public class deci_binary {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter integer value ");
            int n = sc.nextInt();
            int arr[] = new int[1000];

            int count =0;
            while ( n>0) {
                arr[count] = n%2;
                n = n/2;
                count++;
            }
            for(int i=count-1;i>=0;i--){
                   System.out.print(arr[i]);
            }
            
            


        }    
}
