package bank.clients.accounts;

import bank.clients.Client;
import bank.exceptions.BalanceException;

public class ChekingAccount extends Account {
    public ChekingAccount(Client c, double b) throws BalanceException {
        super(c, b);
    }

    @Override
    public void withdraw(double value) {
        if(value > 0 && value <= this.getBalance()) {
            System.out.println("You was withdrew money " + value);
            this.setBalance(this.getBalance() - value);
            this.checkBalance();

            return;
        }

        String response = value <= 0 ? "The value than you are withdrawing is incorrect" : "Your balance is more lower than your value to withdrawing";
        System.out.println(response);
    }
}
