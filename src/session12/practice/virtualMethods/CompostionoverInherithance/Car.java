package session12.practice.virtualMethods.CompostionoverInherithance;

public class Car  extends Engine{
    @Override
    public void start() {
        System.out.println("Car is moving");
    }
}
