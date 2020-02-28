package by.htp.itacademy.sort;

import java.util.Random;

public class EnterSort {

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
		int temp;
		int j;
		for (int i = 0; i < mas.length; i++) {
			temp = mas[i];
			for (j = i - 1; j >= 0 && mas[j] > temp; j--) {
				mas[j + 1] = mas[j];
			}
			mas[j + 1] = temp;
		}

	}
}
