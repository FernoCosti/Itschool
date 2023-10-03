package session11.homework.marks;

public class MarksMain {

    public static void main(String[] args) {
        A studentA = new A();
        double marksA = studentA.getPercentage();
        System.out.println("Percentage for student A is: " + marksA + "%");

        B studentB = new B();
        double marksB = studentB.getPercentage();
        System.out.println("Percentage for student B is: " + marksB + "%");
    }
}