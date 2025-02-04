package bank.clients.accounts;

import bank.clients.Client;

public class SlavesAccount extends Account {
    public SlavesAccount(Client c, double b) {
        super(c, b);
    }

    @Override
    public void withdraw(double value) {
        if(value > 0 && value <= this.getBalance()) {
            System.out.println("You was withdrew money " + value);
            System.out.println("Your account is Slave, so is discounted 1% of value from withdraw");
            this.setBalance(this.getBalance()*0.99 - value);
            this.checkBalance();

            return;
        }

        String response = value <= 0 ? "The value than you are withdrawing is incorrect" : "Your balance is more lower than your value to withdrawing";
        System.out.println(response);
    }
}
