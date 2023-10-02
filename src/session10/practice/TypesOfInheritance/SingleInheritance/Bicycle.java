package session10.practice.TypesOfInheritance.SingleInheritance;

public class Bicycle {
    private int speed;
    private int gear;

    public void changeGear(int newGear){
        gear = newGear;
        System.out.println("Gear change to: " + newGear);

    }
    public void speedUp(int accelerate){
        speed += accelerate;
        System.out.println("Speeding up: " + speed);
    }
    public void applyBrake(int applyBrake){
        speed -= applyBrake;
        System.out.println("Applying brake: " + speed);
    }
}