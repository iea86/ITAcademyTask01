package by.training.tasks.aliv.masmas;



import java.util.Random;
import java.util.Scanner;

//27. В числовой матрице поменять местами два столбца любых столбца,
//т. е. все элементы одного столбца поставить на соответствующие им позиции другого,
//а его элементы второго переместить в первый. Номера столбцов вводит пользователь с клавиатуры.

public class Task27 extends Task {

    @Override
    public void execute() {
        System.out.println("Task27");
        int[][] a = new int[5][5];
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номера столбцов, которые надо поменять:");
        System.out.print(">>");
        int n = sc.nextInt();
        System.out.print(">>");
        int m = sc.nextInt();

        fillArray(a);
        printArray(a);
        System.out.println("------------");
        printArray(changeArray(a, n, m));

    }

    public static void fillArray(int[][] a) {
        Random rand = new Random();

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = rand.nextInt(10);

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

    public static int[][] changeArray(int[][] a, int n, int m) {
        int bufer;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                bufer = a[i][n];
                a[i][n] = a[i][m];
                a[i][m] = bufer;
            }
        }
        return a;
    }

}

