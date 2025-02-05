package bank.clients;

import bank.Bank;

public class Client {
    private String name;
    private Bank bank;
    private int amountCounts;
    private double totalBalance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public int getAmountCounts() {
        return amountCounts;
    }

    public void setAmountCounts(int amountCounts) {
        this.amountCounts = amountCounts;
    }

    public double getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(double totalBalance) {
        this.totalBalance = totalBalance;
    }

    public Client(String n, Bank b) {
        this.setName(n);
        this.setBank(b);
        b.setAmountClients(b.getAmountClients() + 1);
        b.listClients.add(this);
    }
}
