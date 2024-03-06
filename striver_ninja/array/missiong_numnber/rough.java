public class rough {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 6, 3, 7, 8};

        int n = array.length + 1; // Number of elements including the missing one
        int xorAll = 0;
        int xorExpected = 0;

        // XOR all elements in the array
        for (int i = 0; i < array.length; i++) {
            xorAll ^= array[i];
        }
        System.out.println(xorAll);

        // XOR all expected elements (1 to n)
        for (int i = 1; i <= n; i++) {
            xorExpected ^= i;
        }

        // XOR the results to find the missing element
        // int missingElement = xorAll ^ xorExpected;

        // System.out.println("Missing Element: " + missingElement);
    }
}
