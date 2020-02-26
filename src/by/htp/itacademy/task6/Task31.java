package by.htp.itacademy.task5;

import java.util.Random;

//31. Сформировать матрицу из чисел от 0 до 999, вывести ее на экран. Посчитать количество двузначных чисел в ней.

public class Task31 extends Task {

    @Override
    public void execute() {
        System.out.println("Task31");
        int[][] a = new int[5][5];
        int count;

        fillArray(a);
        printArray(a);

        count=getCount(a);
        System.out.println(count);

    }

    public static void fillArray(int[][] a) {
        Random rand = new Random();

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = rand.nextInt(999);
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

    public static boolean isDvychznachnoe(int n) {
        double m;
        m = (double) n / 100;

        if ((m < 1) && (m >= 0.1)) {
            return true;
        }
        return false;

    }

    public static int getCount(int[][] a) {
        int count;
        count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (isDvychznachnoe(a[i][j])) {
                    count++;
                }
            }
        }
        return count;
    }
}
