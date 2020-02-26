package by.htp.itacademy.task5;


//34. Сформировать случайную матрицу m x n, состоящую из нулей и единиц,
//причем в каждом столбце число единиц равно номеру столбца.

public class Task34 extends Task {

    @Override
    public void execute() {
        System.out.println("Task34");
        int m = 6;
        int n = 5;
        int[][] a = new int[m][n];

        fillArray(a);
        printArray(a);
    }

    public static void fillArray(int[][] a) {

        for (int j = 0; j < a[0].length; j++) {
            for (int k = 0; k < j; k++) {
                a[k][j] = 1;
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

}

