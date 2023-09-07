package session7.homework;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DisplayTodaysDateHW {

    public static void main(String[] args) {
        displayTodayDate();
    }

    public static void displayTodayDate() {
        LocalDateTime currentLocalTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formatDate = currentLocalTime.format(formatter);
        System.out.println(formatDate);
    }
}
