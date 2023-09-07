package session13.practice;

public class FloatingPointPrecision {

    public static void main(String[] args) {
        float firstNumber = Float.MAX_VALUE - 70;
        float secondNumber = 50;
        float threeNumber = 10;

        System.out.println(sumOfAnExceedFloat(firstNumber, secondNumber, threeNumber));
        System.out.println("Avrege: " +getAvrage(firstNumber , secondNumber , threeNumber));
    }
    public static boolean sumOfAnExceedFloat(float fisrtNumber, float secondNumber, float threeNumber) {
        double sum = fisrtNumber + secondNumber + threeNumber;
        return sum > Float.MAX_VALUE;
    }
    public static double getAvrage(float firstNumber , float secondNumber , float threeNumber){
        double sum = firstNumber + secondNumber + threeNumber;
        return sum / 3;
    }
}
