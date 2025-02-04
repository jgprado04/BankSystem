package bank.clients.accounts.systems;

import bank.clients.Client;
import bank.clients.accounts.Account;

import java.util.HashMap;
import java.util.Map;

public class SystemAccounts {
    public static Map<Account, Client> listAccountsInBank = new HashMap<>();

    public static void addAccount(Account a) {
        listAccountsInBank.put(a, a.getClient());
    }

    public static void removeAccount(Account a) {
        if(listAccountsInBank.containsKey(a)) {
            System.out.println("Sorry the account is on the list");
            return;
        };

        listAccountsInBank.remove(a);
    }
}
