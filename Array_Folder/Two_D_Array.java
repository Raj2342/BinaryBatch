package Array_Folder;


public class Two_D_Array {
      public static void main(String[] args) {
         
       /* 
           // 2d array create hone ke baad ( pattern create hone ke badd) value create  assign ki gayi    
      int arr[][] = new int[3][4];
    arr[0][0]= 5;
    arr[0][1]= 6;
    arr[0][2]= 7;
    arr[0][3]= 2;
    arr[1][0]= 3;
    arr[1][1]= 5;
    arr[1][2]= 6;
    arr[1][3]= 9;
    arr[2][0]= 9;
    arr[2][1]= 6;
    arr[2][2]= 3;
    arr[2][3]= 9;
    for(int i=0; i<=2; i++){
        for(int j=0; j<=3; j++){
            System.out.print(arr[i][j]);
        }
        System.out.println("");
    }
        */



        // agr pahele se he value dalni ho tab ka case 
        // int nums[][] = {

        //         { 5 /* j=0 */,6 /* j=1 */} ,  // i=0
        //         {7 /* j=0 */,8 /* j=1 */},  // i=1
        //         {9 /* j=0 */,3 /* j=1 */}  // i=2

        //             };
                    
        //             for(int i=0; i<3; i++)
        //             {
        //    for( int j=0; j<2; j++)
        //    {
        //      System.out.print(nums[i][j] +"  ");
             
        //     }
        //     System.out.println();
            
        //   }
          

                
        // jagged arrays :  no. of  row  fixed  but not  coloumn
          // method-1 of jagged arrays
                //      int nums[][] = {

                // { 5,6 ,3,6} ,
                // {7,8},
                // {9,3 ,6}

                //     };  
                
          
                // if row and colum not equal use pattern create hone ke baad value apply 
       
                //       int nums[][] = new int[3/* row are fixed */][/* coloum not fixed  */];
            //  ********no. of coloumn kitne hai 
                //   nums[0/* row 0 */] = new int [4 /* colomun */]; /* lenght of row0 */
        //       nums[1] = new int [2 /* coloumn */];  /* lenght of row0 */
        //       nums[2] = new int [3 /* colomn */];   /* lenght of row0 */
           //  ********  assign avlue in row and coloumn both 
        //   nums[0][0] = 5;
        // nums[0][1] = 6;
        // nums[0][2] = 7;
        // nums[1][0] = 8;
        // nums[1][1] = 9;
        // nums[2][0] = 3;
        // nums[2][1] = 10;
        // nums[2][2] = 11;
             

              
      //         for(int i=0; i<3; i++)
      //        {
      //      for( int j=0; j<nums[i].length; j++)
      //      {
      //        System.out.print(nums[i][j] +"  ");
             
      //       }
      //       System.out.println();
        
      // }
       
       
      // enhanced for loop  : reduced complexity
       // 1-D
      /*  
      int nums[] = { 1,2,3,4,5};
      for( int n : nums){
        System.out.println(n);
      }
      */
    
    //  2-D
   /*     int nums[][] = {

                { 5,6 ,3,6} ,// {}, {} , {} it is treat as element - 3 element 
                {7,8 ,4,5},
                {9,3 ,6 ,2}

                    };  
            for(int  a[] : nums) // a[] = { 5,6,3,6}
             {
           for( int b : a)
           {
             System.out.print(b + " ");
             
            }
            System.out.println();        


      }



    */

    int arr[] = { };
    System.out.println(arr.length);
}

}
