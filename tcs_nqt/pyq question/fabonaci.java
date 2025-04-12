
    // 0 1 1 2 3 5 8
public class fabonaci {

            public  static int fabonaci(int n){
                        int prev=1;
                        int prev2 =0;

                        if(n==0){
                           return prev2;
                        }
                        if (n==1) {
                               return prev;     
                        }
                        int fibsum =prev+prev2; // sum of first two term 
                        for(int i=2;i<n;i++){
                                 int cur = prev+prev2;
                                  fibsum = fibsum+cur;
                                   prev2=prev;
                                   prev=cur;
                        }

                        return fibsum;
            }
            public static void main(String[] args) {
                        int n = 5;
                     int result =   fabonaci(n);
                     System.out.println(result);
            }
}
