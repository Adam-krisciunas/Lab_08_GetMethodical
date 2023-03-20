import java.util.Scanner;
public class FavNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your favorite integer: ");
        int favInt = SafeInput.getInt(in, "");

        System.out.print("Enter your favorite double: ");
        double favDouble = SafeInput.getDouble(in, "");

        System.out.println("Your favorite integer is: " + favInt);
        System.out.println("Your favorite double is: " + favDouble);
    }
}