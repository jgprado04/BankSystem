package bank.clients.accounts.systems;

import bank.clients.Client;
import bank.clients.accounts.Account;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class MakeFile {
    private static double totalBalanceInBank;

    public static void makeFile(String nameFile) {
        try(FileWriter fw = new FileWriter(nameFile)) {
            for (Map.Entry<Account, Client> element : SystemAccounts.listAccountsInBank.entrySet()) {
                fw.write("Client: " + element.getValue().getName() + " has a: " + element.getKey().getBalance() + "$ and " + element.getValue().getAmountCounts() + " amounts of accounts \n");

                totalBalanceInBank += element.getKey().getBalance();
            }

            fw.write("Total value of balance in the bank: $" + totalBalanceInBank);
        } catch (IOException exc) {
            System.out.println("I/O Error: " + exc);
        }

    }
}
