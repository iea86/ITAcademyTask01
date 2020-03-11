package by.training.tasks.aliv.simpleobjects.Task8.model;

import by.training.tasks.aliv.simpleobjects.Task8.model.Address;

import java.util.Objects;

public class Customer {

    private String Surname;
    private String Name;
    private Address adr;
    private int accountNumber;
    private int creditCard;

    public Customer(String surname, String name, Address adr, int accountNumber, int creditCard) {
        Surname = surname;
        Name = name;
        this.adr = adr;
        this.accountNumber = accountNumber;
        this.creditCard = creditCard;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Address getAdr() {
        return adr;
    }

    public void setAdr(Address adr) {
        this.adr = adr;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(int creditCard) {
        this.creditCard = creditCard;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Surname.equals(customer.Surname) &&
                Name.equals(customer.Name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Surname, Name);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "Surname='" + Surname + '\'' +
                ", Name='" + Name + '\'' +
                ", adr=" + adr.toString() +
                ", accountNumber=" + accountNumber +
                ", creditCard=" + creditCard +
                '}';
    }
}
