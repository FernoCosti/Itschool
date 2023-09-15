package session9.SimpleBankingApplicationHomework;

public class Transaction {
    private String transcationType;
    private double amountTransaction;
    private double availableAmount;

    public Transaction(String transcationType, double amountTransaction, double availableAmount) {
        this.transcationType = transcationType;
        this.amountTransaction = amountTransaction;
        this.availableAmount = availableAmount;
    }

    @Override
    public String toString() {
        return transcationType + "amount of: " + amountTransaction + "balance after: " + availableAmount;
    }
}
