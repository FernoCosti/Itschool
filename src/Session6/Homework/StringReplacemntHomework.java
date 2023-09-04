package Session6.Homework;

public class StringReplacemntHomework {

    public static void main(String[] args) {
        String cat = "Cat";
        String dog = "Dog";
        StringBuilder words = new StringBuilder("The cat sat on the mat.");

        System.out.println(words.toString().replace("cat", "dog"));

    }
}
