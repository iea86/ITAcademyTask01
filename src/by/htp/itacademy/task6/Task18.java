package by.htp.itacademy.task6;

public class Task18  extends Task {

    @Override
    public void execute() {
        System.out.println("Task18");
        int[][] a = new int[5][5];
        fillArray(a);
        printArray(a);

    }

    public static void fillArray(int[][] a) {
        int k = 1;
        int l;
        l = a[0].length;

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < l; j++) {
                a[i][j] = k;
            }
            k++;
            l--;
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

