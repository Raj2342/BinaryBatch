import java.util.Scanner;

public class add_two_fraction {
    // Function to calculate the GCD using Euclid's algorithm
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for first fraction
        System.out.println("Enter the numerator of the first fraction:");
        int n1 = sc.nextInt();
        System.out.println("Enter the denominator of the first fraction:");
        int d1 = sc.nextInt();

        // Input for second fraction
        System.out.println("Enter the numerator of the second fraction:");
        int n2 = sc.nextInt();
        System.out.println("Enter the denominator of the second fraction:");
        int d2 = sc.nextInt();

        // Variables to hold the numerator and denominator of the result
        int num, den;

        // Adding fractions
        if (d1 == d2) {
            num = n1 + n2;
            den = d1;
        } else {
            num = n1 * d2 + n2 * d1;
            den = d1 * d2;
        }

        // Simplifying the result
        int gcdValue = gcd(num, den);
        num /= gcdValue;
        den /= gcdValue;

        // Printing the result
        System.out.println("The result of (" + n1 + "/" + d1 + ") + (" + n2 + "/" + d2 + ") is:");
        System.out.println(num + "/" + den);
    }
}
