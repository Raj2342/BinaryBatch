import java.lang.foreign.ValueLayout;
import java.util.Scanner;

public class number_word {
      public static void main(String[] args) {
              Scanner sc = new Scanner(System.in);
                 System.out.println("enter the any  digit");
                 int n = sc.nextInt();

                 if( n == 0){
                  System.out.println("zero");
                 }

                 // words for number 0 to 19
                 String unit[] = {
               "",        "One",       "Two",      "Three",
            "Four",    "Five",      "Six",      "Seven",
            "Eight",   "Nine",      "Ten",      "Eleven",
            "Twelve",  "Thirteen",  "Fourteen", "Fifteen",
            "Sixteen", "Seventeen", "Eighteen", "Nineteen"

                 };
            
                 // words for  number multiple of 10
                 String tens[] = {
                  "",     "",     "Twenty",  "Thirty", "Forty",
                  "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" 
            
                 };

                 String multiplier[] = {
                "", "Thousand", "Million", "Billion"
                 };
            String res = "";
            int group =0;

            // process number in group of 1000s

            while (n>0) {
                  if(n%1000 != 0){
                        int value = n%1000;
                        String temp = "";

                        // handle 3 digit number 
                        if(value >=100 ){
                              temp = unit[value/100] + " Hunderd";
                               value = value%100;
                        }

                        //  handle 2 digit number
                        if(value >= 20){
                              temp += tens[value/10]+ " ";
                              value = value %10;
                        } 

                        //  handle 2 digit number
                        if( value > 0 ){
                              temp = temp + unit[value]+ " ";

                        }

                        // add the multiplier according to the 

                        temp = temp + multiplier[group] + " ";

                        // add this group result to overall result 
                        res = temp + res;
                  }

                  n = n / 1000;
                  group++;
            }

            // remove trailing space 
            res.trim();
            System.out.println(res);


      }      
}
