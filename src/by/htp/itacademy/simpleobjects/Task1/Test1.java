package by.training.tasks.aliv.simpleobjects.Task1;

public class Test1 {
    private int n;
    private int m;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getSum() {
        int sum;
        sum = n + m;

        return sum;
    }

    public int getMax() {
        if (m > n) {
            return m;
        } else {
            return n;
        }
    }

    public void showValues() {
        System.out.println(m);
        System.out.println(n);

    }
}
