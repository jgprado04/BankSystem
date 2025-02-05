package bank.clients.accounts.systems;

import bank.clients.Client;
import bank.clients.accounts.Account;

import java.util.Map;

public class AnalyseBalanceClient {
    public static void analyse(Client c) {
        for (Map.Entry<Account, Client> element : SystemAccounts.listAccountsInBank.entrySet()) {
            if(element.getValue() == c) c.setTotalBalance(c.getTotalBalance() + element.getKey().getBalance());
        }
    }
}
