package session7.homework;

import java.time.LocalDateTime;

public class GettingCurentTimeHW {

    public static void main(String[] args) {
        currentTime();
    }
    public static void currentTime(){
        LocalDateTime.now();
        System.out.println("Current time is: " + LocalDateTime.now());
    }
}