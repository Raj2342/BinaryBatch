public class find_largest_number {
            public static void main(String[] args) {
                        // int maxi = Integer.MIN_VALUE;
                        int arr[] = {8,10,5,7,9};
                        int maxi= arr[0];
                        for(int i=0;i<arr.length;i++){
                                    if(arr[i]>maxi){
                                    maxi=arr[i];
                                    }
                        }
                        System.out.println(maxi);

            }
}
