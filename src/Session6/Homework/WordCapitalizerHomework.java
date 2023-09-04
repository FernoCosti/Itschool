package Session6.Homework;

import java.util.*;

public class WordCapitalizerHomework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");

        String word = sc.nextLine();

        String firstLetter = word.substring(0, 1);

        firstLetter = firstLetter.toUpperCase();
        String restOfWord = word.substring(1);

        String capitalizedWord = firstLetter + restOfWord;
        System.out.println("Capitalized Word: " + capitalizedWord);
    }
}