public  class ano {

      public static void main(String[] args) {
             int n=3;
        for(int i=1; i<=n;  i++)
        {
            for(int j=1; j<=n; j++){
            
                 if (j==0 || i==(n) || i-j>=0 )
                  {
                    System.out.print(j );
                     if (j==1) {
                      System.out.println("1");
                     }
                     else if (j>1) {
                       System.out.println("0");
                     }
                  }
                  else{
                    System.out.print(" ");
                  }
            }
            System.out.println();

        }

      }
}