package session7.homework;

import java.time.LocalDate;

public class DateDecompositionHW {

    public static void main(String[] args) {

        LocalDate specificDate = createSpecificDate();
        System.out.println(specificDate);

    }

    public static LocalDate createSpecificDate() {
        return LocalDate.of(2025, 8, 19);
    }
}