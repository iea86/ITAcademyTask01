package by.htp.itacademy.task5;

import java.util.Random;

//3. Дана последовательность целых чисел а1 а2,..., аn .
//Выяснить, какое число встречается раньше - положительное или отрицательное.

public class Task03 extends Task {

	@Override
	public void execute() {
		System.out.println("Task03");
		int[] a = new int[10];
		fillArray(a);
		printArray(a);
		getFirst(a);
	}

	public static void fillArray(int[] a) {
		Random rand = new Random();
		for (int i = 0; i < a.length; i++) {
			a[i] = rand.nextInt(10);
		}
	}

	public static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static void getFirst(int[] a) {
		if (a[0] >= 0) {
			System.out.println("раньше встречается положительное число");
		} else {
			System.out.println("раньше встречается отрицательное число");
		}
	}

}
