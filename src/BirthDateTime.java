import java.util.Scanner;

public class BirthDateTime {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

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


        }
    }

