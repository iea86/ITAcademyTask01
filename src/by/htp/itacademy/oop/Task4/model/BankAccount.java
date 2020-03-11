package by.training.tasks.aliv.oop.Task4.model;

import java.util.Objects;

public class BankAccount {
    private int id;
    private String accountNumber;
    private Boolean isValid;
    private double amount;




    public BankAccount(int id, String accountNumber, Boolean isValid, double amount) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.isValid = isValid;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Boolean getValid() {
        return isValid;
    }

    public void setValid(Boolean valid) {
        isValid = valid;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return Double.compare(that.amount, amount) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + id +
                ", accountNumber='" + accountNumber + '\'' +
                ", isValid=" + isValid +
                ", amount=" + amount +
                '}';
    }
}
