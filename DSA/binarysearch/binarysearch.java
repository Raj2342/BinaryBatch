class  binarysearch {

      public static int   play( int arr[] , int target){
          
        int i=0;
        int  j= arr.length-1;
        
        
        while (i<=j){
           float   mid = (i+j)/2;
           int b ;
         b = (int)mid;
           if (arr[b]==target) {
               return b;
           }
           else if(arr[b]>target){
             j= b -1;

           }
           else {
             i = b +1;
           }

        }

        return -1;
        
         
        }    
    public static void main(String[] args) {
           
        int arr[] = { 2,3,4,5,6,7};
          int target = 6;
        //   System.ou(play(arr, target));
        
        System.out.println(play(arr, target));

    }

}