package by.htp.itacademy.task6;

//10. Дана матрица. Вывести k-ю строку и p-й столбец матрицы

import java.util.Random;

public class Task10 extends Task {

    @Override
    public void execute() {
        System.out.println("Task10");
        int[][] a = new int[5][5];
        int k = 3;
        int p = 4;
        fillArray(a);
        printArray(a);
        getRow(a, k);
        System.out.println();
        System.out.println("----------");
        getCol(a, p);
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

    public static void getRow(int[][] a, int k) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i == k)
                    System.out.print(a[i][j] + " ");
            }

        }

    }

    public static void getCol(int[][] a, int p) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (j == p)
                    System.out.print(a[i][j] + " ");
            }

        }

    }
}

