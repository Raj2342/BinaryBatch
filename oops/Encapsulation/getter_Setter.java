package Encapsulation;

     class student{
            private int age ; 
            private  String name ;

            public void setAge( int age)
            {
    //  age  store in  s obj , this.age is  trate as instance variale             
                 this.age =  age;

            }
            //   get method 
            public int getAge(){

                 return age;
            }

          public void setName( String name)
          {
              this.name = name;

          }
            //   get method 
            public String  getName(){

                 return name;
            }

          public void  result()
          {
               System.out.println( age + " " + name);
          }

           
     } 
  
  
 //  outer world 
class  getter_Setter{
    public static void main(String[] args) {
     student s1 = new student();
     student s2 = new student();
    
         s1.setAge(12);
         s2.setAge(19);
         s1.setName("mohan");
         s2.setName("kumar");
         s1.result();
         s2.result();
         
        //  Get method
        int Stud1Age = s1.getAge();
        String Stud1Name = s1.getName();
        System.out.println(Stud1Age);
        System.out.println(Stud1Name);

         
    }
  }