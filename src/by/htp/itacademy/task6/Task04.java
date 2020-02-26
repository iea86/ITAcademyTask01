package by.htp.itacademy.task6;

import java.util.Random;

//4. Дана матрица. Вывести на экран первую и последнюю строки.

public class Task04 extends Task {

    @Override
    public void execute()  {
        System.out.println("Task04");
        int[][] a = new int[4][4];
        fillArray(a);
        printArray(a);
        //System.out.println("--------");
        getFirstAndLastRow(a);

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

    public static void getFirstAndLastRow(int[][] a) {

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if ((i == 0) || (i == a.length - 1)) {
                    System.out.print(a[i][j] + " ");
                }
            }
            System.out.println();
        }

    }
}
