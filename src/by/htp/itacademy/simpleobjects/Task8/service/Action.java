package by.training.tasks.aliv.simpleobjects.Task8.service;

import by.training.tasks.aliv.simpleobjects.Task8.model.Clientele;
import by.training.tasks.aliv.simpleobjects.Task8.model.Customer;
import by.training.tasks.aliv.simpleobjects.Task8.model.SortType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Action {

    public Clientele sort(Clientele clientele, SortType type) {
        List<Customer> customers = clientele.getCustomers();
        if (type == SortType.BY_NAME) {
            Collections.sort(customers, new CustomerComparatorByName());
        } else if (type == SortType.BY_SURNAME) {
            Collections.sort(customers, new CustomerComparatorBySurname());
        }

        clientele.setCustomers(customers);
        return clientele;

    }

    public List<Customer> getRangeOfCustomers(Clientele clientele, int from, int to) {
        List<Customer> customers = clientele.getCustomers();
        List<Customer> results = new ArrayList<Customer>();
        for (Customer c : customers) {
            if (c.getCreditCard() >= from && c.getCreditCard() <= to) {
                results.add(c);
            }
        }


        return results;

    }
}
