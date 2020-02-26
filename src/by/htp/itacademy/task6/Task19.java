package by.htp.itacademy.task6;

public class Task19 extends Task {

    @Override
    public void execute() {
        System.out.println("Task19");
        int n=9;
        int[][] a = new int[n][n];
        fillArrayOnePart(a);
        fillArraySecondPart(a);
        printArray(a);

    }

    public static void fillArrayOnePart(int[][] a) {
        int m = a.length;
        int k=0;
        for (int i = 0; i < a.length; i++) {
            for (int j = k; j < m; j++) {
                a[i][j]=1;
            }
            k++;
            m--;
        }
    }

    public static void fillArraySecondPart(int[][] a) {
        int m = a.length;
        int k=0;
        for (int i = a.length-1; i > 0; i--) {
            for (int j = k; j < m; j++) {
                a[i][j]=1;
            }
            k++;
            m--;
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
}

