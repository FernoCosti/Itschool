package Session5.Homework;

import java.util.Scanner;

public class MonthNameFinderHomework {

    public static final int January = 1;
    public static final int February = 2;
    public static final int March = 3;
    public static final int April = 4;
    public static final int May = 5;
    public static final int June = 6;
    public static final int July = 7;
    public static final int August = 8;
    public static final int September = 9;
    public static final int October = 10;
    public static final int November = 11;
    public static final int December = 12;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number (1-12) to the months in the calendar");
        int month = scanner.nextInt();

        switch (month){
            case January:
                System.out.println("January");
                break;
            case February:
                System.out.println("February");
                break;
            case March:
                System.out.println("March");
                break;
            case April:
                System.out.println("April");
                break;
            case May:
                System.out.println("May");
                break;
            case June:
                System.out.println("June");
                break;
            case July:
                System.out.println("July");
                break;
            case August:
                System.out.println("August");
                break;
            case September:
                System.out.println("September");
                break;
            case October:
                System.out.println("October");
                break;
            case November:
                System.out.println("November");
                break;
            case December:
                System.out.println("December");
            default:
                System.out.println("Invalid month");
        }
    }
}