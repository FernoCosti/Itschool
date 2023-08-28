package Session6.Homework;

import java.util.ArrayList;
import java.util.List;

public class ConcatenateMultipleStringsHomework {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        System.out.println("List here: ");
        stringList.add(" Car ,");
        stringList.add(" Motorcycle , ");
        stringList.add(" ATV");
        String concatenatedStrings = concatenatedStrings(stringList);
        System.out.println(concatenatedStrings);
    }

    public static String concatenatedStrings(List<String> stringList) {
        StringBuilder stringBuilder = new StringBuilder();

        for (String str : stringList) {
            stringBuilder.append(str);
        }
        return stringBuilder.toString();
    }
}
