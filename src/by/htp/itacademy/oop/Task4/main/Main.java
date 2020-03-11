package by.training.tasks.aliv.oop.Task4.main;

import by.training.tasks.aliv.oop.Task4.model.BankAccount;
import by.training.tasks.aliv.oop.Task4.model.Client;
import by.training.tasks.aliv.oop.Task4.model.SortType;
import by.training.tasks.aliv.oop.Task4.service.Action;
import by.training.tasks.aliv.oop.Task4.view.View;

public class Main {

    public static void main(String[] args) {
        View view = new View();
        Action action=new Action();
        Client client = view.create();
        view.print(client.getBankAccounts());

        System.out.println("To block account");
        String bankAccount1 = view.inputBankAccount();
        action.blockAccount(bankAccount1,client);
        view.print(client.getBankAccounts());

        System.out.println("To unblock account");
        String bankAccount2 = view.inputBankAccount();
        action.unblockAccount(bankAccount2,client);
        view.print(client.getBankAccounts());

        System.out.println("To find an account info by account number");
        String bankAccount3 = view.inputBankAccount();
        BankAccount account= action.getAccount(bankAccount3, client);
        view.print(account);

        System.out.println("Sorted by Amount:");
        view.print(action.sortAccounts(client, SortType.BY_AMOUNT));

        System.out.println("Sorted by ID:");
        view.print(action.sortAccounts(client, SortType.BY_ID));

        System.out.println("Total sum:");
        double total = action.getTotal(client);
        view.print(total);

        System.out.println("Total sum for accounts with positive balance:");
        double totalPositive = action.getPositiveAccounts(client);
        view.print(totalPositive);

        System.out.println("Total sum for accounts with negative balance:");
        double totalNegative = action.getPositiveAccounts(client);
        view.print(totalNegative);
    }
}
