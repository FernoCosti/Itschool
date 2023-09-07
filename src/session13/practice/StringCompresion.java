package session13.practice;

public class StringCompresion {

    public static void main(String[] args) {
        String test =  "aaabbbcccaaa";
        System.out.println(compresedString(test));

    }
    public static String compresedString(String input){
        int counter = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (int index = 0; index < input.length(); index++){
            char currentLetter = input.charAt(index);
            if (currentLetter != input.charAt(index + 1)){
                stringBuilder.append(currentLetter);
                stringBuilder.append(counter);
                counter = 0;
            }
            counter++;
        }
            return stringBuilder.toString();
    }
}