public class ApproachTWO {
          
    public static  int[]  play(int n , int arr[]){
        
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1;j++){
                if (arr[j]>arr[j+1]) {
                       int temp = arr[j+1];
                       arr[j] = temp;
                       arr[j+1]= arr[j];
                }
            }
        }
         int ohm1 = arr[arr.length-2] ;
         int ohm2 =  arr[1] ;
        
        return  new int[] {ohm1 ,ohm2};  

         
      }

      public static void main(String[] args) {
            int arr[] = { 2,4,5,6,7};
          int n=6;
          System.out.println(play(n, arr));
      }
}
