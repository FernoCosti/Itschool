package Session5.Homework;

import java.util.Scanner;

public class WhileLoopHomework {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        int sum = 0;
        while (number != -1){
            sum += number;
            System.out.println("sum = " + sum);
            System.out.println("Enter another number or -1 to exit");
            number =scanner.nextInt();
        }
    }
}