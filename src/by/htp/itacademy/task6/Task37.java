package by.htp.itacademy.task5;

import java.util.Random;

//37. Переставить строки матрицы случайным образом.

public class Task37 extends Task {

    @Override
    public void execute() {
        System.out.println("Task37");
        int[][] mas = new int[5][5];

        fillArray(mas);
        printArray(mas);
        System.out.println("--------------");

        int[][] newarray = newArray(mas);
        printArray(newarray);

    }

    public static int[] uniqueRandomArray(int[][] a) {

        int n = a.length;// количество строк
        int[] order = new int[n];
        for (int i = 0; i < order.length;) {
            int b = (int) (Math.random() * n) + 1;

            if (isNew(order, b) == true) {
                order[i] = b;
                i++;
            }
        }
        return order;
    }

    public static boolean isNew(int[] order, int n) {
        for (int i = 0; i < order.length; i++) {
            if (order[i] == n) {
                return false;
            }
        }
        return true;
    }

    public static void fillArray(int[][] a) {
        Random rand = new Random();

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = rand.nextInt(15);
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

    public static int[][] newArray(int[][] a) {
        int k;
        int n = 0;
        int r;
        int c;
        int[] order = uniqueRandomArray(a);
        r = a.length;
        c = a[0].length;
        int[][] newarray = new int[r][c];
        for (int i = 0; i < a.length; i++) {
            k = order[n] - 1;
            for (int j = 0; j < a[i].length; j++) {
                newarray[k][j] = a[i][j];

            }
            n++;
        }
        return newarray;
    }

}
