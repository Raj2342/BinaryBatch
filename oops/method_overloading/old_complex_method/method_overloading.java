/* old method-  complicated 
  main method me call karte time infinte parameter assign  kar sakte ho  but dusre method ke 
  parameter different hone chaiye and  method name bhi diffrent  
  problem:: 
    call  many times same code in main method  
 */
  class calculation {

        public static int  sum(int a, int b){
             int result = a+b;
             return result;
        }

        public static int  sum1(int a, int b , int c){
          int result = a+b + c;
          return result;
     }
  }


 public class method_overloading {
         
     public static void main(String[] args) {
           calculation addtion = new  calculation();
            System.out.println(addtion.sum(3,4));
            System.out.println(addtion.sum1(3,4 ,6));
           
     }
}
