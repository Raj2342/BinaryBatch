 /**
  * missing_no
  */
 public class missing_no {
     
      public static void main(String[] args) {
            
            int a[] = { 1,2,3,4,6};
            int expected_include_missing_ele = a.length+1;
      // sum of expected array { 1,2,3,4,5,6} = 1+2+3+4+5+6 = 21
            int sumOf_expected_Array_Includeelemnt =  expected_include_missing_ele*(expected_include_missing_ele+1)/2;
     // sum of original array 
          int b =0;
        for(int sum : a){
            b = b+sum;
        }
        System.out.println(b);
        // missing element 
        System.out.println(sumOf_expected_Array_Includeelemnt-b);
            


      }   
    
 }