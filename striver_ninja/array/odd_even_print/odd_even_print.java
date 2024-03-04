import java.lang.reflect.Array;
import java.util.ArrayList;

class   odd_even_print {

      public static void main(String[] args) {
           
            int a[] =  {8,5,10,12,3,1,4};
              ArrayList<Integer> s1 = new ArrayList<>();
              ArrayList<Integer> s2 = new ArrayList<>();
            //    print  seperate even and odd  array 
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

             // sum of  even array and odd aray  using for each loop

             int SumEven =0;
             int SumOdd =0;

             for(int even : s1){
                  SumEven = SumEven + even;
             }
             
             for(int odd : s2){
                   SumOdd = SumOdd + odd;
                  }
                  
                
                  System.out.println( "sum of even: "+SumEven);
                  System.out.println("sum of odd : "+SumOdd);
                  // how many element  of even
                  System.out.println(s1.size());
                   // how many element  of odd
                  System.out.println(s2.size());

           




      }
}