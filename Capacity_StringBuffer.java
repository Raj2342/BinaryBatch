
public class Capacity_StringBuffer {
      public static void main(String[] args) {
         /* 
             StringBuffer sb = new StringBuffer();
                System.out.println( " total capacity of sting buffer :"+sb.capacity());
             sb.append("abcdefghijklmnop"); // 16 capacity 
             System.out.println(" string character :"+sb);
             System.out.println(" lenght of char in  string character  "+ sb.length());
             System.out.println("total capacity of  string character  :"+sb.capacity());
             sb.append("s"); // increase capacity of string 16 --> 17 capacity  use frmula
             System.out.println("One string character  incereses :"+sb);
             System.out.println( " length of out of the box char in string charater  : " + sb.length());
              System.out.println(" capacity of out of the box capacity of string character : "+sb.capacity());
           */
          
        //   case-1 :   if not use append direct string  will assign in constructor 
         //  StringBuffer sb = new StringBuffer("mohanDas");
         // System.out.println(sb.capacity());
         // sb.setCharAt(1,'S');
         // System.out.println(sb);
      

        // **** increase and decrease capacity of StringBuffer
        // ***************StringBuffer sb = new StringBuffer(capacity)***********
        StringBuffer sb = new StringBuffer(150);
      //   System.out.println("self made capacity :"+sb.capacity());
        sb.append("java");
        sb.trimToSize();
        System.out.println("it decrease  capacity using property "+sb.capacity());



      }
}
