package bank;

import bank.clients.Client;
import bank.clients.accounts.ChekingAccount;
import bank.clients.accounts.SlavesAccount;
import bank.clients.accounts.systems.AnalyseBalanceClient;
import bank.clients.accounts.systems.MakeFile;
import bank.exceptions.BalanceException;

import java.util.Scanner;

public class BankDemo {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            String response;
            int clientResponse;
            int count = 1;

            // Creating Bank ->
            Bank b1 = new Bank("Banco do Brasil", "Av. Dr. Júlio Maranhão, 631 - Guararapes, Jaboatão dos Guararapes - PE, 54325-440");

            // Creating Clients ->
            Client c1 = new Client("João Guilherme", b1);
            Client c2 = new Client("Lorena Dias", b1);
            Client c3 = new Client("Ana Paula", b1);

            // Creating Account of clients ->

            // Cheking Accounts ->
            ChekingAccount ca1 = new ChekingAccount(c1, 3000); // of João
            ChekingAccount ca2 = new ChekingAccount(c1, 1000); // of João
            ChekingAccount ca3 = new ChekingAccount(c2, 5000); // of Lorena
            ChekingAccount ca4 = new ChekingAccount(c2, 500); // of Lorena
            ChekingAccount ca5 = new ChekingAccount(c3, 10000); // of Paula

            // Slaves Accounts ->
            SlavesAccount sa1 = new SlavesAccount(c1, 15000);
            SlavesAccount sa2 = new SlavesAccount(c2, 20000);

            // Operations in accounts ->
            ca1.transfer(2000, ca3);

            // Analyse the balance total in all accoount of clients ->
            System.out.println("Do you want to analyse the all balances in accounts of clients? ");
            if((response = scanner.nextLine()).equalsIgnoreCase("yes")) {

                for(Client c: b1.listClients) {
                    System.out.println(c.getName() + " insire the number : " + count);
                    count++;
                }

                System.out.println("Say your name, client: ");
                AnalyseBalanceClient.analyse();
                switch (clientResponse = scanner.nextInt()) {
                    case 1:
                        System.out.println(c1.getName() + " your balance total is: " + c1.getTotalBalance() + "$.");
                        break;
                    case 2:
                        System.out.println(c2.getName() + " your balance total is: " + c2.getTotalBalance() + "$.");
                        break;
                    case 3:
                        System.out.println(c3.getName() + " your balance total is: " + c3.getTotalBalance() + "$.");
                        break;
                }
            }

            // To creating file in the bank of all balance of accounts
            MakeFile.makeFile("balancebank.txt", b1);


        } catch (BalanceException exc) {
            System.out.println(exc);
        }
    }
}
