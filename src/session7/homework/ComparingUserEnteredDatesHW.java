package session7.homework;

import java.time.LocalDate;
import java.util.Scanner;

public class ComparingUserEnteredDatesHW {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first date in format YYYY-dd-MM: ");
        String firstDate = sc.nextLine();
        System.out.println("Enter the scond date in format YYYY-dd-MM: ");
        String twoDate = sc.nextLine();
        boolean dateEquals = areDatesEqual(firstDate , twoDate);
        System.out.println("Date are equals: " + dateEquals);
        sc.close();
    }
    public static boolean areDatesEqual(String firstDate ,String twoDate){
        LocalDate localDate = LocalDate.parse(firstDate);
        LocalDate localDateTwo = LocalDate.parse(twoDate);
        return localDate.isEqual(localDateTwo);
    }
}
