package session10.practice.TypesOfInheritance.multilevel_inheritance;

public class Tesla extends ElectricCar {
    protected String make;
    protected String model;
    protected String year;
    protected String batteryCapacity;
    protected String range;
    protected String autoPilot;

    public Tesla(String make, String model, String year, String batteryCapacity, String range, String autoPilot) {
        super();
        this.make = make;
        this.model = model;
        this.year = year;
        this.batteryCapacity = batteryCapacity;
        this.range = range;
        this.autoPilot = autoPilot;
    }
    public void EnableAutoPilot(){
        System.out.println("Autopilot is: ON");
    }
}
