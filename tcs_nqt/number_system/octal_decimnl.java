import java.util.Scanner;

public class octal_decimnl {
       public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
                 System.out.println("enter the octal no.");
                 int n = sc.nextInt();
                 int placeVAL=1;
                 int ans=0;
                 while (n!=0) {
                       int lastdigi = n%10;
                       ans = ans+ lastdigi*placeVAL;
                       placeVAL=8*placeVAL;

                 }
                 System.out.println(ans);
       }     
}
