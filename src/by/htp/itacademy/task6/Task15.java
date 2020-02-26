package by.training.tasks.aliv.masmas;


public class Task15  extends Task {

    @Override
    public void execute() {
        System.out.println("Task15");
        int[][] a = new int[5][5];
        fillArray(a);
        printArray(a);

    }

    public static void fillArray(int[][] a) {
        int n = a.length;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i == j) {
                    a[i][j] = n;
                    n--;
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
