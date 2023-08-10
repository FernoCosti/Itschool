package Session4.Homework;

import java.util.ArrayList;

public class ArrayListHomework {

    public static void main(String[] args) {
        ArrayList<String> listOne = new ArrayList<>();
        ArrayList<String> listTwo = new ArrayList<>();

        listOne.add("TV");
        listOne.add("Phone");
        listOne.add("Console");

        listTwo = listOne;
        listOne.add("Laptop");

        System.out.println("list one: " + listOne);
        System.out.println("List two: " + listTwo);

    }
}
