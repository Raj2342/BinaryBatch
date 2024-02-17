 class animal {
    // when class loading  memory will create , it will create one time memory 
        static int  a;
        static int  b ;
   // problem - memory creating when object create  , non static it will crate lot of memory 
        int m  ; 
        int n;

         static
         {
              a = 10;
              b= 20;
            //   System.out.println(" this is static block " + m + " " +n); // wrong 
              System.out.println(" this is static block " + a + " " +b);  // right  
         }

         {
            m = 15;
            n= 20;
            System.out.println(" this is non- static block " + a + " " +b); //  right
            System.out.println(" this is non- static block " + m + " " +n); //  right 
         }

         static void eat(){
             System.out.println("  static mehtod ");
         }

          void play(){
            System.out.println(" non static method ");
          }




 }




public class rough {
       
    
        public static void main(String[] args) {
              // call static method  
              animal.eat();
              // call non static method 
              animal obj = new animal();
              obj.play();

        }
}
