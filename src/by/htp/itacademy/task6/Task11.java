package by.training.tasks.aliv.masmas;

import java.util.Random;

//11. Дана матрица размера m x n. Вывести ее элементы в следующем порядке: первая строка справа налево,
//вторая строка слева направо, третья строка справа налево и так далее.

public class Task11 extends Task {

    @Override
    public void execute() {
        System.out.println("Task11");
        int[][] a = new int[5][5];
        fillArray(a);
        printArray(a);
        System.out.println("----------------");
        newArray(a);

    }

    public static void fillArray(int[][] a) {
        Random rand = new Random();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = rand.nextInt(10);
            }
        }
    }

    public static void printArray(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf("%3d", a[i][j]);
            }
            System.out.println();
        }
    }

    public static void newArray(int[][] a) {

        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                for (int j = a[i].length - 1; j >= 0; j--) {
                    {
                        System.out.printf("%3d", a[i][j]);
                    }
                }

            } else {
                for (int j = 0; j < a[i].length; j++) {
                    {
                        System.out.printf("%3d", a[i][j]);
                    }
                }
            }
            System.out.println();
        }
    }
}

