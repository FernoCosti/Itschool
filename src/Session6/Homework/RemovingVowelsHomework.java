package Session6.Homework;

import java.util.Scanner;

public class RemovingVowelsHomework {

    public static void main(String[] args) {
        String str1, str2;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a word : ");
        str1 = scan.nextLine();

        str2 = str1.replaceAll("[aeiouAEIOU]", "");

        System.out.print("All Vowels Removed Successfully. New String is : ");

        System.out.print(str2);
    }
}
