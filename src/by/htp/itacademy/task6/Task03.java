package by.htp.itacademy.task6;

import java.util.Random;

//3. Дана матрица. Вывести на экран первый и последний столбцы.

public class Task03 extends Task {


    @Override
    public void execute()  {
        System.out.println("Task03");

        int n = 5;
        int m = 6;
        int[][] mas = new int[n][m];
        fillArray(mas);
        printArray(mas);
        System.out.println("--------------");
        int[] col = getColumn(mas, 0);
        printArrayOne(col);
        System.out.println();
        System.out.println("--------------");
        int[] col2 = getColumn(mas, m-1);
        printArrayOne(col2);

    }

    public static void fillArray(int[][] a) {
        Random rand = new Random();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = rand.nextInt(9);
            }
        }
    }

    public static int[] getColumn(int[][] a, int colNumber) {

        int l = a.length;
        int[] col = new int[l];

        int k = 0;

        for (int i = 0; i < a.length; i++) {
            col[k] = a[i][colNumber];
            k++;
        }

        return col;
    }

    public static void printArray(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printArrayOne(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
    }
}
