package bank;

import bank.clients.Client;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String name;
    private String adress;
    private int amountClients;
    public List<Client> listClients = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getAmountClients() {
        return amountClients;
    }

    public void setAmountClients(int amountClients) {
        this.amountClients = amountClients;
    }

    public Bank(String n, String a) {
        this.setName(n);
        this.setAdress(a);
    }
}
