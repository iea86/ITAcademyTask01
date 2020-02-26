package by.training.tasks.aliv.masmas;



import java.util.Scanner;

//26. С клавиатуры вводится двумерный массив чисел размерностью nxm.
//Выполнить с массивом следующие действия:
//а) вычислить сумму отрицательных элементов в каждой строке;
//б) определить максимальный элемент в каждой строке;
//в) переставить местами максимальный и минимальный элементы матрицы.

public class Task26 extends Task {

    @Override
    public void execute() {
        System.out.println("Task26");
        int n = 5;
        int m = 4;
        int[][] mas = new int[n][m];
        fillArray(mas);
        printArray(mas);
        // printArraySum(getSum(mas));
        // printArraySum(getMax(mas));
        System.out.println("------------");
        printArray(changeArray(mas));

    }

    public static void fillArray(int[][] mas) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите элементы матрицы");

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.printf("a[%d][%d]=", i, j);
                mas[i][j] = sc.nextInt();
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
        int c = a.length;
        int s = 0;
        int[] sum = new int[c];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] < 0) {
                    s = s + a[i][j];
                }
            }
            sum[i] = s;
            s = 0;
        }
        return sum;
    }

    public static int[] getMax(int[][] a) {
        int c = a.length;
        int maximum;
        int[] max = new int[c];
        for (int i = 0; i < a.length; i++) {
            maximum = a[i][0];
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > maximum) {
                    maximum = a[i][j];
                }
            }
            max[i] = maximum;
        }
        return max;
    }

    public static void printArraySum(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            System.out.println(mas[i]);
        }
    }

    public static int[] getIndexOfMax(int[][] a) {
        int max;
        int imax = 0;
        int jmax = 0;
        int[] maxindex = new int[2];
        max = a[0][0];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                    imax = i;
                    jmax = j;
                }
            }
        }
        maxindex[0] = imax;
        maxindex[1] = jmax;

        return maxindex;

    }

    public static int[] getIndexOfMin(int[][] a) {
        int min;
        int imin = 0;
        int jmin = 0;
        int[] minindex = new int[2];
        min = a[0][0];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] < min) {
                    min = a[i][j];
                    imin = i;
                    jmin = j;
                }
            }
        }
        minindex[0] = imin;
        minindex[1] = jmin;

        return minindex;
    }

    public static int[][] changeArray(int[][] a) {
        int[] min = getIndexOfMin(a);
        int[] max = getIndexOfMax(a);

        int mina = a[min[0]][min[1]];
        int maxa = a[max[0]][max[1]];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] == mina) {
                    a[i][j] = maxa;
                } else if (a[i][j] == maxa) {
                    a[i][j] = mina;
                }
            }
        }
        return a;
    }
}
