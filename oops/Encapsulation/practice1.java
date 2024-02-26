
 class Student {
         
      private String  name = " sohan" ;
       private  int age  = 17;
      
       public void setdata( int age ){
            // name = " raj";
            age = age; // complier  soch raha hai ye dono local variable hai 
       }

      
     
      public void show(){
         System.out.println( age); // instance variable 
       }
 }




public class practice1 {
          
       public static void main(String[] args) {
            
             Student obj = new Student();
             Student obj1 = new Student();
            //  obj.setdata(18); 
             obj1.setdata(25);
            // obj.setdata();
            obj.show();
            // obj1.show();
       }
}
