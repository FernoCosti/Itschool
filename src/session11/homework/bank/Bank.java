package session11.homework.bank;

public abstract class Bank {
    protected double balance;
    abstract double getBalance();

    public void deposit(double amount){
        balance += amount;

    }
}