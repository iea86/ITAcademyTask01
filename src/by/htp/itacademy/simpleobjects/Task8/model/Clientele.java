package by.training.tasks.aliv.simpleobjects.Task8.model;

import java.util.List;

public class Clientele {
    List<Customer> customers;

    public Clientele(List<Customer> customers) {
        this.customers = customers;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
}
