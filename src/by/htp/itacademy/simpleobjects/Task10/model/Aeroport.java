package by.training.tasks.aliv.simpleobjects.Task10.model;


import java.util.List;

public class Aeroport {
private List<Airplane> airplanes;

    public Aeroport(List<Airplane> airplanes) {
        this.airplanes = airplanes;
    }

    public List<Airplane> getAirplanes() {
        return airplanes;
    }

    public void setAirplanes(List<Airplane> airplanes) {
        this.airplanes = airplanes;
    }
}
