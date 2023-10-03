package session11.homework.marks;

public class B extends Marks {
    private int subjectOne = 8;
    private int subjectTwo = 7;
    private int subjectThree = 10;
    private int subjectFour = 9;

    @Override
    double getPercentage() {
        return (subjectOne + subjectTwo + subjectThree + subjectFour) / 4 * 100 / 10;
    }
}
