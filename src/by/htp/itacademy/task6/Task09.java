package by.training.tasks.aliv.masmas;

import java.util.Random;

//9. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали

public class Task09 extends Task {

    @Override
    public void execute() {
        System.out.println("Task09");
        int[][] a = new int[5][5];
        fillArray(a);
        printArray(a);
        getDiagonal(a);
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

    public static void getDiagonal(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i == j) {
                    System.out.println(a[i][j]);
                }
            }
        }

    }
}

