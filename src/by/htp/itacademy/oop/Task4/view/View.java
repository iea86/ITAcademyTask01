package by.training.tasks.aliv.oop.Task4.view;


import by.training.tasks.aliv.oop.Task4.model.BankAccount;
import by.training.tasks.aliv.oop.Task4.model.Client;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class View {
    public Client create() {

        List<BankAccount> bankAccountList = new ArrayList<BankAccount>();
        bankAccountList.add(new BankAccount(1,"A11111",true,5000));
        bankAccountList.add(new BankAccount(2,"B11112",true,10000));
        bankAccountList.add(new BankAccount(3,"C11113",true,-500));
        bankAccountList.add(new BankAccount(4,"D11114",true,0));
        bankAccountList.add(new BankAccount(5,"E11115",true,50));

        Client client = new Client("Petr","Petrov", bankAccountList);

        return client;
    }

    public void print(List<BankAccount> accounts) {
        System.out.println("Client's bank accounts:");
           for (BankAccount account:accounts) {
               System.out.println(account.toString());
      }
    }

    public String inputBankAccount() {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a bank account number:");

        String bankAccount = sc.nextLine();

        return bankAccount;
    }

    public void print(BankAccount account) {
        System.out.println(account.toString());

    }
    public void print(double sum) {
        System.out.println(sum);

    }

}
