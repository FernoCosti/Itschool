package Session6;

public class EqualsStringExampels {

    public static void main(String[] args) {
        String color1 = "Blue";
        String color2 = "blUE";
        System.out.println(color1.equals(color2));
        System.out.println(color1.equalsIgnoreCase(color2));
        System.out.println(color1.toLowerCase().equals(color2.toLowerCase()));

    }
}
