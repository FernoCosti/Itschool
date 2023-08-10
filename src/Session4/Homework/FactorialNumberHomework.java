package Session4.Homework;

public class FactorialNumberHomework {

    public static void main(String[] args) {
        int num = 15;
        int factorial = 1;
        for (int i = 1; i <= num; i++){
            factorial *= i;
        }
        System.out.println("The factorial of " + num + " is: " + factorial);
}
    }