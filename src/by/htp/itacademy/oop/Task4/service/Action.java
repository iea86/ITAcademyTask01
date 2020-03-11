package by.training.tasks.aliv.oop.Task4.service;

import by.training.tasks.aliv.oop.Task4.model.BankAccount;
import by.training.tasks.aliv.oop.Task4.model.Client;
import by.training.tasks.aliv.oop.Task4.model.SortType;
import by.training.tasks.aliv.oop.Task4.service.comparator.BankAccountComparatorByAmount;
import by.training.tasks.aliv.oop.Task4.service.comparator.BankAccountComparatorByID;

import java.util.Collections;
import java.util.List;

public class Action {

    public void blockAccount(String account, Client client) {
        List<BankAccount> accounts = client.getBankAccounts();
        String accountNumber;
        for (BankAccount acc : accounts) {
            accountNumber = acc.getAccountNumber();
            if (accountNumber.equals(account)) {
                acc.setValid(false);
            }
        }
    }

    public void unblockAccount(String account, Client client) {
        List<BankAccount> accounts = client.getBankAccounts();
        String accountNumber;
        for (BankAccount acc : accounts) {
            accountNumber = acc.getAccountNumber();
            if (accountNumber.equals(account)) {
                acc.setValid(true);
            }
        }
    }

    public BankAccount getAccount(String account, Client client) {
        List<BankAccount> accounts = client.getBankAccounts();
        String accountNumber;
        for (BankAccount acc : accounts) {
            accountNumber = acc.getAccountNumber();
            if (accountNumber.equals(account)) {
                return acc;
            }
        }
        return null;
    }

    public List<BankAccount> sortAccounts(Client client, SortType type) {
        List<BankAccount> accounts = client.getBankAccounts();
        if (type == SortType.BY_ID) {
            Collections.sort(accounts, new BankAccountComparatorByID());
        } else if (type == SortType.BY_AMOUNT) {
            Collections.sort(accounts, new BankAccountComparatorByAmount());
        }
        return accounts;
    }

    public double getTotal(Client client) {
        double total = 0;
        List<BankAccount> accounts = client.getBankAccounts();
        for (BankAccount acc : accounts) {
            total += acc.getAmount();
        }
        return total;
    }

    public double getPositiveAccounts(Client client) {
        double total = 0;
        List<BankAccount> accounts = client.getBankAccounts();
        for (BankAccount acc : accounts) {
            if (acc.getAmount() > 0) {
                total += acc.getAmount();
            }
        }
        return total;
    }

    public double getNegativeAccounts(Client client) {
        double total = 0;
        List<BankAccount> accounts = client.getBankAccounts();
        for (BankAccount acc : accounts) {
            if (acc.getAmount() < 0) {
                total += acc.getAmount();
            }
        }
        return total;
    }
}


