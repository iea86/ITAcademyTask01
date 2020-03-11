package by.training.tasks.aliv.simpleobjects.Task8.main;


import by.training.tasks.aliv.simpleobjects.Task8.model.Clientele;
import by.training.tasks.aliv.simpleobjects.Task8.model.Customer;
import by.training.tasks.aliv.simpleobjects.Task8.model.SortType;
import by.training.tasks.aliv.simpleobjects.Task8.service.Action;
import by.training.tasks.aliv.simpleobjects.Task8.view.View;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        View view = new View();
        Action action = new Action();
        Clientele clientele = view.create();
        view.print(clientele);

        System.out.println("Cортируем по фамилии:");
        action.sort(clientele, SortType.BY_SURNAME);
        view.print(clientele);

        System.out.println("Cортируем по имени:");
        action.sort(clientele, SortType.BY_NAME);
        view.print(clientele);

        System.out.println("Вывести покупателей:");
        System.out.println("в диапазоне с");
        int fromNumber = view.enterNumber();
        System.out.println("в диапазоне по");
        int fromTo = view.enterNumber();
        List<Customer> result;
        result = action.getRangeOfCustomers(clientele, fromNumber, fromTo);
        view.print(result);


    }
}
