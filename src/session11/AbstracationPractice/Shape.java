package session11.AbstracationPractice;

public abstract class Shape{
    private String name = "some shape name";

 abstract double area();

abstract double perimeter();


     String getShapeName(){
         return name;
     }
}
