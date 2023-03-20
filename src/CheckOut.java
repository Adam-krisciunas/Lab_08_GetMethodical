import java.util.Scanner;
public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double totalPrice = 0.0;
        boolean hasMoreItems = true;

        while (hasMoreItems) {
            double price = SafeInput.getRangedDouble(in, "Enter the price of your item (between 0.50 and 10.00 dollars): ", 0.5, 10.0);
            totalPrice += price;

            hasMoreItems = SafeInput.getYNConfirm(in, "Do you have more items to checkout? (Y/N): ");
            System.out.printf("The total cost of your items is $%.2f\n", totalPrice);
        }
    }
}