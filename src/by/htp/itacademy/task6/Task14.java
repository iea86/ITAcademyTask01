package by.htp.itacademy.task6;

public class Task14 extends Task {

    @Override
    public void execute() {
        System.out.println("Task14");
        int n = 6;
        int[][] a = new int[n][n];
        fillArray(a);
        printArray(a);

    }

    public static void fillArray(int[][] a) {
        int k = 1;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i + j == a.length - 1) {
                    a[i][j] = k;
                    k = k + 1;
                } else {
                    a[i][j] = 0;
                }
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
