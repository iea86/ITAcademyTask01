package by.training.tasks.aliv.masmas;



import java.util.Random;

//28. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце.
//Определить, какой столбец содержит максимальную сумму

public class Task28 extends Task {

    @Override
    public void execute() {
        System.out.println("Task28");
        int[][] a = new int[5][5];
        int index;
        fillArray(a);
        printArray(a);
        System.out.println("--------------");
        int[] m = getSum(a);//массив содержит сумму по столбцам
        printArraySum(m);
        index = getColumnIndex(m);
        System.out.println();
        System.out.println("максимальную сумму содержит столбец=" + index);

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

    public static int[] getSum(int[][] a) {
        int[] sum = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                sum[j] = sum[j] + a[i][j];
            }

        }
        return sum;
    }

    public static void printArraySum(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
    }

    public static int getColumnIndex(int[] mas) {
        int max;
        int max_index = 0;
        max = mas[0];
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > max) {
                max_index = i;
                max = mas[i];
            }
        }

        return max_index;
    }

}

