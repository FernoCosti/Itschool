package session9.SimpleBankingApplicationHomework;

public class ApplicationBank {

    public static void main(String[] args) {
        BankAccount account = new BankAccount("Diana", "Founds", 3500d);
        account.deposit(500.0);
        account.withdrawAmount(250.0);

        System.out.println("Current balabce is: " + account);
        account.printTranscation();
    }
}
