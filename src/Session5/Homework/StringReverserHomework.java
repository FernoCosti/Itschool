package Session5.Homework;

import java.util.Scanner;

public class StringReverserHomework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name here");
        String nameOriginal = scanner.nextLine();
        reverseName(nameOriginal);
    }
    public static void reverseName(String s){
        char[] letters = new char[s.length()];

        for (int i =s.length()- 1; i >= 0; i--){
            System.out.println(s.charAt(i));
        }
    }
}