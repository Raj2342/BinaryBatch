package ADDElement;
//Adding Element in an array
// [10,20,30,40,50]
import java.util.Scanner;

public class ADD_Element {
            public  static void shifting(int arr[], int addElement , int postion){
                     // add element at postionn 3 
                     // why -postion-1: because it is index 10(0) 20(1) 30(2) 40(3) 50(4)
                     for(int i=arr.length-1;i>postion-1;i--){
                         arr[i]=arr[i-1];
                     }
                     arr[postion-1]= addElement;

                     // print arr 
                     for(int i=0;i<arr.length;i++){
                        System.out.println(arr[i]);
                     }
                
            }
            public static void main(String[] args) {
                        Scanner sc = new Scanner(System.in);
                System.out.println("Enter the length of array");
                int n = sc.nextInt();
                System.out.println("Enter you want add element");
                int addElement = sc.nextInt();
                System.out.println("Enter the postion");
                int  position = sc.nextInt();
                int arr[] = new int[n];
                System.out.println("Enter the array values");
                for(int i=0;i<arr.length;i++){
                        arr[i]=sc.nextInt();
                }
                shifting(arr , addElement , position);
            }
}
