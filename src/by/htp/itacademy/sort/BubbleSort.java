package by.htp.itacademy.sort;

import java.util.Random;

//4. Сортировка обменами (пузырьком). 

public class BubbleSort {

	public static void main(String[] args) {

		int[] mas = new int[10];
		fillArray(mas);
		printArray(mas);
		System.out.println();
		System.out.println("----------------");
		sortArray(mas);
		printArray(mas);

	}

	public static void fillArray(int[] mas) {
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(100);
		}
	}

	public static void printArray(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
	}

	public static void sortArray(int[] mas) {

		boolean isSorted = false;

		int buf;
		while (!isSorted) {
			isSorted = true;
			for (int i = 0; i < mas.length - 1; i++) {
				if (mas[i] > mas[i + 1]) {
					isSorted = false;

					buf = mas[i];
					mas[i] = mas[i + 1];
					mas[i + 1] = buf;
				}
			}
		}
	}

}
