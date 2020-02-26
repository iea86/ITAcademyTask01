package by.htp.itacademy.task6;

//39. Найдите произведение двух матриц.
import java.util.Random;

public class Task39 extends Task {

    @Override
    public void execute() {
        System.out.println("Task39");
        int[][] masfirst = new int[3][3];
        int[][] massecond = new int[3][3];

        fillArray(masfirst);
        fillArray(massecond);

        printArray(masfirst);
        System.out.println("-------------");
        printArray(massecond);

        int[][] masthird = mltArray(masfirst, massecond);
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

    public static int[][] mltArray(int[][] masfirst, int[][] massecond) {
        int m = masfirst.length;
        int n = masfirst[0].length;
        int k = massecond.length;
        int l = massecond[0].length;
        if (n != k) {
            System.out.println("Матрицы умножать нельзя");
        }
        int[][] masthird = new int[m][l];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < l; j++) {
                masthird[i][j] = 0;
                for (int s = 0; s < n; s++) {
                    masthird[i][j] += masfirst[i][s] * massecond[s][j];
                }
            }
        }
        return masthird;
    }

}

