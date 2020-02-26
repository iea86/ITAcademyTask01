package by.training.tasks.aliv.masmas;

import java.util.Random;

//8. Дан двухмерный массив n×m элементов.
//Определить, сколько раз встречается число 7 среди элементов массива.

public class Task08 extends Task {

    @Override
    public void execute() {
        System.out.println("Task08");
        int[][] a = new int[5][5];
        fillArray(a);
        printArray(a);
        int count;
        count = getCount(a);
        System.out.println(count);
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

    public static int getCount(int[][] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] == 7) {
                    count++;
                }
            }
        }

        return count;
    }

}
