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
            demo.disp1(); // 
            // demo.disp2(); // it show comiple eror  you can not directly call non-static method you need take refrence of obj
            demo d = new demo(); // creating obj 
            d.disp1();
            d.disp2();
        }
}
