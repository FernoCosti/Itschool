package Session6.Homework;

public class PalindromeCheckerHomework {

    public static void main(String[] args) {
        String word = "Java", reverseword = "";
        int wordLenght = word.length();

        for (int i = wordLenght - 1; i >= 0; i--) {
            reverseword = reverseword + word.charAt(i);

        }
        if (word.toLowerCase().equals(word.toLowerCase())) {
            System.out.println(word + " Is a palindorme string");
        } else {
            System.out.println(word + " Is not a palindorme string");
        }
    }
}