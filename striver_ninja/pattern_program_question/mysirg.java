public class mysirg {
       
     public static void main(String[] args) {
                // int n= 3;
             for(int i=0; i<6;i++){
                
                 for(int j=0; j<5; j++){                               
                  //  if (i+j>=(2*n)/2 && j-i<=(2*n)/2  && i<=(2*n)/2 || i-j<=(2*n)/2 && i+j<=(2*n)/2 + (2*n) && i>=(2*n)/2 ) {
                  //  if (i+j>=(2*n)/2 && j-i<=(2*n)/2  && i<(2*n)/2 || i-j<=(2*n)/2 && i+j<=(2*n)/2 + (2*n) && i>(2*n)/2  ) {
                    if (j>=4-i && j<=2+j /*&& j>=i-3 && j<= 9-i*/) {
                      
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
