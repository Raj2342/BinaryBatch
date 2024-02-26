package Encapsulation;
 
    // 😈😈 outer world no one can access directly in  main method  -- so use privte in variable 



class Student 
 {
    // knows/ variable 
// concept-1
    //  int age ;
//   String name;
    
    
    // concept-2
    private int age ;
    private  String name;
 
    public void setData(){
       //🎃🎃 im concept
        age = 14;   //   ess world ka koi bhi  proivate method  ess ko call kar sakte hai 
        name = "Mohan Kumar";
    }

    // do's/method
    public void show()
    {
        // age=2;
        // name = " mohan";
        System.out.println(name + " " + age);
  
    }
 }


public class Encapsulation {
       public static void main(String[] args) {
         Student obj = new Student();
        //   🎃🎃 concept-1
         //  age=2;   if we write as it show error it need to take refrenece  of object 
        // obj.age= 18;   // we can not assign value in variable it is outer world  it show error 
        // obj.name = " mohan kUmar ";

        //  concept-2
        obj.setData();
         obj.show();

       }

}
