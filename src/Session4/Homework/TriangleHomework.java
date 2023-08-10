package Session4.Homework;

public class TriangleHomework {

    public static void main(String[] args) {
        double sideOne = 40;
        double sideTwo = 50;
        double sideThree = 60;
        String triangleType = (sideOne == sideTwo && sideThree == sideTwo) ? "Equilateral"
                : (sideOne == sideTwo || sideTwo == sideThree || sideOne == sideThree) ?
                "Isosceles" : "Scalene";
        System.out.println("The triangle is: " + triangleType);
    }
}