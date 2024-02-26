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

    public void setData2( int   age /*local variable  */){   // concept-2
       /* left-side age : is instance varibale   */ age = age;    /* local variable */
             // complier comnfuse ho gya vo dono ko local variable samaj raha hai 

       }


       
       public void show(){
       
        System.out.println(age /* instance variable ki valure print hogi  */);
       
    }


  }



public class shadowing_problem {
              
     public static void main(String[] args) {
        
        Student obj = new Student();
        Student obj1 = new Student();
            //  obj.setData();
            //   obj.show();
            //   obj.setData();
            
           /*  obj1.setData2(3 , "mohan");  // concept-1
              obj1.show();
              */

              obj1.setData2( 17);
              obj1.show();
     }
    
    ; 
}
