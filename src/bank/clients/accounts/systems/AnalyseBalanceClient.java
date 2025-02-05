package bank.clients.accounts.systems;

import bank.clients.Client;
import bank.clients.accounts.Account;

import java.util.Map;

public class AnalyseBalanceClient {
    public static void analyse() {
        for (Map.Entry<Account, Client> element : SystemAccounts.listAccountsInBank.entrySet()) {
            element.getValue().setTotalBalance(element.getValue().getTotalBalance() + element.getKey().getBalance());
        }
    }
}
