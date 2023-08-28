package Session6;

public class StringPractice {

    public static void main(String[] args) {
        String animal1 = "lion";
        String animal2 = new String("lion");
        String animal3 = "lion";
        String name = "AdrianPuscuta";

//
//        System.out.println(animal1 == animal2);
//        System.out.println(animal1 == animal3);
//
//        System.out.println("animal1 hashcode:" + Integer.toHexString(System.identityHashCode(animal1)));
//        System.out.println("animal1 hashcode:" + Integer.toHexString(System.identityHashCode(animal2)));
//        System.out.println("animal1 hashcode:" + Integer.toHexString(System.identityHashCode(animal3)));

        garbaceCollctorExample();
        stringConcat();

        int animal1Lenght = getStringLenght(animal1);
        System.out.println(animal1Lenght);
        System.out.println(animal1.length());

        char animal1Character = getStringChar(animal1, 1);
        System.out.println(animal1Character);

        System.out.println(animal1.indexOf('i'));

        System.out.println(name.substring(6));
        System.out.println(name.substring(5, 7));

        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        System.out.println(getStringStartWith(name, "Adrian"));
        System.out.println(getBooleanEndsWith(name, "Puscuta"));

        String sentence = "   I like to eat apple pie.  ";
        System.out.println(sentence.contains("apple"));

//        System.out.println(sentence.replace("a" , "b"));

        System.out.println(sentence);
        System.out.println(sentence.trim());
        System.out.println(sentence);
//        String sentenceWithOutSpace = sentence.trim();
        sentence = sentence
                .trim()
                .replace('a', 'x').
                toUpperCase();
        System.out.println(sentence);


    }

    public static void garbaceCollctorExample() {
        String name = "Andrei";
        System.out.println(name);

        name = "Ion";
        System.out.println(name);

        User user = new User();
        user.setName("Ionut");
    }

    public static void stringConcat() {
        String value1 = "Adrian";
        String value2 = "Puscuta";
        System.out.println(Integer.toHexString(System.identityHashCode(value1)));

        value1 = value2.concat(value2);
        System.out.println(Integer.toHexString(System.identityHashCode(value1)));
    }

    public static int getStringLenght(String input) {
        return input.length();

    }

    public static char getStringChar(String input, int index) {
        return input.charAt(index);
    }

    public static Boolean getStringStartWith(String input, String startsWith) {
        return input.startsWith(startsWith);
    }

    public static boolean getBooleanEndsWith(String input, String endsWith) {
        return input.endsWith(endsWith);
    }
}