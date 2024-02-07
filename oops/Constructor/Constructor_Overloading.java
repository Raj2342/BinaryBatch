package Constructor;

import Encapsulation.demo;

class demo
{
    private   String name ;
    private   int  age ;
   
    // Zero parameteriZed
    demo(){
         name = " mohan";
         age = 39;
    }
        // one  parameteriZed
    demo(String name)
    {
         this.name = name;
         age = 18;
    }

  // two  parameteriZed
    demo(String name , int age)
    {
       this.name = name;
       this.age = age;
    }

    public void disp()
    {
        System.out.println(name  + " " +age );
    }




}

public class Constructor_Overloading {
    public static void main(String[] args) {
        // Zero parameteriZed
        demo d = new demo();
        d.disp();
        // one  parameteriZed
        demo d1 = new demo("Rahul");
        d1.disp();
        // two parameteriZed
         demo d2 = new demo("Rahul" , 19);
         d2.disp();

    }
}
