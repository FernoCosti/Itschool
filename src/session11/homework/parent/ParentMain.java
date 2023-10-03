package session11.homework.parent;

public class ParentMain {

    public static void main(String[] args) {
        ChildOne childOne = new ChildOne();
        ChildTwo childTwo = new ChildTwo();

        childOne.message();
        childTwo.message();
    }
}