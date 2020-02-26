package by.htp.itacademy.task6;

//33. Отсортировать стобцы матрицы по возрастанию и убыванию значений эементов.

import java.util.Random;

public class Task33 extends Task {

    @Override
    public void execute() {
        System.out.println("Task33");
        int[][] a = new int[5][5];

        fillArray(a);
        printArray(a);
        sortVosr(a);
        System.out.println("----------------");
        printArray(a);

        sortUbuv(a);
        System.out.println("----------------");
        printArray(a);

    }

    public static void fillArray(int[][] a) {
        Random rand = new Random();

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = rand.nextInt(20);
            }
        }
    }

    public static void printArray(int[][] a) {

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf("%4d", a[i][j]);
            }
            System.out.println();
        }

    }

    public static void sortVosr(int[][] mas) {
        boolean isSorted;
        int buf;

        for (int j = 0; j < mas[0].length; j++) {
            isSorted = false;
            while (!isSorted) {
                isSorted = true;
                for (int i = 0; i < mas.length - 1; i++) {
                    if (mas[i][j] > mas[i + 1][j]) {
                        isSorted = false;

                        buf = mas[i][j];
                        mas[i][j] = mas[i + 1][j];
                        mas[i + 1][j] = buf;
                    }
                }
            }
        }
    }

    public static void sortUbuv(int[][] mas) {
        boolean isSorted;
        int buf;

        for (int j = 0; j < mas[0].length; j++) {
            isSorted = false;
            while (!isSorted) {
                isSorted = true;
                for (int i = 0; i < mas.length - 1; i++) {
                    if (mas[i][j] < mas[i + 1][j]) {
                        isSorted = false;

                        buf = mas[i][j];
                        mas[i][j] = mas[i + 1][j];
                        mas[i + 1][j] = buf;
                    }
                }
            }
        }

    }
}
