package Session5.Homework;

import java.util.Scanner;

public class BreakStatementHomework {
    public static void main(String[] args) {
        System.out.println("Enter a numbers to calculate sum. To exit enter type -1");
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        while (true){
            int number = sc.nextInt();
            sum +=number;
            if (number == -1)break;
        }
        System.out.println(sum);
    }
    }
