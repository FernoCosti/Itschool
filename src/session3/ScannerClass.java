package session3;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        System.out.println();

        String userName = "Maria";
        int userAge = 40;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleste provide a some text ");
        String userInput =scanner.nextLine();
        System.out.println("Your input is: " + userInput);
        scanner.close();

    }
}