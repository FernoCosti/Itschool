package session10.practice.TypesOfInheritance.SingleInheritance;

public class Single_Inheritance {

    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        System.out.println("Bicycle: ");
        bicycle.changeGear(5);
        bicycle.speedUp(50);
        bicycle.applyBrake(10);

        System.out.println();

        MountainBike mountainBike = new MountainBike();
        System.out.println("Mountain bike: ");
        mountainBike.setTireTypes("Off-Road");
        mountainBike.adjustSuspension("HighLevel");
        mountainBike.changeGear(3);
        mountainBike.speedUp(40);
        mountainBike.applyBrake(10);
    }
}