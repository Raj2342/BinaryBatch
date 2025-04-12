import java.util.Scanner;

public class item_avg_total_selling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int maxCost = 0;
        String maxCostItem = "";
        double totalPrice = 0;
        double avg = 0;

        for (int i = 0; i < n; i++) {
            String item = scanner.next();
            int quantity = scanner.nextInt();
            int price = scanner.nextInt();

            int cost = quantity * price;
            totalPrice += cost;

            // Corrected max cost logic
            if (cost > maxCost) {
                maxCost = cost;
                maxCostItem = item;
            }

            avg = totalPrice / (i + 1);
        }

        System.out.printf("Task 1 - Item: %s\nTotal price: %.2f\nAverage Price: %.2f\n", maxCostItem, totalPrice, avg);

        scanner.close();
    }
}
