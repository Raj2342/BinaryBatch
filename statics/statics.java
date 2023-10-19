
public class statics {
        //  static variable 
        static int age ;
        // statics block
        static {
           age = 18;
           System.out.println("staic block first  excute");
        }

     static  void disp(){
              System.out.println(" disp run  where call in main method ");
        }

    public static void main(String[] args) {
         disp();
            System.out.println("main method second execute ");
       }
}
