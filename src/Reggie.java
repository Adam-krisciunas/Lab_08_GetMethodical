import java.util.Scanner;
public class Reggie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
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
