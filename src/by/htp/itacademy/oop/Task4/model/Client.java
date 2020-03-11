package by.training.tasks.aliv.oop.Task4.model;

import java.util.List;

public class Client {
    private String firstName;
    private String lastName;
    private List<BankAccount> bankAccounts;

    public Client(String firstName, String lastName, List<BankAccount> bankAccounts) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bankAccounts = bankAccounts;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<BankAccount> getBankAccounts() {
        return bankAccounts;
    }

    public void setBankAccounts(List<BankAccount> bankAccounts) {
        this.bankAccounts = bankAccounts;
    }
}
