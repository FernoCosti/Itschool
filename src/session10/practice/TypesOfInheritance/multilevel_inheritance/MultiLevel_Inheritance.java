package session10.practice.TypesOfInheritance.multilevel_inheritance;

public class MultiLevel_Inheritance {

    public static void main(String[] args) {

        Tesla tesla = new Tesla("Tesla", "Model S","2023", "54Kwh", "600Km", "On");
        tesla.start();
        tesla.stop();
        tesla.accelerate();
        tesla.charge();
        tesla.EnableAutoPilot();
    }
}