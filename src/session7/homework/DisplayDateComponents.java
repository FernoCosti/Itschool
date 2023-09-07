package session7.homework;

import java.time.LocalDate;

public class DisplayDateComponents {

    public static void main(String[] args) {
        localDate(1997 , 6 ,14);
    }
    public static LocalDate localDate(int year , int month , int day){
        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day : " + day);
        return LocalDate.of(year , month , day);
    }
}
