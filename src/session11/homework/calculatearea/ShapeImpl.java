package session11.homework.calculatearea;

public class ShapeImpl {
    public static void main(String[] args) {
        Area shape = new Area();

        double rectangleArea = shape.rectangleArea(5, 8);
        System.out.println(rectangleArea);
        double squareArea = shape.squareArea(20);
        System.out.println(squareArea);
        double circleArea = shape.circleArea(15);
        System.out.println(circleArea);
    }
}