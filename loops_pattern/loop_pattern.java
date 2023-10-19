

import java.util.Scanner; // it is imortant writing this  when use Scananer class 

public class loop_pattern {
    public static void main(String[] args) {
       Scanner scan =  new Scanner(System.in);
       // input age 
        System.out.println(" enter your age");
      int age = scan.nextInt();
      System.out.println("thnka your age is "+age);
      
      // intput name 
      System.out.println("entger  your name ");
      String name = scan.nextLine();
      System.out.println(" your  name is " + name);

      // input double value 
      System.out.println(" enter the avg");
      double avg = scan.nextDouble();
      System.out.println( " your  value is " + avg);

    }
}
