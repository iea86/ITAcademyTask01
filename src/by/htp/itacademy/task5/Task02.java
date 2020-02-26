package by.htp.itacademy.task5;


import java.util.Random;

//2. В целочисленной последовательности есть нулевые элементы. Создать массив из номеров этих элементов. 

public class Task02 extends Task {

	@Override
	public void execute() {
		System.out.println("Task02");
		int[] a = new int[10];
		fillArray(a);
		printArray(a);
		System.out.println();
		System.out.println("---------------");
		getArray(a);

	}

	public static void fillArray(int[] a) {
		Random rand = new Random();
		for (int i = 0; i < a.length; i++) {
			if (i % 2 == 0) {
				a[i] = 0;
			} else {
				a[i] = rand.nextInt(10);
			}
		}
	}

	public static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static void getArray(int[] a) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				count++;
			}
		}

		int[] mas = new int[count];
		int j = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				mas[j] = i;
				j++;
			}
		}

		printArray(mas);

	}

}
