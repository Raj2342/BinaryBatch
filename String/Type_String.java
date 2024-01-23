package String;



public class Type_String {
       public static void main(String[] args) {
        /*  
        String  brand = " remo";
         System.out.println(brand);
           // In string changes nahi ho stakta  
         //   brand = "  mohan";
         brand.concat("banguluru");

         StringBuilder   brand1 =  new StringBuilder(" veer");
         System.out.println(brand1);
         //  changes is possible in sttringbuikldedr 
         brand1.append("singh");
          System.out.println(brand1);
        */
   
          // inside   " string constant pool"
      //  String  refValriable =  " pw"; 
      //  String  refValriable1 =  " pw"; 
      // System.out.println(refValriable == refValriable1);

      //  in heap but outside the scp  -- diference btw obj of string and  stringbuilder
    //  String  refvariable2 = new String("pwskills");
    //    refvariable2.concat("rajkumar");
    //    System.out.println(refvariable2);

     StringBuffer  refvariable2 = new StringBuffer("pwskills");
       refvariable2.append("rajkumar");
       System.out.println(refvariable2);
    //  String  refvariable3 = new String("pwskills");
    //  System.out.println(refvariable2 == refvariable3);
    
       }
}
