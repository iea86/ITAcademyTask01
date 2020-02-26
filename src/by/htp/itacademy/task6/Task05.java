package by.htp.itacademy.task6;
import java.util.Random;

//5. Дана матрица. Вывести на экран все четные строки, то есть с четными номерами.

public class Task05 extends Task {


    @Override
    public void execute()  {
        System.out.println("Task05");
        int[][] a = new int[4][4];
        fillArray(a);
        printArray(a);
        System.out.println("--------");
        getEvenRows(a);

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

    public static void getEvenRows(int[][] a) {

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i % 2 == 0) {
                    System.out.print(a[i][j] + " ");
                }
            }
            System.out.println();
        }

    }
}
