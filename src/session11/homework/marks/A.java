package session11.homework.marks;

public class A extends Marks {
    private int subjectOne = 5;
    private int subjectTwo = 6;
    private int subjectThree = 10;

    @Override
    double getPercentage() {
        return (subjectOne + subjectTwo + subjectThree) / 3 * 100 / 10;
    }
}