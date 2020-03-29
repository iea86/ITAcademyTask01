package by.training.tasks.aliv.simpleobjects.Task10.main;

import by.training.tasks.aliv.simpleobjects.Task10.model.Aeroport;
import by.training.tasks.aliv.simpleobjects.Task10.service.Service;
import by.training.tasks.aliv.simpleobjects.Task10.view.View;

public class Main {

    public static void main(String[] args) {
        View view=new View();
        Service service=new Service();
        Aeroport aeroport = view.create();
        view.print(aeroport);

        //by destination
        System.out.println("Enter destination:");
        String destination= view.inputString();
        view.print(service.getByCity(aeroport,destination));

        //by day
        System.out.println("Enter day of week:");
        int d=view.inputNumber();
        view.print(service.getByDayOfWeek(aeroport,d));

        //



    }
}
