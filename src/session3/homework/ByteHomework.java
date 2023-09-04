package session3.homework;

public class ByteHomework {
    public static void main(String[] args) {
        byte myFirstByteNum = 5;
        byte mySecondByteNum = 5;
        byte myResult = (byte) (myFirstByteNum + mySecondByteNum);
        System.out.println(myResult);
        myResult = myFirstByteNum;
        myResult += mySecondByteNum;
        System.out.println(myResult);
    }
}