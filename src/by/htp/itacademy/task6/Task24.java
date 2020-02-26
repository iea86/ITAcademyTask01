package by.training.tasks.aliv.masmas;



import java.util.Random;

public class Task24 extends Task {

    @Override
    public void execute() {
        System.out.println("Task24");
        int n = 6;
        int[] a = new int[n];
        int[][] mas = new int[n][n];
        fillArrayA(a);
        printArrayA(a);
        System.out.println();
        System.out.println("----------------");
        fillArrayMas(mas, a);
        printArrayMas(mas);

    }

    public static void fillArrayA(int[] mas) {
        Random rand = new Random();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = rand.nextInt(10);
        }
    }

    public static void fillArrayMas(int[][] mas, int[] a) {

        int k = 0;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = (int) Math.pow(a[k], i+1);
                k++;
            }
            k = 0;
        }
    }

    public static void printArrayMas(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf("%7d", a[i][j]);
            }
            System.out.println();
        }
    }

    public static void printArrayA(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
    }
}
