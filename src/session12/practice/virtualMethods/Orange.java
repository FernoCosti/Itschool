package session12.practice.virtualMethods;

public class Orange extends Fruit{
    @Override
    public String taste() {
        return "Orange is sweet";
    }

    @Override
    public String colour() {
        return "Orange is a ";
    }
}
