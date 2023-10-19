package operator_loops;
public class ternary_operator {
    public static void main(String[] args) {
        int a=20 ;
        int b=30;
        int c =40;
        // teRnaRy condition
       /*  int Result = (a<b)?a:b;
        System.out.println(Result);*/
        //  ternary conditon  with message showing 
        
      /*  String result = (a>b)?"i am mohan" : "i am sohan" ;
        System.out.println(result);*/

        // ****NESTED ternary CONDITION

       /*  int sum = (a>b)?((b<c)?a:b): ((a<c)?a:b);
        System.out.println(sum); */

        // ***switch case 
      int num = 300;
      switch(num){
       case 100: System.out.println("case1");
       break;
       case 200: System.out.println(" case2");
       break;
       case 300: System.out.println("case3");
       break;
       default: System.out.println(" none of these ");
       break;

      }


    }
}
