

  class raj {

       public static  void calc(int a){
         System.out.println("int "+a);
       }

    public static  void calc(byte a){
        System.out.println("byte "+a);
      }

      // public static  void calc(short a){
      //   System.out.println("short "+a);
      // }

       public static  void calc(double a){
        System.out.println("double "+a);
      }

      // public static  void calc(char a){
      //   System.out.println("char "+a);
      // } 

        // A method that accept object as parameter
    public static void calc(Object o)
    {
        System.out.println("Object method called");
    }

      


  }


public class promotion_overload {
         
         public static void main(String[] args) {
              
               raj obj = new raj();
              //  byte b = 6;
                // char
              obj.calc('f');
              // int 
              obj.calc(4);
              // float 
              obj.calc(4.0f);
              // method call with a string as parameter
             obj.calc("Geeks for Geeks");


         }
        
}
