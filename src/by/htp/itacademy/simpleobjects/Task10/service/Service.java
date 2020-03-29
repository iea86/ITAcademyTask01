package by.training.tasks.aliv.simpleobjects.Task10.service;

import by.training.tasks.aliv.simpleobjects.Task10.model.Aeroport;
import by.training.tasks.aliv.simpleobjects.Task10.model.Airplane;
import by.training.tasks.aliv.simpleobjects.Task10.model.Time;

import java.util.ArrayList;
import java.util.List;

public class Service {

    public List<Airplane> getByCity(Aeroport aeroport, String destination) {
        List<Airplane> airplanes = aeroport.getAirplanes();
        List<Airplane> results = new ArrayList<Airplane>();
        for (Airplane a : airplanes) {
            if (a.getDestination().equals(destination)) {
                results.add(a);
            }
        }
        return results;

    }

    public List<Airplane> getByDayOfWeek(Aeroport aeroport, int day) {
        List<Airplane> airplanes = aeroport.getAirplanes();
        List<Airplane> results = new ArrayList<Airplane>();
        for (Airplane a : airplanes) {
            int[] days = a.getDaysOfWeek();
            for (int i = 0; i < days.length; i++) {
                if (days[i] == day) {
                    results.add(a);
                }
            }
        }
        return results;
    }


}
