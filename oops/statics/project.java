// import Encapsulation.demo;

class demo {
        
       static  int a ;
       static  int b;

       int m ;  // instance variable 
       int n ;

       static{    // statics initilization block
         a=10;
         b=20;
         System.out.println("control in static block"+a);

       }

       {       // initilization block
       m=100;
       n=200;
       System.out.println(" control in non statics block"+m);


       }

       static void disp1(){
        //  System.out.println("var of  static var " + a);
        //  System.out.println("var of  static var " + b);
        //😈 System.out.println(m);// it show eror non statics variabkle , it need to first crteate an object 
       }

       void disp2(){
        //   System.out.println(" var of non-static var/ instance var " +m);
        //   System.out.println(" var of non-static var/ instance var " +n);
        //😈 System.out.println("non-static method with static variable "+a); it is possible , static variable should nbot need to create an obj
       }

  }






public class project {
     public static void main(String[] args) {
           demo.disp1();
        demo  d = new demo();
           d.disp2();
     }
}
