package Session5.Homework;

import java.util.Random;
import java.util.Scanner;

public class DoWhileHomework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int randomNum = random.nextInt(15) + 1;
        int guess;

        System.out.println("Guees the number between 1 and 15");
        do {
            System.out.println("Enter your guess");
            guess =sc.nextInt();
            if (guess < randomNum){
                System.out.println("Too Low !");
            } else if (guess > randomNum) {
                System.out.println("Too High !");

            }else {
                System.out.println("You guess the correct number:" + randomNum);
            }
        }while (guess != randomNum);
    }
}
