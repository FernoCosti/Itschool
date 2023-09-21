package session10.practice.AnimalProblem;

public class Mammal extends Animal {

    public Mammal(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("The Mammal is eating plants or other animals");
    }
}