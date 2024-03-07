
public class Innerrough {
   
       private int age;
       private String name ;
       
       Innerrough(int age , String name){
            this.age = age;
            this.name = name;
       }
      
      
       public int getAge() {
            return age;
      }
     
      public String getName() {
            return name;
      }

      public void result(){
            System.out.println("this is a result "+age + name);
      }
     
      
}

public class rough {
       
         public static void main(String[] args) {
           
            Innerrough n1 = new Innerrough(3,"raj");
            n1.result();
           int st = n1.getAge();
           System.out.println(st);


       }
}
