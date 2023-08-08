package session3.homework;

public class AssignmentCompoundHomework {

    public static void main(String[] args) {
        int price = 100;
        int priceDiscount = 20;

        price -= 100;
        price = 100 - priceDiscount;
        System.out.println("After Discount the price is: " + price);
    }
}