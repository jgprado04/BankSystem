package bank.clients.accounts.systems;

import bank.Bank;
import bank.clients.Client;
import bank.clients.accounts.Account;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class MakeFile {
    private static double totalBalanceInBank;

    public static void makeFile(String nameFile, Bank b) {
        try(FileWriter fw = new FileWriter(nameFile)) {
            for (Client c: b.listClients) {
                fw.write("Client: " + c.getName() + " has a: " + c.getTotalBalance() + "$ and " + c.getAmountCounts() + " amounts of accounts \n");

                totalBalanceInBank += c.getTotalBalance();
            }

            fw.write("Total value of balance in the bank: $" + totalBalanceInBank);
        } catch (IOException exc) {
            System.out.println("I/O Error: " + exc);
        }

    }
}
