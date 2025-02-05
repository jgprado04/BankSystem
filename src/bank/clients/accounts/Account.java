package bank.clients.accounts;

import bank.clients.Client;
import bank.clients.accounts.systems.SystemAccounts;
import bank.exceptions.BalanceException;

public abstract class Account {
    private Client client;
    private double balance;

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Account(Client c, double b) throws BalanceException {
        if(b < 0) throw new BalanceException(b);

        this.setClient(c);
        this.setBalance(b);

        SystemAccounts.addAccount(this, c);
        c.setAmountCounts(c.getAmountCounts() + 1);
    }

    public void checkBalance() {
        System.out.println("You balance is: " + this.balance + "$ now.");
    }

    public abstract void withdraw(double value);

    public void deposit(double value) {
        if(value > 0) {
            System.out.println("You are depositing " + value + "$");
            this.setBalance(this.getBalance() + value);
        }

        System.out.println("The value is incorrenct, please insire a correct value!");
    }

    public void transfer(double value, Account account) {
        if(!this.equals(account.getClient())) {
            if(value > 0 && value <= this.balance) {
                System.out.println("You are transfering " + value + "$ to " + account.getClient().getName());
                this.setBalance(this.getBalance() - value);
                account.setBalance(account.getBalance() + value);
                this.checkBalance();
                return;
            }

            String response = value <= 0 ? "The value than you are depositing is incorrect" : "Your balance is more lower than your value to deposit";
            System.out.println(response);
        }

    }
}
