package by.htp.itacademy.task6;



import java.util.Random;

//29. Найти положительные элементы главной диагонали квадратной матрицы.

public class Task29 extends Task {

    @Override
    public void execute() {
        System.out.println("Task29");
        int[][] a = new int[5][5];

        fillArray(a);
        printArray(a);
        System.out.println("--------------------");
        int[] d = getArray(a);
        printArrayD(d);

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
                System.out.printf("%2d", a[i][j]);
            }
            System.out.println();
        }
    }

    public static int[] getArray(int[][] a) {
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if ((i == j) && (a[i][j] > 0)) {
                    count++;
                }
            }
        }

        int[] d = new int[count];
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if ((i == j) && (a[i][j] > 0)) {
                    d[k] = a[i][j];
                    k++;
                }
            }

        }
        return d;

    }

    public static void printArrayD(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
    }
}
