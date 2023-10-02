package session10.practice.TypesOfInheritance.multilevel_inheritance;

public class ElectricCar extends Car{
    protected double batteryCapacity;
    protected double range;

    public ElectricCar(String make, String model, int year) {
        super(make, model, year);
    }

    public ElectricCar() {
        super();
    }

    public void charge(){
        System.out.println("The car is charging...");
    }
//    public void enableAutopilot(){
//        System.out.println("Autopilot is enable...");
//    }
}