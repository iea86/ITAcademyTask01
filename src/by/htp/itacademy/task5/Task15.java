package by.training.tasks.aliv.mas;



import java.util.Random;

//15. Дана последовательность действительных чисел n . Указать те ее элементы, которые принадлежат отрезку [с, d].

public class Task15 extends Task {

	@Override
	public void execute() {
		System.out.println("Task15");
		int[] mas = new int[10];
		int c = 2;
		int d = 10;

		fillArray(mas);
		printArray(mas);
		System.out.println();
		printArray(getElement(mas, c, d));

	}

	public static void fillArray(int[] mas) {
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(20);
		}
	}

	public static void printArray(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
	}

	public static int[] getElement(int[] mas, int c, int d) {
		int count = 0;
		int j = 0;

		for (int i = 0; i < mas.length; i++) {
			if ((mas[i] >= c) && (mas[i] <= d)) {
				count++;
			}
		}

		int[] a = new int[count];

		for (int i = 0; i < mas.length; i++) {
			if ((mas[i] >= c) && (mas[i] <= d)) {
				a[j] = mas[i];
				j++;
			}

		}

		return a;

	}
}
