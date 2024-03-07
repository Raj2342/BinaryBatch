public class Constructor2 {
       // default constructor
    //    int i;
      
    // user-defined , non parameterZed 
     /*  Constructor2(){
        System.out.println("it is non-parameterZed ");
       }
      */
      
      // parameteriZed 
      Constructor2(int a , String s){
       
        System.out.println(a);
        System.out.println(s);

      }
      
      public static void main(String[] args) {
        Constructor2 c1 = new Constructor2(23, "mohan");
        // System.out.println(c1.i);  
           
      }
}
