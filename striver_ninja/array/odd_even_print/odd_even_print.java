import java.lang.reflect.Array;
import java.util.ArrayList;

class   odd_even_print {

      public static void main(String[] args) {
           
            int a[] =  {8,5,10,12,3,1,4};
              ArrayList<Integer> s1 = new ArrayList<>();
              ArrayList<Integer> s2 = new ArrayList<>();
              //for sum odd and event no.
              

              for(int i=0; i<a.length;i++){
                 if (a[i]%2==0) {
                      s1.add(a[i]);
                      
                 }
                 else{
                    s2.add(a[i]);
                 }
              }

              System.out.println(s1);
             System.out.println(s1.size());
             System.out.println(s2);
             System.out.println(s2.size());

             // add even array and odd aray 

            //  int evenSum = sumArray(s1); 




      }
}