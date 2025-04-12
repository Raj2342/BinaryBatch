import java.util.Scanner;

     
public class fabonacci_series {
           
            public static int fabonacci(int n){
                    // n = 0,1,1,2,3,5,8,13.....
                    if(n == 0 || n==1){
                      return n;
                    }
                    else{
                     return   fabonacci(n-1)+ fabonacci(n-2);
                    }
                    
            }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Number ");
            int n = sc.nextInt();
            
            for(int i=0; i<=n;i++){
                        System.out.print(fabonacci(i)+" ");
            }
                       
        }    
}
