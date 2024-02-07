package Encapsulation;
     class student{
            private int age ; 
            private  String name ;

            public void setdata1( int age)
            {
    //  age  store in  s obj , this.age is  trate as instance variale             
                 this.age =  age;

            }

          public void setdata2( String name)
          {
              this.name = name;

          }

          public void  result()
          {
               System.out.println( age + " " + name);
          }

           
     } 
  
  
 //  outer world 
class  soln_Shadowing_prob{
    public static void main(String[] args) {
     student s1 = new student();
     student s2 = new student();
    
         s1.setdata1(12);
         s2.setdata1(19);
         s1.setdata2("mohan");
         s2.setdata2("kumar");
         s1.result();
         s2.result();
         
    }
  }