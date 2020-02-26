package by.htp.itacademy.task5;


import java.util.Random;

//36. Операция сглаживания матрицы дает новую матрицу того же размера,
//каждый элемент которой получается как среднее арифметическое соседей соответствующего элемента исходной матрицы.
//Построить результат сглаживания заданной матрицы

public class Task36 extends Task {

    @Override
    public void execute() {
        System.out.println("Task36");
        int[][] a = new int[5][6];
        fillArray(a);
        printArray(a);
        double[][] newArray = getnewArray(a);
        printNewArray(newArray);

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

    public static void printNewArray(double[][] a) {

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static double getAvg(int[][] a, int i, int j) {
        int sum;
        sum = 0;
        int count;
        count = 0;
        for (int k = i - 1; k <= i + 1; k++) {
            for (int l = j - 1; l <= j + 1; l++) {
                if (k < 0 || l < 0 || k == a.length || l == a[0].length || (k == i && l == j)) {
                    continue;
                } else {
                    sum = sum + a[k][l];
                    count++;
                }
            }
        }
        double avg=  sum / count;

        return avg;
    }

    public static double[][] getnewArray(int[][] a) {
        double[][] newarray = new double[5][6];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                newarray[i][j] = getAvg(a, i, j);
            }
        }


        return newarray;
    }

}
