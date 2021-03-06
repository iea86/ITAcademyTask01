package by.training.tasks.aliv.oop.Task4.service.comparator;

import by.training.tasks.aliv.oop.Task4.model.BankAccount;

import java.util.Comparator;

public class BankAccountComparatorByID implements Comparator<BankAccount> {

    @Override
    public int compare(BankAccount o1, BankAccount o2) {

        return o1.getId() - o2.getId();
    }
}
