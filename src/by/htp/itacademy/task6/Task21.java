package by.htp.itacademy.task6;

public class Task21 extends Task {

    @Override
    public void execute() {
        System.out.println("Task21");
        int n = 7;
        int[][] mas = new int[n][n];

        fillArray(mas);
        printArray(mas);
    }

    public static void fillArray(int[][] a) {
        int m = 1;
        int n;
        int l=a[0].length;

        for (int i = a.length - 1; i >=0; i--) {
            n=m;
            for (int j = 0; j < l; j++) {
                a[i][j] = n;
                n++;
            }
            l--;
            m++;
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
