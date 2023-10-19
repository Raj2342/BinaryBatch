package Assignment;
// q-1  passig stirng in method as argument 
 /* 
   public class PassStrInMethod_Argus {
              
       public  static void  myMethod(String fname){
           
          System.out.println(" my name is :"+ fname);
       
     }
     public static void main(String[] args) {
           
        myMethod("raj");
        myMethod("mohan");
    }
          
}
*/

// Q-2: 
 public class PassStrInMethod_Argus{
    
    public  static void change( String s)
    {
    //    System.out.println(" weak bro " + s);
       String str =  s.concat("_Morning");
       System.out.println(str);

    }
    
    public static void main(String[] args) {
    // StringBuilder sb = new   StringBuilder("good");
       change("good   ");
    
    }
 }