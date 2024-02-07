import javax.print.DocFlavor.STRING;

class instance_variable /* animal */{

   // instance variable 
      String name = " raj";
      int age ;
      
     // static 
    public static void main(String[] args) {
             
        // local variable 
        int a  ;
        instance_variable obj1 /* dog */ = new instance_variable();
        instance_variable obj2 /* cat */ = new instance_variable();

        // update name 
          obj1.name = " sohan";
          // print 
        System.out.println(obj1.name);
        System.out.println(obj2.name);
        // instance variable have default value but local variable didnot default value
        System.out.println(obj1.age);
        

   
    }

 } 