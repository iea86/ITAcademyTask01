package by.training.tasks.aliv.mas;



import java.util.Random;

//16. Даны действительные числа. Найти  max(a1+a2, a3+a4, ..., an-1+an)

public class Task16 extends Task {

	@Override
	public void execute() {
		System.out.println("Task16");
		int[] mas = new int[10];

		fillArray(mas);
		printArray(mas);
		System.out.println();
		int[] a;
		a = getNewArray(mas);
		printArray(a);
		int max;
		max = getMax(a);
		System.out.println(max);

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

	public static int[] getNewArray(int[] mas) {
		int[] a = new int[mas.length / 2];
		int j = 0;
		for (int i = 0; i < mas.length; i = i + 2) {
			a[j] = mas[i] + mas[i + 1];
			j++;
		}
		return a;
	}

	public static int getMax(int[] mas) {
		int max = mas[0];

		for (int i = 1; i < mas.length; i++) {
			if (max < mas[i]) {
				max = mas[i];
			}
		}
		System.out.println();
		return max;

	}

}
