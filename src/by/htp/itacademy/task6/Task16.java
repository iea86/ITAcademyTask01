package by.htp.itacademy.task6;

public class Task16 extends Task {

    @Override
    public void execute() {
        System.out.println("Task16");
        int[][] a = new int[5][5];
        fillArray(a);
        printArray(a);

    }

    public static void fillArray(int[][] a) {
        int n = 1;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i == j) {
                    a[i][j] = n*(n+1);
                    n++;
                } else {
                    a[i][j] = 0;
                }
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
}
