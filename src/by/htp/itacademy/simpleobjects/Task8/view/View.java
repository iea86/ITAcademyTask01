package by.training.tasks.aliv.simpleobjects.Task8.view;

import by.training.tasks.aliv.simpleobjects.Task8.model.Address;
import by.training.tasks.aliv.simpleobjects.Task8.model.Clientele;
import by.training.tasks.aliv.simpleobjects.Task8.model.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class View {

    public Clientele create() {
        List<Customer> customers = new ArrayList<Customer>();

        customers.add(new Customer("Petrova", "Olga", new Address("Kozlova street", 5, 13), 1111234, 2221234));
        customers.add(new Customer("Ivanova", "Nina", new Address("Lenina street", 6, 18), 3331234, 4441234));
        customers.add(new Customer("Sidorova", "Maria", new Address("Nezavisimosti street", 7, 10), 5551234, 6661234));

        Clientele clientele = new Clientele(customers);
        return clientele;

    }

    public void print(Clientele clientele) {
        List<Customer> customers = clientele.getCustomers();
        for (Customer c : customers) {
            System.out.println(c.toString());
        }
    }

    public void print(List<Customer> customers) {
        for (Customer c : customers) {
            System.out.println(c.toString());
        }
    }

    public int enterNumber() {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер для диапазона кредитных карт:");

        int number = sc.nextInt();

        return number;
    }
}
