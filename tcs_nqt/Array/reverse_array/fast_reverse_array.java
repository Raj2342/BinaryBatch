package reverse_array;

public class fast_reverse_array {
            public static void main(String[] args) {
                        int[] arr = {10, 20, 30, 40};
                        int n = arr.length;
                
                        int i = 0, j = n - 1;
                        while (i < j) {
                            // Swap arr[i] and arr[j]
                            int temp = arr[i];
                            arr[i] = arr[j];
                            arr[j] = temp; 
                            i++;
                            j--;
                        }
                
                        // Print the reversed array
                        for (int num : arr) {
                            System.out.print(num + " ");
                        }
                    }
}
