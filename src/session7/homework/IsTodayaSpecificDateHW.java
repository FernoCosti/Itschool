package session7.homework;

import java.time.LocalDate;

public class IsTodayaSpecificDateHW {

    public static void main(String[] args) {
        boolean isSpecificDate = isTodaySpecificDate(2019, 12, 10);
        System.out.println("Today's date is " + isSpecificDate);

    }

    public static boolean isTodaySpecificDate(int year, int month, int day) {
        LocalDate localDate = LocalDate.now();
        LocalDate specificDate = LocalDate.of(year, month, day);
        return localDate.equals(specificDate);
    }
}