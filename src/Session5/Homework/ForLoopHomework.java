package Session5.Homework;

import java.util.Scanner;

public class ForLoopHomework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");

        int num =sc.nextInt();
        int num1 = 1;
        int num2 = 1;

        System.out.println("\"The first \" + n + \" numbers of the Fibonacci series are:");
        for (int i = 2; i < num + 2; i++) {
            System.out.println(num1 + " ");
            int number = num1 + num2;
            num = num2;
            num2 = num;
        }
    }
}
