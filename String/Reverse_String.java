package String;


public class Reverse_String {
    public static void main(String[] args) {
        //  case-1
        /*  
       String   str1 = " PWSKILLS";
       String str2 = "";
       for(int i=str1.length()-1; i>=0; i--){
        str2 =   str2 + str1.charAt(i);
       }
       System.out.println(str2);
      */
    //   case-2
   /*  String  str1 = " PWSKILLS JAVA";

    String  str2 =  " ";
     String  srr[] = str1.split(" ");
     for(int i=srr.length-1; i>=0; i--)
     {
        str2 = str2 + srr[i] + " ";
     }
     System.out.println(str2);
    
     */
     // case-3
    /*  String str1 = " PWSKILL JAVA";
     String str2 = " ";

     for(int i=str1.length()-1; i>=0; i--)
     {
        str2 = str2 + str1.charAt(i);
     }
     System.out.println(str2);

     */

     // case-4
     String str1 = " PWSKILLS JAVA ";
     String str2 = " ";
     String srr[] = str1.split("   ");
   //   for( int i=0 ; i<srr.length; i++) //donot use for loop in this CASE WE CANNOT FIND STORGE OF 
      for( String elem: srr) // this loop start from 0 to 1
     {
        for( int i=elem.length()-1; i>=0; i-- )
        {
                 str2 = str2 + elem.charAt(i);
        }
        str2 = str2 +" ";
   }
   System.out.println(str2);
   System.out.println(str1);


    }
       
}
