package bank.exceptions;

public class BalanceException extends Exception {
    private double balance;

    public BalanceException(double b) {
        this.balance = b;
    }

    @Override
    public String toString() {
        return "You inserted a incorrect value in balance: " + this.balance + "$";
    }
}
