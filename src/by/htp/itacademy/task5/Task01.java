package by.htp.itacademy.task5;


import java.util.Random;

//1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К. 

public class Task01 extends Task {

	@Override
	public void execute() {
		System.out.println("Task01");
		int[] mas = new int[10];
		fillArray(mas);
		printArray(mas);
		int k = 2;
		int sum;
		sum = getSum(mas, k);
		System.out.println();
		System.out.println("сумма элементов="+sum);
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

	public static int getSum(int[] mas, int k) {
		int sum = 0;
		for (int i = 1; i < mas.length; i++) {
			if (mas[i] % k == 0) {
				sum = sum + mas[i];
			}
		}

		return sum;
	}
}
