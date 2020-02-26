package by.htp.itacademy.task6;


public class Task17 extends Task {

    @Override
    public void execute() {
        System.out.println("Task17");
        int[][] a = new int[5][5];
        fillArray(a);
        printArray(a);

    }

    public static void fillArray(int[][] a) {

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if ((i == 0) || (i == a.length - 1) || (j == 0) || (j == a.length - 1)) {
                    a[i][j] = 1;
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
