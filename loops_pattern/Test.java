

class Test {
    // INSTANCE VARIABLE  
    int a = 3; 
    String  name = " mohan "  ;
    
    public static void main(String[] args) {
         // LOCAL VARIABLE 
        int num = 9 ;
        // CREATE OBJ
        Test obj1 = new Test();
        Test obj2 = new Test();
        obj1.name = " sampoo bahaoo";
          
        // PRINT INSTANCE VARIABLE 
      System.out.println(obj1.name );
      System.out.println(obj1.a );

    //   second object 
    System.out.println(obj2.name );
      System.out.println(obj2.a );
        

     }


}