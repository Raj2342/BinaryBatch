package Assignment;
  // Q:  Write a Program  to delete   all consonants  from the string  “ hello  , 
  //have a  good day “ .


public class feb_4 {
            
    public static void main(String[] args) {
        String str = " hello  , have a  good day   ";
        String bro =removeAllConsonent(str);
        System.out.println(bro);

    }

    public  static String removeAllConsonent(String raju){
        String consonent = "[ bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ]";
        String result = raju.replaceAll(consonent," ");
        return result;
    }
}
