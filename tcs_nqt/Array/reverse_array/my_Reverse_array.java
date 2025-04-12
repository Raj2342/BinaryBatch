package reverse_array;
public class my_Reverse_array {
            public static void main(String[] args) {
                        int arr[] = { 8,10,9,4,5};
                        int temp[]=new int[arr.length];
                        int count=0;
                        for(int i=arr.length-1;i>=0;i--){
                                 temp[count] =arr[i];
                                 count++;
                        }
                        
                        for(int i=0;i<temp.length;i++){
                            System.out.println(temp[i]);
                        }
            }
}
