public class conclusion_static {
      // instrance variable 
      static int a ;
      // behaviour of class , blurprint 
      static void play(){
        System.out.println(" static is bro ");
      }

      void play2(){
        System.out.println("non-sttaic is bro ");
      }
      int b ;
    public static void main(String[] args) {
          System.out.println(a);
          conclusion_static obj = new conclusion_static();
          play();
          obj.play2();
      }
}
