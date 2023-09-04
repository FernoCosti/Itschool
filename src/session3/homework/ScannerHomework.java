package session3.homework;

import java.util.Scanner;

public class ScannerHomework {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Fullname: ");
        String Fullname = sc.nextLine();
        System.out.println("Salary: ");
        float Salary = 1800;

        int age;
        sc.nextInt();
        System.out.println("Age :");

        String PinCode;
        sc.next();
        System.out.println("Enter Pin: ");


        float salary = sc.nextFloat();
        double IncraseSalary = 50;
        double NewSalary = Salary + IncraseSalary * IncraseSalary;
        System.out.println("Your new salary is: " + NewSalary);
    }
}