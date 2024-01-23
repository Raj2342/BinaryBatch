public class demo {
     public static void main(String[] args) {
              int n=5;
          //     char ch = 'A';
             for(int i=1; i<=2*n-1 ; i++)
             {
               
               for(int  j=1; j<=2*n; j++)
               {
                      if (  j<=i && j<=2*n-i || j>=2*n+1-i && j>=i+1) {
                         
                           System.out.print("*" );
                      }
                    else{
                         System.out.print(" ");
                    }
                  }
                  System.out.println();
                  
             }
     }
}
