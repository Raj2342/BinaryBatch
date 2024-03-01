//  print repeated value   

class  duplicate_ele {
    
    
    public  static void   crack(int arr[]  ){
       
        for(int i=0; i<arr.length;i++){
         for(int j=0; j<arr.length-i-1 ; j++){
            
              if(arr[j]> arr[j+1]){
                 int temp = arr[j+1];
                  arr[j+1] = arr[j];
                  arr[j]= temp;
              }

               if (arr[j] == arr[j+1]) {
                 System.out.println(arr[j]);
                 
              }
                
         }
        
        }

//    return arr[j];


}

    
    
    
    public static void main(String[] args) {
        int arr[] = { 8,6,7,8,4,6,9};
        crack(arr);
        // System.out.println(crack(arr));


           
    }
}