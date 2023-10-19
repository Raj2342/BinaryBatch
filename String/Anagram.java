package String;
import java.util.Arrays;

public class Anagram {
       public static void main(String[] args) {
         /* 
               String  str1 = "School Master";
               String str2 = "The Classroom";
            //    String str2 = "The Classroom  Mama";

            // step-1 : remove all space in sentance , update str1, and str2
           str1 =  str1.replace(" ", " ");
           str2 =  str2.replace("  " , " ");

        //    step-2: convert into  lowercase / uppercase 

            str1 = str1.toLowerCase();
            str2 = str2.toLowerCase();
            
            // step-3: convert into arry char
        char  []arr1 = str1.toCharArray();
          char  []arr2 = str2.toCharArray();

          // step-4: sorting : sentence are arrange in assending prder like , a , b,c,d,e
          Arrays.sort(arr1);
          Arrays.sort(arr2);

          if(Arrays.equals(arr1, arr2) )
          {
            System.out.println("it is an anagram ");
          }
          else{
            System.out.println(" it is not anagram ");
          }

        */
     
        // program-2
        String str1 = "keep";
        // String str2 = "peekm";
        String str2 = "peek";
        // no need create step-1,2
        // strp-3
        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();
        // step-3 : sorting
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        //step-4: compare 
        if(Arrays.equals(arr1, arr2)){
            System.out.println("string are anagram");
        }
        else{
            System.out.println(" string is not anagram");
        }

       }
}
