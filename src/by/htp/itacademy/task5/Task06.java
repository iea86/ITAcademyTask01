package by.training.tasks.aliv.mas;

//6. Дана последовательность чисел а1 ,а2 ,..., ап. Указать наименьшую длину числовой оси, содержащую все эти числа. 



import java.util.Random;

public class Task06 extends Task {

	@Override
	public void execute() {
		System.out.println("Task06");
		int max;
		int[] mas = new int[8];
		fillArray(mas);
		printArray(mas);
		max = getMax(mas);
		System.out.println("------");
		System.out.println(max);

	}

	public static void fillArray(int[] mas) {
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(100);
		}
	}

	public static void printArray(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.println(mas[i]);
		}
	}

	public static int getMax(int[] mas) {
		int max;
		max = mas[0];
		for (int i = 1; i < mas.length; i++) {
			if (mas[i] > max) {
				max = mas[i];
			}
		}
		return max;
	}

}
