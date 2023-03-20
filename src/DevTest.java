import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class DevTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String firstName = "";
        String lastName = "";
        firstName = SafeInput.getNonZeroLenString(in, "Enter your first name");
        lastName = SafeInput.getNonZeroLenString(in, "Enter your last name");
        System.out.println("\nYour full name is: " + firstName + " " + lastName);

        System.out.print("Enter your favorite integer: ");
        int favInt = SafeInput.getInt(in, "");

        System.out.print("Enter your favorite double: ");
        double favDouble = SafeInput.getDouble(in, "");

        System.out.println("Your favorite integer is: " + favInt);
        System.out.println("Your favorite double is: " + favDouble);

        int year = SafeInput.getRangedInt(in, "Enter year of birth [1950-2015]: ", 1950, 2015);
        int month = SafeInput.getRangedInt(in, "Enter month of birth [1-12]: ", 1, 12);
        int day = 0;
        switch(month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                day = SafeInput.getRangedInt(in, "Enter day of birth [1-31]: ", 1, 31);
                break;
            case 4: case 6: case 9: case 11:
                day = SafeInput.getRangedInt(in, "Enter day of birth [1-30]: ", 1, 30);
                break;
            case 2:
                    day = SafeInput.getRangedInt(in, "Enter day of birth [1-29]: ", 1, 29);
                break;
            default:
                break;
        }
        int hour = SafeInput.getRangedInt(in, "Enter hour of birth [1-24]: ", 1, 24);
        int minute = SafeInput.getRangedInt(in, "Enter minute of birth [1-59]: ", 1, 59);

        System.out.printf("Your birth date and time is: %d-%02d-%02d %02d:%02d", year, month, day, hour, minute);

        double totalPrice = 0.0;
        boolean hasMoreItems = true;

        while (hasMoreItems) {
            double price = SafeInput.getRangedDouble(in, "Enter the price of your item (between 0.50 and 10.00 dollars): ", 0.5, 10.0);
            totalPrice += price;

            hasMoreItems = SafeInput.getYNConfirm(in, "Do you have more items to checkout? (Y/N): ");
        }

        System.out.printf("The total cost of your items is $%.2f\n", totalPrice);


        String ssnPattern = "^\\d{3}-\\d{2}-\\d{4}$";
        String ssn = SafeInput.getRegExString(in, "Enter your SSN (xxx-xx-xxxx): ", ssnPattern);
        System.out.println("Your SSN is: " + ssn);


        String mNumberPattern = "^(M|m)\\d{8}$";
        String mNumber = SafeInput.getRegExString(in, "Enter your UC Student M number (Mxxxxxxxx): ", mNumberPattern);
        System.out.println("Your M number is: " + mNumber);


        String menuPattern = "^[OoSsVvQq]$";
        String menuChoice = SafeInput.getRegExString(in, "Enter a menu choice (O, S, V, or Q): ", menuPattern);
        System.out.println("Your menu choice is: " + menuChoice);

        in.close();
    }
}

