package by.training.tasks.aliv.mas;



import java.util.Random;

//14. Дан одномерный массив A[N].Найти сумму (max(четных элементов), min(нечетных элементов)

public class Task14 extends Task {

	@Override
	public void execute() {
		System.out.println("Task14");
		int[] mas = new int[10];
		int sum;
		fillArray(mas);
		printArray(mas);
		System.out.println();
		sum = getSum(mas);
		System.out.println(sum);
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

	public static int getMax(int[] mas) {
		int max = mas[0];
		for (int i = 0; i < mas.length; i++) {
			if (i % 2 == 0) {
				if (mas[i] > max) {
					max = mas[i];
				}
			}
		}
		return max;
	}

	public static int getMin(int[] mas) {
		int min = mas[1];
		for (int i = 3; i < mas.length; i++) {
			if (i % 2 != 0) {

				if (mas[i] < min) {
					min = mas[i];
				}
			}
		}
		return min;
	}

	public static int getSum(int[] mas) {
		int max;
		int min;
		int sum = 0;
		max = getMax(mas);
		min = getMin(mas);

		sum = max + min;

		return sum;
	}
}
