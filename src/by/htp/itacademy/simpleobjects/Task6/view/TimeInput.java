package by.training.tasks.aliv.simpleobjects.Task6.view;

import by.training.tasks.aliv.simpleobjects.Task6.model.Time;

import java.util.Scanner;


public class TimeInput {

    public Time create() {

        Time t = new Time(12, 15, 30);

        return t;
    }

    public void print(Time t) {
        System.out.println(t.toString());
    }

    public int inputHour() {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите час:");

        int number = sc.nextInt();

        return number;

    }

    public int inputMinute() {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите минуты:");

        int number = sc.nextInt();

        return number;

    }

    public int inputSeconds() {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите секунды:");

        int number = sc.nextInt();

        return number;

    }


}
