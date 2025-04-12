public class find_smallest_number{
            public static void main(String[] args) {
                        
                        int mini = Integer.MAX_VALUE;
                        int arr[] = { 8,10,5,7,9};
                          int n= arr.length;
                        for(int i=0;i<n;i++){
                                    if(arr[i]<mini){
                                     mini=  arr[i];
                                    }
                                    
                        }
                        System.out.println(mini);
            }
}