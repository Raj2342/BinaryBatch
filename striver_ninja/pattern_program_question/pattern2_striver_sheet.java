public class pattern2_striver_sheet {
                             
     public static void main(String[] args) {
             
              pattern1(5);
     }

     static void  pattern1(int n ){
               
           for(int i=1; i<=n ; i++){
             for(int j=n; j>=i; j--){
                   System.out.print(j+ " ");
             }
             System.out.println();
           }
     }
}
