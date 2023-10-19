package String;

public class palindrom_program {
      public static void main(String[] args) {
           String str1 = " RAR";
           String str2 = " ";
             for(int i=str1.length()-1; i>=0;i-- )
             {
                str2 =  str2 + str1.charAt(i) ; 
             }
              System.out.println(str1);
              System.out.println(str2);
              // if(str2.equals(str2))
              if(str1.equals(str2))
              {
                System.out.println(" given string is palindrom");
              }
              else
              {
                System.out.println(" given string is  not palindrom");

              }
      }
}
