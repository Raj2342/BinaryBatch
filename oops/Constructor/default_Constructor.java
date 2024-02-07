package Constructor;
class demo {
     
    private int a;
    private int b;
    
    demo()
    {
        System.out.println(" zero parametrized constructor ");
    }
   
   
    demo(int a , int b)
    {
         this.a = a;
         this.b = b;
    }
    
    public void disp(){
        System.out.println(" hii");
        System.out.println(a);
        System.out.println(b);
    }

}


public class default_Constructor {
   public static void main(String[] args) {
    
       demo d = new demo();
       d.disp();
       demo d1= new demo(10,20);
       d1.disp();

   }

}
