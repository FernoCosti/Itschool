package session11.homework.abstractcalsstest;

public abstract class AbstractClassTest {

    public AbstractClassTest() {
        System.out.println("This is a constructor of abstract class");
    }

    abstract void a_method();

    void non_abstract() {
        System.out.println("This is a normal method of abstract class");
    }
}

class Subclass extends AbstractClassTest {
    @Override
    void a_method() {
        System.out.println("This is a abstract method");
    }
}