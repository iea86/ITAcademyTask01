package by.training.tasks.aliv.masmas;


//38. Найдите сумму двух матриц

import java.util.Random;

public class Task38 extends Task {

    @Override
    public void execute() {
        System.out.println("Task38");
        int[][] masfirst = new int[3][3];
        int[][] massecond = new int[3][3];

        fillArray(masfirst);
        fillArray(massecond);

        printArray(masfirst);
        System.out.println("-------------");
        printArray(massecond);

        int[][] masthird= sumArray(masfirst, massecond);
        System.out.println("-------------");
        printArray(masthird);

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

    public static int[][] sumArray(int[][] masfirst, int[][] massecond) {
        int[][] masthird = new int[3][3];
        for (int i = 0; i < masfirst.length; i++) {
            for (int j = 0; j < masfirst[i].length; j++) {
                masthird[i][j] = masfirst[i][j] + massecond[i][j];
            }

        }
        return masthird;

    }

}
