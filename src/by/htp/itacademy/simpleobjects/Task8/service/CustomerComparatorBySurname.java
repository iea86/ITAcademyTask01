package by.training.tasks.aliv.simpleobjects.Task8.service;

import by.training.tasks.aliv.simpleobjects.Task8.model.Customer;

import java.util.Comparator;

public class CustomerComparatorBySurname implements Comparator<Customer> {
    @Override
    public int compare(Customer o1, Customer o2) {
        return o1.getSurname().compareTo(o2.getName());

    }
}
