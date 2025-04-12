/* Count frequency of each element in an array
Example 1:
Input: arr[] = {10,5,10,15,10,5};
Output: 10  3
	    5   2
        15  1
Explanation: 10 occurs 3 times in the array
	      5 occurs 2 times in the array
              15 occurs 1 time in the array
*/
import java.util.HashMap;

public class Count_frequency_element {
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 20, 10};

        HashMap<Integer, Integer> hp = new HashMap<>();

        // 👇 This line does counting in a cleaner way using getOrDefault
        for (int num : arr) {
            hp.put(num, hp.getOrDefault(num, 0) + 1);
        }

        // ✅ Print the frequency in desired format
        for (int key : hp.keySet()) {
            System.out.println(key + "  " + hp.get(key));
        }
    }
}

 