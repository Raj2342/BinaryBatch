  class demo {
        static void disp1(){
            System.out.println("it is disp1 static");
        }

         void disp2(){
            System.out.println("it is disp2 non static");
        }
  }


public class statics2 {
        public static void main(String[] args) {
              
            System.out.println("it is main method");
            demo.disp1(); //  static method ko   with obj and without obj call keya jaa sakta hai .
            // demo.disp2(); // it show comiple eror  you can not directly call non-static method you need take refrence of obj
            demo d = new demo(); // creating obj 
            d.disp1();//  call static method
            d.disp2(); //  call non-static method
        }
}
