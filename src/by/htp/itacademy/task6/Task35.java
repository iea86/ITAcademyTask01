package by.htp.itacademy.task5;

import java.util.Random;

//35. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него

public class Task35 extends Task {

    @Override
    public void execute() {
        System.out.println("Task35");
        int[][] mas = new int[6][7];
        fillArray(mas);
        printArray(mas);
        System.out.println("----------------------------");
        changeArray(mas);
        int[][] newmas = changeArray(mas);
        printArray(newmas);
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

    public static int getMax(int[][] a) {
        int max;
        max = a[0][0];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                }
            }
        }
        return max;
    }

    public static int[][] changeArray(int[][] a) {
        int max;
        max = getMax(a);

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] % 2 != 0) {
                    a[i][j] = max;
                }
            }
        }
        return a;
    }
}

