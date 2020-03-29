package by.training.tasks.aliv.simpleobjects.Task10.model;

import java.util.Arrays;

public class Airplane {

    private String destination;
    private int number;
    private String type;
    private Time time;
    private int[] daysOfWeek;

    public Airplane(String destination, int number, String type, Time time, int[] daysOfWeek) {
        this.destination = destination;
        this.number = number;
        this.type = type;
        this.time = time;
        this.daysOfWeek = daysOfWeek;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public int[] getDaysOfWeek() {
        return daysOfWeek;
    }

    public void setDaysOfWeek(int[] daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "destination='" + destination + '\'' +
                ", number=" + number +
                ", type='" + type + '\'' +
                ", time=" + time +
                ", daysOfWeek=" + Arrays.toString(daysOfWeek) +
                '}';
    }
}