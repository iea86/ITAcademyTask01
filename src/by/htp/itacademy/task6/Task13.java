package by.htp.itacademy.task6;

public class Task13 extends Task {

    @Override
    public void execute() {
        System.out.println("Task13");
        int[][] a = new int[5][5];
        fillArray(a);
        printArray(a);

    }

    public static void fillArray(int[][] a) {
        int n = a.length;
        int k = 1;
        for (int i = 0; i < a.length; i++) {

            if (i % 2 == 0) {
                for (int j = 0; j < a[i].length; j++) {
                    a[i][j] = k;
                    k++;
                }
            } else {
                for (int j = 0; j < a[i].length; j++) {
                    a[i][j] = n;
                    n--;
                }
            }
            n = a.length;
            k = 1;
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

