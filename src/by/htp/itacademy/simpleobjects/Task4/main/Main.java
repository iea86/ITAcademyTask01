package by.training.tasks.aliv.simpleobjects.Task4.main;


import by.training.tasks.aliv.simpleobjects.Task4.model.Train;
import by.training.tasks.aliv.simpleobjects.Task4.service.TrainAction;
import by.training.tasks.aliv.simpleobjects.Task4.view.TrainInputConsole;
import by.training.tasks.aliv.simpleobjects.Task4.view.TrainView;

import java.util.List;


public class Main {

    public static void main(String[] args) {
        TrainView view = new TrainView();
        TrainInputConsole input = new TrainInputConsole();

        TrainAction action = new TrainAction();

        List<Train> trains;
        trains = input.create();

        // sort List by Train number and show it
        System.out.println("---------------------------------------");
        System.out.println("sort List by Train number and show it");
        action.sortByNumber(trains);
        view.print(trains);

        // get Train by it's number
        System.out.println("---------------------------------------");
        System.out.println("get Train by it's number");
        int trainNumber = input.inputTrainNumber();
        view.print(action.find(trains, trainNumber));

        // sort by Station and time
        System.out.println("---------------------------------------");
        System.out.println("sort by Station and time");
        action.sortByStationAndTime(trains);
        view.print(trains);

    }

}
