package by.training.tasks.aliv.masmas;

//1. Cоздать матрицу 3 x 4, заполнить ее числами 0 и 1 так, чтобы в одной строке была ровно одна единица, и вывести на экран.

public class Task01 extends Task {

    @Override
    public void execute() {
        System.out.println("Task01");
        int[][] mas = new int[3][4];

        fillArray(mas);
        printArray(mas);

    }

    public static void fillArray(int[][] a) {

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (j == 0) {
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
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }
}
