 class   rought{
      
   public static int  sum(int n){
      int value = 0;
    for( int i=1; i<=n; i++){
         
        value += i;
    }
    return value;
   }
   
    public static void main(String[] args) {
            int n=5;
            
            System.out.println(sum(n));
      }
 }