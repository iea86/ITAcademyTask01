package by.htp.itacademy.task6;

import java.util.Random;

//6. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
public class Task06 extends Task {

    @Override
    public void execute()  {
        System.out.println("Task06");
        int[][] a = new int[5][5];
        fillArray(a);
        printArray(a);
        get06(a);
    }

    public static void fillArray(int[][] a) {
        Random rand = new Random();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = rand.nextInt(9);
            }
        }
    }

    public static void printArray(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void get06(int[][] a) {
        int c;
        c = a.length;

        for (int j = 0; j < c; j++) {
            if (a[0][j] > a[c - 1][j]) {
                if (j % 2 != 0) {
                    System.out.println("-----");
                    printColumn(a, j);
                }
            }

        }

    }

    public static void printColumn(int[][] a, int n) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (j == n) {
                    System.out.println(a[i][j]);
                }
            }
        }

    }

}
