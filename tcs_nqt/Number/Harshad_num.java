import java.util.Scanner;

public class Harshad_num {
         public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int originalnum = num;
        int result =0;
        while (num>0) {
            int lastdigit = num%10;
            result = result +lastdigit;
            num = num/10;
        }
        System.out.println("sum of digit"+ " " + result);
        if (originalnum%result == 0) {
            System.out.println("it is harshad num");
        }
        else
          System.out.println("Not harshad num");
         }  
         

}
