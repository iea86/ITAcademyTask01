package by.training.tasks.aliv.masmas;

import java.util.Random;

//32. Отсортировать строки матрицы по возрастанию и убыванию значений элементов.

public class Task32 extends Task {

    @Override
    public void execute() {
        System.out.println("Task32");
        int[][] a = new int[5][5];

        fillArray(a);
        printArray(a);
        sortVosrMas(a);
        System.out.println("----------------");
        printArray(a);

        sortUbuvMas(a);
        System.out.println("----------------");
        printArray(a);

    }

    public static void fillArray(int[][] a) {
        Random rand = new Random();

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = rand.nextInt(999);
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

    public static void sortVosr(int[] mas) {
        boolean isSorted = false;

        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] > mas[i + 1]) {
                    isSorted = false;

                    buf = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = buf;
                }
            }
        }
    }

    public static void sortVosrMas(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            int[] k=a[i];
            sortVosr(k);
        }
    }

    public static void sortUbuv(int[] mas) {
        boolean isSorted = false;

        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] < mas[i + 1]) {
                    isSorted = false;

                    buf = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = buf;
                }
            }
        }
    }

    public static void sortUbuvMas(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            int[] k=a[i];
            sortUbuv(k);
        }
    }
}
