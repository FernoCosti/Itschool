package session12.practice.virtualMethods;

public class FruitTest {
    public static void main(String[] args) {
        printFruitDetalis(new Apple());
        printFruitDetalis(new Orange());

    }

    public static void printFruitDetalis(Fruit fruit){
        System.out.println("Taste:" + fruit.taste());
        System.out.println("Taste:" + fruit.colour());
    }
}
