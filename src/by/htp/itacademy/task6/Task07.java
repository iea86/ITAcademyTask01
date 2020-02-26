package by.training.tasks.aliv.masmas;


import java.util.Random;

//7. Дан двухмерный массив 5×5. Найти сумму модулей отрицательных нечетных элементов.

public class Task07 extends Task {


    @Override
    public void execute()  {
        System.out.println("Task07");
        int sum;
        int[][] a = new int[5][5];
        fillArray(a);
        printArray(a);

        sum = getSum(a);
        System.out.println(sum);

    }

    public static int getSum(int[][] a)

    {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if ((a[i][j] < 0) && (a[i][j] % 2 != 0)) {
                    sum = sum + Math.abs(a[i][j]);
                }
            }
        }
        return sum;
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
