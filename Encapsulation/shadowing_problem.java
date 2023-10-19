package Encapsulation;
  class  Student {

       private int age ;
       private String name ;

       public void setData(){

        age = 19;
        name = " raj kumar";
       } 
       
    //    public void setData2( int a , String name){   // concept-1
    //          age = a;
    //          name = name; // it will no effect 

    //    }

    public void setData2( int   age /*instance variable  */){   // concept-2
       /* left-side age : is local variable  */ age = age;  
             

       }


       
       public void show(){
       
        System.out.println(age + " " + name);
       
    }


  }



public class shadowing_problem {
              
     public static void main(String[] args) {
        
        Student obj = new Student();
        Student obj1 = new Student();
             obj.setData();
              obj.show();
            //   obj.setData();
            
           /*  obj1.setData2(3 , "mohan");  // concept-1
              obj1.show();
              */

              obj1.setData2();
              obj1.show();
     }
    
    ; 
}
