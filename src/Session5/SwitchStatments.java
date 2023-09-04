package Session5;

import java.util.Scanner;

public class SwitchStatments {

    public static final int Monday = 1;
    public static final int Tuseday = 2;
    public static final int Wednesday = 3;
    public static final int Thursday = 4;
    public static final int Friday = 5;
    public static final int Saturday = 6;
    public static final int Sunday = 7;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number (1-7) for the day of the week ");
        int day = scanner.nextInt();

        switch (day) {
            case Monday:
                System.out.println("Monday");
                break;
            case Tuseday:
                System.out.println("Tuseday");
                break;
            case Wednesday:
                System.out.println("Wednesday");
                break;
            case Thursday:
                System.out.println("Thursday");
                  break;
            case Friday:
                System.out.println("Friday");
                break;
            case Saturday:
                System.out.println("Saturday");
                break;
            case  Sunday:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}