package by.training.tasks.aliv.mas;

//17. Дана последовательность целых чисел n aaa ,,, 21  . Образовать новую последовательность, выбросив из исходной те члены, которые равны ) ,, ,min( 21 n aa a  .



import java.util.Random;

public class Task17 extends Task {

	@Override
	public void execute() {
		System.out.println("Task17");
		int[] mas = new int[10];

		fillArray(mas);
		printArray(mas);
		System.out.println();
		printArray(getNewArray(mas));

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

	public static int getMin(int[] mas) {
		int min;
		min = mas[0];
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] < min) {
				min = mas[i];
			}
		}
		return min;
	}

	public static int[] getNewArray(int[] mas) {
		int min;
		int count = 0;
		int j = 0;
		min = getMin(mas);

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] != min) {
				count++;
			}
		}

		int[] a = new int[count];

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] != min) {
				a[j] = mas[i];
				j++;
			}
		}

		return a;
	}

}
