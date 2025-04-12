import java.util.Arrays;

public class Second_Smallest_Largest {
            public static void main(String[] args) {
                        int arr[] = {8,10,5,7,9};
                        int maxi = Integer.MIN_VALUE;
                        int mini = Integer.MAX_VALUE;
                        int Secondmax = Integer.MIN_VALUE;
                        int Secondmin = Integer.MAX_VALUE;
                        for(int i=0;i<arr.length;i++){
                                    if (arr[i]>maxi) {
                                         maxi=arr[i];       
                                    }
                                    if(arr[i]<mini){
                                                mini= arr[i];
                                    }
                        }
                        System.out.println(maxi+" "+ mini);

                        for(int i=0;i<arr.length;i++){
                             if(mini<arr[i] && arr[i]< Secondmin){
                                    Secondmin = arr[i];
                             }
                             if(maxi>arr[i] && arr[i]>Secondmax){
                                    Secondmax = arr[i];
                             }
                        }
                        System.out.println(Secondmin+" "+Secondmax);
                         
            }
}
