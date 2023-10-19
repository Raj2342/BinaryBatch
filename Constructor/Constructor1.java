package Constructor;
  class student{
      private int age;
      private String  name;
    
  student ( int age , String name )
  {
     this.age = age ;
     this.name = name;
  }


    
    
    public int getAge() {
        return age;
    }

    
   

    public String getName() {
        return name;
    }

    public void result()
    {
        System.out.println(age + " " + name );
    }

        
      
      
     
  }

public class Constructor1 {
         
    public static void main(String[] args) {
        
    student s1 = new student(  20 , " raj " );
    
    s1.result();
    int studSet1 = s1.getAge();
    System.out.println( studSet1);
   

}
  




}
