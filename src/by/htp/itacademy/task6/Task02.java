package by.training.tasks.aliv.masmas;

import java.util.Random;

//2. Создать и вывести на экран матрицу 2 x 3, заполненную случайными числами из [0, 9].

public class Task02 extends Task {

    @Override
    public void execute() {
        System.out.println("Task02");
        int[][] mas = new int[2][3];
        fillArray(mas);
        printArray(mas);

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
}