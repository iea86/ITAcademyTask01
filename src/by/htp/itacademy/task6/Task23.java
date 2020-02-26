package by.training.tasks.aliv.masmas;

public class Task23 extends Task {

    @Override
    public void execute() {
        System.out.println("Task22");
        int n = 7;
        int count;
        double[][] mas = new double[n][n];

        fillArray(mas);
        printArray(mas);

        count = getCount(mas);
        System.out.println(" количество положительных элементов =" + count);

    }

    public static void fillArray(double[][] a) {
        int n = a[0].length;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = Math.sin((i * i - j * j) / n);
            }
        }
    }

    public static int getCount(double[][] a) {
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void printArray(double[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}
