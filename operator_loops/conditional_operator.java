package operator_loops;
public class conditional_operator {
    public static void main(String[] args) 
    {
        int age = 20;

        // **** if else condition

        // if(age>10 && age<15){
        //  System.out.println(" elligible  going scgool");
        // }
        // else if (age>15 && age<21)
        // {
        //      System.out.println(" elligible   12th exam ");

        // }
        // else if (age>22 || age<30)
        // {
        //   System.out.println(" goo  for placement ");
        // }

        // else
        // {
        //     System.out.println(" nothing will happen ");
        // }

        // nested  condition 
        if( age > 10 && age <20)
        {
            if(age>=10 && age<13)
            {
                System.out.println("i am out");
            }
            else if (age>=13 && age<18)
            {
                System.out.println("i am not cauj");
            }
            else if( age>=18 && age<=20)
            {
                System.out.println("finally ");
            }
            else{
                System.out.println(" dhfhud");
            }
        }
        else if  (age>20 && age<40 )
        {
           if(age>=20 && age<30)
           {
            System.out.println("hfhbdj");
           }
           else if (age>=30 && age<40)
           {
            System.out.println("sdkd ");
           }
           else{
            System.out.println("kdfjk");
           }

        }

        else if (age>40 && age <70)
        {
         System.out.println(" jsdjlsijhjf");
        }
        else{
     System.out.println(" dkjf kjdnfk");
        }
        
        
    }
}
