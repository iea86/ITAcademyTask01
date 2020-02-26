package by.htp.itacademy.task6;



public class Task25 extends Task {

    @Override
    public void execute() {
        System.out.println("Task25");
        int n = 4;
        int[][] mas = new int[n][n];
        fillArray(mas);
        printArray(mas);
    }

    public static void fillArray(int[][] mas) {
        int n = 1;

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = n;
                n++;
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
