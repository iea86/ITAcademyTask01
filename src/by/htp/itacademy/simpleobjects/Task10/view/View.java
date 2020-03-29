package by.training.tasks.aliv.simpleobjects.Task10.view;

import by.training.tasks.aliv.simpleobjects.Task10.model.Aeroport;
import by.training.tasks.aliv.simpleobjects.Task10.model.Airplane;
import by.training.tasks.aliv.simpleobjects.Task10.model.Time;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class View {

    public Aeroport create() {

        List<Airplane> airplanes = new ArrayList<Airplane>();
        int[] d1 = new int[]{1, 2, 3};
        int[] d2 = {2, 3};
        int[] d3 = {1, 4, 6};

        airplanes.add(new Airplane("Rome", 1, "A", new Time(1, 30), new int[]{1, 2, 3}));
        airplanes.add(new Airplane("Paris", 2, "B", new Time(5, 30), new int[]{1, 3, 5}));
        airplanes.add(new Airplane("Moscow", 2, "B", new Time(5, 30), new int[]{6, 7}));
        Aeroport aeroport = new Aeroport(airplanes);
        return aeroport;

    }

    public void print(Aeroport aeroport) {

        List<Airplane> airplanes = aeroport.getAirplanes();

        for (Airplane a : airplanes) {
            System.out.println(a.toString());
        }
    }

    public void print(List<Airplane> airplanes) {
        for (Airplane a : airplanes) {
            System.out.println(a.toString());
        }
    }

    public String inputString() {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        return str;
    }

    public int inputNumber() {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        return number;
    }
}
