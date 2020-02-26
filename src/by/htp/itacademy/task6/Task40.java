package by.training.tasks.aliv.masmas;


//Магическим квадратом порядка n называется квадратная матрица размера nxn,
//составленная из чисел 1, 2, 3, ..., 2 n так, что суммы по каждому столбцу,
//каждой строке и каждой из двух больших диагоналей равны между собой. Построить такой квадрат. Пример магического квадрата порядка 3:

public class Task40 extends Task {

    @Override
    public void execute() {
        System.out.println("Task40");
        int n = 4;

        int[][] a = new int[n][n];
        fillArray(a, n * n);
        System.out.println("------------");
        printArray(a);

        boolean isMagic = isMagicQ(a);
        System.out.println(isMagic);

    }

    public static void fillArray(int[][] a, int k) {

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; ) {
                int b = (int) (Math.random() * k) + 1;
                if (isNew(a, b) == true) {
                    a[i][j] = b;
                    j++;
                }
            }
        }
    }

    public static boolean isNew(int[][] a, int n) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] == n) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void printArray(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf("%3d", a[i][j]);
            }
            System.out.println();
        }
    }

    public static int getSumStr(int[][] a) {
        int[] str = new int[a.length];
        int sum = 0;
        int k = 0;

        for (int i = 0; i < a.length; i++) {
            sum = 0;
            for (int j = 0; j < a[i].length; j++) {
                sum = sum + a[i][j];

            }
            str[k] = sum;
            k++;
        }

        for (int i = 0; i < str.length - 1; i++) {

            if (str[i] != str[i + 1]) {
                return 0;
            }

        }

        return str[0];

    }

    public static int getSumCol(int[][] a) {
        int[] col = new int[a.length];
        int sum = 0;
        int k = 0;

        for (int j = 0; j < a.length; j++) {
            sum = 0;
            for (int i = 0; i < a.length; i++) {
                sum = sum + a[i][j];

            }
            col[k] = sum;
            k++;

        }

        for (int i = 0; i < col.length - 1; i++) {

            if (col[i] != col[i + 1]) {
                return 0;
            }

        }

        return col[0];

    }

    public static int getSumD1(int[][] a) {
        int sum;
        sum = 0;

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a[i].length; j++) {
                if (i == j) {
                    sum = sum + a[i][j];
                }
            }
        }
        return sum;

    }

    public static int getSumD2(int[][] a) {
        int sum;
        sum = 0;

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a[i].length; j++) {
                if (i == a.length - j - 1) {
                    sum = sum + a[i][j];
                }
                ;

            }

        }
        return sum;

    }

    public static boolean isMagicQ(int[][] a) {

        int sumStr;
        sumStr = getSumStr(a);

        int sumCol;
        sumCol = getSumCol(a);

        int sum1;
        sum1 = getSumD1(a);

        int sum2;
        sum2 = getSumD2(a);

        if ((sumStr == sumCol) && (sumCol == sum1) && (sum1 == sum2)) {
            return true;
        }

        return false;

    }
}

