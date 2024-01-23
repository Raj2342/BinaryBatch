public class  pattern_programming{
       
    public static void main(String[] args) {
           
        //question-1 
// * * * * * * 
// * * * * * *
// * * * * * *
// * * * * * *
// * * * * * *
// * * * * * *  
         // for(int i=0; i<=5; i++){
            //     for(int j=0; j<=5; j++){
            //         System.out.print("* ");
            //     }
            //     System.out.println();
            // } 


            //question-2
            // ******
            // *    *
            // *    *
            // *    *
            // *    *
            // ******
        // for(int i=0;i<=5;i++)
        // {
        //     for(int j=0;j<=5;j++)
        //     {
        //         if(i==0 || j==0 || i==5 || j==5){
        //          System.out.print("* ");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }   
    
          // question-3
        //   ******
        //   *    *
        //   ******
        //   *    *
        //   *    *
        //   *    *
        // int n=5;
        // for(int j=0;j<n; j++)
        // {
        //             for(int i=0; i<n; i++)
        //        {
        //            if(i==0||i==(n-1)||j==0||j==(n-1)/2)
         //         {
        //            System.out.print("*");
        //          }
        //           else{
        //             System.out.print(" ");
        //          }
        //        }
        //         System.out.println();
        // }
    
        //  question-4
        // *   *
        // *   *
        // *****
        // *   *
        // *   *
         //    int n=5;
    //     for(int j=0; j<n;j++)
    //     {
    //     for(int i=0 ; i<n; i++){
    //         if(i==0 || i==(n-1) || j==(n-1)/2) 
    //         {
    //             System.out.print("*");
    //         }
    //         else{
    //             System.out.print(" ");
    //         }
    //     }
    //     System.out.println();
    //     }

    
    // question-5
    //  *****
    //    *
    //    *
    //    *
    //  *****
    //    int n=5;
    //     for(int i=0 ; i<n ; i++){
    //         for(int j=0 ;j<n ;j++)
    //         {
    //             if(i==0||i==(n-1)||j==(n-1)/2){
    //                 System.out.print("*");
    //             }
    //             else{
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println();
    //     }

     // question-6
    //  *****
    //  *
    //  *****
    //  *
    //  *****
        // int n=5;
        // for(int i=0 ; i<n ; i++){
        //     for(int j=0 ;j<n ;j++)
        //     {
        //         if(i==0||i==(n-1)||i==(n-1)/2 || j==0){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }
    
    // question-7
    // *****
    // *
    // *****
    // *
    // *
    //   int n=5;
    //     for(int i=0 ; i<n ; i++){
    //         for(int j=0 ;j<n ;j++)
    //         {
    //             if(i==0||i==(n-1)/2 || j==0){
    //                 System.out.print("*");
    //             }
    //             else{
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println();
    //     }
    
            //  hexagonal pattern

        //question-8
        //  ****      
        // *    *
        // *    *
        // *    *
        // *    *
        // ******
        // *    *
        // *    *
        // *    *
        // *    *
        // int n = 11;
        // for(int i=0; i<n; i++)
        // {
        //     for(int j=0; j<n; j++)
        //     {
        //           if(i==0 && j>0 && j <(n-1)/2 || j==0 && i>0 || j==(n-1)/2 && i>0 || i==(n-1)/2 && j<(n-1)/2 ){
        //             System.out.print("*");
        //           }
        //           else{
        //             System.out.print(" ");
        //           }
        //     }
        //     System.out.println();
        // }
            
        // question-9
        // *****      
        // *    *
        // *    *
        // *    *
        // *    *
        // *    *
        // *    *
        // *    *
        // *    *
        // *    *
        // *****
    //      int n = 11;
    //     for(int i=0; i<n; i++)
    //     {
    //        for(int j=0; j<n; j++)
    //         {
    //               if(j==0 || i==0 && j<(n-1)/2 || i>0 && j==(n-1)/2 && i<(n-1) || i==(n-1) && j<(n-1)/2){
    //                 System.out.print("*");
    //               }
    //               else{
    //                 System.out.print(" ");
    //               }
    //         }
    //         System.out.println();
    //     }
    // }


    //   question-10
// *  
// * *
// * * *
// * * * *
// * * * * *
//   m-1
// int n= 4 ; 
// for(int  i=0; i<n; i++){
//     for(int j=0; j<n ; j++){   
//        if(j==0|| i==(n-1)||j==1 && i>0|| j==2 && i>0 && i>1 || j==3 && i>0 && i>1 && i>2 || j==4 && i>0 && i>1 && i>2 && i>3 
//        || j==5 && i>0 && i>1 && i>2 && i>3 && i>4 ||  j==5 && i>0 && i>1 && i>2 && i>3 && i>4 && i>5 || 
//        j==6 && i>0 && i>1 && i>2 && i>3 && i>4 && i>5  && i>6 ||  j==7 && i>0 && i>1 && i>2 && i>3 && i>4 && i>5  && i>6  && i>7
//        ||  j==7 && i>0 && i>1 && i>2 && i>3 && i>4 && i>5  && i>6  && i>7 && i>8  )
//        {
//               System.out.print("*"+ " ");
//        }
//        else{
//         System.out.println(" ");
//        }
//     }
//     System.out.println();
// }

    //   complex struture

    // question-11
    // **********
    // **      **
    // * *    * *
    // *  *  *  *
    // *   **   *
    // *   **   *
    // *  *  *  *
    // * *    * *
    // **      **
    // **********
    // int n=10;
    // for(int i=0; i<n; i++){
    //     for(int j=0; j<n; j++){
    //         if(i==j || i+j==(n-1)|| j==0 || i==0 ||  i==(n-1) || j==(n-1)  ){
    //             System.out.print("*");
    //         }
    //         else{
    //             System.out.print(" ");
    //         }
    //     }
    //     System.out.println();
    // }
              
     // question-12
    //  **********
    //  *  * *   *
    //  * *   *  *
    //  **     * *
    //  *       **
    //  **      **
    //  * *    * *
    //  *  *  *  *
    //  *   **   *
    //  **********
    //    int n=10;
    //  for(int i=0; i<n; i++)
    //  {
    //     for(int j=0; j<n; j++)
    //     {
    //         if (i+j==(n-1)/2 || j-i==(n-1)/2 || i-j==(n-1)/2 || i+j==(n-1 + (n-1)/2) || i==0 || i==(n-1) || j==0 || j==(n-1)) {
    //             System.out.print("*"); // ******* here is my mistake  don't use { " "  } other wise quadilateral cannot create
    //         }
    //         else{
    //             System.out.print(" ");
    //         }
    //     }
    //     System.out.println();
    //  }
    
           //question-13
         //    *******************
        //    ********* *********
        //    ********   ********
        //    *******     *******
        //    ******       ******
        //    *****         *****
        //    ****           ****
        //    ***             ***
        //    **               **
        //    *                 *
        //    **               **
        //    ***             ***
        //    ****           ****
        //    *****         *****
        //    ******       ******
        //    *******     *******
        //    ********   ********
        //    ********* *********
        //    *******************
    //    int n=19;   // imp note take large no otherwise give error
    //    for(int i=0; i<n; i++)     
    //    {
    //     for(int j=0; j<n; j++)
    //     {
    //            if (i==0 && j<=(n-1)/2 || j==0 && i<=(n-1)/2 || i+j<=(n-1)/2 ||    
    //               i==0 && j>=(n-1)/2 || j==(n-1) && i<=(n-1)/2 || j-i>=(n-1)/2 ||
    //                j==0 &&  i>=(n-1)/2 || i==(n-1) &&  j<=(n-1)/2 || i-j>=(n-1)/2 ||
    //                j==(n-1) && i>=(n-1)/2 || i==(n-1 )&& i>=(n-1)/2 || i+j>=(n-1) + (n-1)/2) 
    //            {
    //               System.out.print("*");
    //            }
    //            else{
    //             System.out.print(" ");
    //            }
    //     }
    //     System.out.println();
    //    }
     
        
      // question-14 
    //   *******************
    //   *       ***       *
    //   *      *****      *
    //   *     *******     *
    //   *    *********    *
    //   *   ***********   *
    //   *  *************  *
    //   * *************** *
    //   *******************
    //   *******************
    //   *******************
    //   * *************** *
    //   *  *************  *
    //   *   ***********   *
    //   *    *********    *
    //   *     *******     *
    //   *      *****      *
    //   *       ***       *
    //   *******************
    //   int n=19;
    //    for(int i=0; i<n; i++)
    //    {
    //     for(int  j=0; j<n; j++)
    //     {
    //         if (i+j>=(n-1)/2 && j-i<=(n-1)/2 && i<=(n-1)/2 || i-j<=(n-1)/2 && i+j<=(n-1) + (n-1)/2  && i>=(n-1)/2 || i==0 || i==(n-1) || j==0 || j==(n-1)) {
    //               System.out.print("*");
    //         }
    //         else{
    //             System.out.print(" ");
    //         }
    //     }
    //     System.out.println();
    //    }
    
    
    
    
}

}