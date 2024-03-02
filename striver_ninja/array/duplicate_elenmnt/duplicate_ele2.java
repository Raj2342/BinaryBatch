// it will not print repeated value 

public class duplicate_ele2 {
      
    public  static void   bubleSort(int arr[]  ){
       
        for(int i=0; i<arr.length;i++){
         for(int j=0; j<arr.length-i-1 ; j++){
            
              if(arr[j]> arr[j+1]){
                 int temp = arr[j+1];
                  arr[j+1] = arr[j];
                  arr[j]= temp;
              }
            }
        }
    }

    public  static void   duplicate(int arr[]  ){
                
             for(int i=0; i<arr.length-1;i++){
                if (arr[i]==arr[i+1]) {
                    System.out.println(arr[i]);
                    // it is use print first dulplicate array 
                    // break;
                }
             }
    }

              
                
   
    
    
    
    
    public static void main(String[] args) {
        int arr[] = { 8,6,7,8,4,6,9};
        bubleSort(arr);
        duplicate(arr);
        // System.out.println(crack(arr));


           
    }
}
