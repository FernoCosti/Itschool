package session10.practice.TypesOfInheritance.SingleInheritance;

public class MountainBike extends Bicycle {
    private String tireTypes;
    private String suspension;

    public String getTireTypes() {
        return tireTypes;
    }

    public void setTireTypes(String tireTypes) {
        this.tireTypes = tireTypes;
    }
    public void adjustSuspension(String newLevel){
        suspension = newLevel;
        System.out.println("Suspension modify to: " + newLevel);

    }
}