package by.training.tasks.aliv.oop.Task5.view;

import by.training.tasks.aliv.oop.Task5.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class View {

    public List<Voucher> create() {

        List<Voucher> offer = new ArrayList<Voucher>();

        Voucher v1 = new Voucher(Type.RELAX, Transport.SHIP, Meal.AL, Duration.TWENTY, 2000);
        Voucher v2 = new Voucher(Type.SHOPPING, Transport.BUS, Meal.HB, Duration.FOUR, 300);
        Voucher v3 = new Voucher(Type.TOUR, Transport.AIR, Meal.BB, Duration.ELEVEN, 1000);
        Voucher v4 = new Voucher(Type.WEEKEND, Transport.AIR, Meal.HB, Duration.TWO, 100);
        Voucher v5 = new Voucher(Type.WEEKEND, Transport.BUS, Meal.HB, Duration.TWO, 50);

        offer.add(v1);
        offer.add(v2);
        offer.add(v3);
        offer.add(v4);
        offer.add(v5);

        return offer;

    }

    public void print(List<Voucher> vouchers) {
        if (vouchers.size() == 0) {
            System.out.println("К сожалению у нас нет туров по выбранным опциям");
        } else {
            for (Voucher voucher : vouchers) {

                System.out.println(voucher.toString());
            }
        }

    }

    public int inputTransport() {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер транспорта: 1-AIR, 2-BUS, 3-RAIL, 4-CAR, 5-SHIP");

        int transportCode = sc.nextInt();

        return transportCode;

    }

    public int inputMeal() {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер транспорта: 1-HB,2-BB,3-AI");

        int mealCode = sc.nextInt();

        return mealCode;

    }

    public int inputDuration() {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер длительности:1-ONE,2-TWO,4-FOUR,8-EIGHT,10-TEN,11-ELEVEN,12-TWENTY");

        int durationCode = sc.nextInt();

        return durationCode;

    }

}
