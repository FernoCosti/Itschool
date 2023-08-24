package Session5.Homework;

public class CountingNegativeNumberHomework {
    public static void main(String[] args) {
            int[] simpleArray = {1, 23, -5, 8, -33, -12};

            for (int arrayElement : simpleArray) {
                if (arrayElement < 0) {
                    System.out.print(arrayElement + " ");
                }
            }
        }
    }