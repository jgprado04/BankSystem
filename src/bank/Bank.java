package bank;

public class Bank {
    private String name;
    private String adress;
    private int amountClients;

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

    public Bank(String n, String a, double b) {
        this.setName(n);
        this.setAdress(a);
    }
}
