package session10.practice;

public class InheritanceAccesModifer {

}
class Athlete{
    protected int age;
    protected void setAge(int age){
        this.age = age;
    }
}
class Runner extends Athlete {
    private int age;
}
class Biker extends Athlete{

}