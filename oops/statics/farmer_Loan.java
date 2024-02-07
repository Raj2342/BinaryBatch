import java.util.Scanner;

class farmer {

   int  principal_amount ;
   float time_duration;
   float  rate_Interest;
   float  simple_Interest;

    void input(){
        Scanner scan = new Scanner(System.in);
        System.out.println("how many amount are required ");
        principal_amount = scan.nextInt();
        System.out.println("how many time duration for return money");
        time_duration = scan.nextFloat();
        rate_Interest = 8.5f;
    }

    void compute(){
        simple_Interest =  (principal_amount*rate_Interest*time_duration)/100f;
    }

    void disp(){
        System.out.println("simple interest is :" + simple_Interest);
    }



}


class farmer_Loan{
    public static void main(String[] args) {
           farmer obj = new farmer();
           obj.input();
           obj.compute();
           obj.disp();

           farmer obj2 = new farmer();
           obj2.input();
           obj2.compute();
           obj2.disp();
    }
}