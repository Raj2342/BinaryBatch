package Encapsulation;
     class student{
            private int age ; 
            private  String name ;

            public void age( int age)
            {
// right side  is traeated as local variable  and give first prefrence to local variable 
                  age =  age;

            }

          public void name( String name)
          {
               name = name;

          }

          public void  result()
          {
               System.out.println( age + " " + name);
          }

           
     } 
  
  
 //  outer world 
class  my_Shadowing_prob{
    public static void main(String[] args) {
     student s = new student();
         s.age( 23);
         s.name("Raj");
         s.result();
         
    }
  }