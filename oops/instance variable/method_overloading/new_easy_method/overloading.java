/* new  and esay method :: 
  main method me call karte time infinte parameter assign  kar sakte ho  but dusre method ke 
  parameter different hone chaiye 

  benefit: call only once  
  
 */

class calculation{
     public static int  sum(int a , int b ){
            int result = a+b;
            return result;
     }

     public static int  sum(int a , int b , int c ){
      int result = a+b;
      return result;
   }

   public static int  sum(int a , int b , int c , int d ){
    int result = a+b;
    return result;
}
     
public static double  sum(double a , double b  ){
  double result = a+b;
  return result;
}
}


 class overloading {
     
    public static void main(String[] args) {
      calculation addition = new calculation();
      System.out.println(addition.sum(2, 3,5,7));
      // for decimal 
      System.out.println(addition.sum(2.9, 3.6 ));
    }
}