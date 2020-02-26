package by.htp.itacademy.task6;

import java.util.Random;

//30. Матрицу 10x20 заполнить случайными числами от 0 до 15.
//Вывести на экран саму матрицу и номера строк, в которых число 5 встречается три и более раз.

public class Task30 extends Task {

    @Override
    public void execute() {
        System.out.println("Task30");
        int[][] a = new int[10][20];

        fillArray(a);
        printArray(a);
        int[] d = getArray(a);
        getRows(d);

    }

    public static void fillArray(int[][] a) {
        Random rand = new Random();

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = rand.nextInt(15);
            }
        }
    }

    public static int[] getArray(int[][] a) {
        int count = 0;
        int[] r = new int[10];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] == 5) {
                    count++;
                }
            }
            r[i] = count;
            count = 0;
        }
        return r;
    }

    public static void printArray(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf("%4d", a[i][j]);
            }
            System.out.println();
        }
    }

    public static void getRows(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] >= 3) {
                System.out.println(i);
            }
        }
    }
}

