package session11.homework.animals;

public abstract class Animals {
    abstract void cats();

    abstract void dogs();
}

class Cats extends Animals {
    @Override
    void cats() {
        System.out.println("Cats meow");
    }

    @Override
    void dogs() {
        //empty
    }
}

class Dogs extends Animals {
    @Override
    void dogs() {
        System.out.println("Dogs bark");

    }

    @Override
    void cats() {
        //empty

    }
}