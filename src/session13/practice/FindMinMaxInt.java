package session13.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FindMinMaxInt {

    public static void main(String[] args) {
        List<Integer> numbers = generateRandomNumber();
        System.out.println(numbers);
        System.out.println(generateRandomNumber());

    }

    public static List<Integer> generateRandomNumber() {
        Random random = new Random();
        List<Integer> randomNumbers = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            randomNumbers.add(random.nextInt(100));
        }
        return randomNumbers;
    }

    public static int[] getMinMax(List<Integer> numbers) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MAX_VALUE;

        for (Integer number : numbers) {
            min = Math.min(min, number);
            max = Math.max(max, number);
        }
        int[] result = {min, max};

        return result;
    }
}