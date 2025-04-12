 import java.util.Scanner;
 
 public class sum_of_cubic{
           
      public static int  brutforce( int n , int m){
             
               int sum =0;
            for(int i=n;i<=m;i++){
                 int term=i;
                 sum = sum + term*term*term;
                 // sum += Math.pow(i,3);
            }
            return sum;
        
      }
      
   public static void  main(String[] args){
     
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      
     

    
       int result = brutforce(  n , m);
       System.out.println(result);
     
   }
 }