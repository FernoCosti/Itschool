package session12.practice.compilePolymarhsim;

public class Geometry {
    //method overloading
    //calculate aare of a circle
    public  double area(double readius){
        return Math.PI * readius * readius;
    }
    //calculate area of a triangle
    public double area(double base, double height){
        return 0.5 * base * height;
    }
}